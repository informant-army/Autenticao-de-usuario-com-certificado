<%@page import="java.security.cert.X509Certificate"%>
<%
Object o = request.getAttribute("javax.servlet.request.X509Certificate");
if (o != null) {
X509Certificate certs[] = (X509Certificate[]) o;
X509Certificate cert = certs[0];
%>
<%= cert.getSubjectDN().getName() %>
<%
} else {
%>
Object was null.
<%
}
%>
