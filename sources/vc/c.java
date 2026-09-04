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
    public final SSLSocketFactory f47775a = HttpsURLConnection.getDefaultSSLSocketFactory();
    public final boolean f47776b;
    public final boolean f47777c;

    public c() {
        String[] strArr;
        try {
            strArr = SSLContext.getDefault().getSupportedSSLParameters().getProtocols();
        } catch (NoSuchAlgorithmException unused) {
            strArr = new String[0];
        }
        boolean z10 = false;
        boolean z11 = false;
        for (String str : strArr) {
            if (str.equals("TLSv1.1")) {
                z10 = true;
            } else if (str.equals("TLSv1.2")) {
                z11 = true;
            }
        }
        this.f47776b = z10;
        this.f47777c = z11;
    }

    public final Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getEnabledProtocols()));
        if (this.f47776b) {
            hashSet.add("TLSv1.1");
        }
        if (this.f47777c) {
            hashSet.add("TLSv1.2");
        }
        sSLSocket.setEnabledProtocols((String[]) hashSet.toArray(new String[0]));
        return sSLSocket;
    }

    @Override
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        return a(this.f47775a.createSocket(socket, str, i10, z10));
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        return this.f47775a.getDefaultCipherSuites();
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return this.f47775a.getSupportedCipherSuites();
    }

    @Override
    public final Socket createSocket(String str, int i10) {
        return a(this.f47775a.createSocket(str, i10));
    }

    @Override
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return a(this.f47775a.createSocket(str, i10, inetAddress, i11));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i10) {
        return a(this.f47775a.createSocket(inetAddress, i10));
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return a(this.f47775a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
