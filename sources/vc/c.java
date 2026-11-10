package vc;

import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
public final class c extends SSLSocketFactory {
    public final SSLSocketFactory f57327a = HttpsURLConnection.getDefaultSSLSocketFactory();
    public final boolean f57328b;
    public final boolean f57329c;

    public c() {
        String[] strArr;
        try {
            strArr = SSLContext.getDefault().getSupportedSSLParameters().getProtocols();
        } catch (NoSuchAlgorithmException unused) {
            strArr = new String[0];
        }
        boolean z9 = false;
        boolean z10 = false;
        for (String str : strArr) {
            if (str.equals("TLSv1.1")) {
                z9 = true;
            } else if (str.equals("TLSv1.2")) {
                z10 = true;
            }
        }
        this.f57328b = z9;
        this.f57329c = z10;
    }

    public final Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getEnabledProtocols()));
        if (this.f57328b) {
            hashSet.add("TLSv1.1");
        }
        if (this.f57329c) {
            hashSet.add("TLSv1.2");
        }
        sSLSocket.setEnabledProtocols((String[]) hashSet.toArray(new String[0]));
        return sSLSocket;
    }

    @Override
    public final Socket createSocket(Socket socket, String str, int i7, boolean z9) {
        return a(this.f57327a.createSocket(socket, str, i7, z9));
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        return this.f57327a.getDefaultCipherSuites();
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return this.f57327a.getSupportedCipherSuites();
    }

    @Override
    public final Socket createSocket(String str, int i7) {
        return a(this.f57327a.createSocket(str, i7));
    }

    @Override
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i10) {
        return a(this.f57327a.createSocket(str, i7, inetAddress, i10));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i7) {
        return a(this.f57327a.createSocket(inetAddress, i7));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i10) {
        return a(this.f57327a.createSocket(inetAddress, i7, inetAddress2, i10));
    }
}
