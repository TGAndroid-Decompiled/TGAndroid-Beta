package yc;

import e6.n;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
public abstract class i {
    public static final Logger d;
    public volatile ServerSocket f49961a;
    public Thread f49962b;
    public n f49963c;

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        d = Logger.getLogger(i.class.getName());
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e7) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e7);
            return null;
        }
    }

    public static g c(f fVar, String str, String str2) {
        String str3;
        byte[] bArr;
        b bVar = new b(str);
        if (str2 == null) {
            return new g(fVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String str4 = "US-ASCII";
        String str5 = bVar.f49931c;
        if (str5 == null) {
            str3 = "US-ASCII";
        } else {
            str3 = str5;
        }
        try {
            if (!Charset.forName(str3).newEncoder().canEncode(str2) && str5 == null) {
                bVar = new b(str + "; charset=UTF-8");
            }
            String str6 = bVar.f49931c;
            if (str6 != null) {
                str4 = str6;
            }
            bArr = str2.getBytes(str4);
        } catch (UnsupportedEncodingException e7) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e7);
            bArr = new byte[0];
        }
        return new g(fVar, bVar.f49929a, new ByteArrayInputStream(bArr), bArr.length);
    }

    public static final void d(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e7) {
                d.log(Level.SEVERE, "Could not close", (Throwable) e7);
            }
        }
    }

    public static boolean g(g gVar) {
        String str = gVar.f49953b;
        if (str != null) {
            if (str.toLowerCase().contains("text/") || str.toLowerCase().contains("/json")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public abstract g e(d dVar);

    public final void f() {
        this.f49961a = new ServerSocket();
        this.f49961a.setReuseAddress(true);
        ki.h hVar = new ki.h(this);
        Thread thread = new Thread(hVar);
        this.f49962b = thread;
        thread.setDaemon(true);
        this.f49962b.setName("NanoHttpd Main Listener");
        this.f49962b.start();
        while (!hVar.f15003b && ((IOException) hVar.f15004c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) hVar.f15004c;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }
}
