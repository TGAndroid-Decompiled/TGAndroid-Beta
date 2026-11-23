package yc;

import a8.va;
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
import org.telegram.ui.ActionBar.v;
public abstract class i {
    public static final Logger d;
    public volatile ServerSocket f61179a;
    public Thread f61180b;
    public va f61181c;

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        d = Logger.getLogger(i.class.getName());
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e10);
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
        String str5 = bVar.f61149c;
        if (str5 == null) {
            str3 = "US-ASCII";
        } else {
            str3 = str5;
        }
        try {
            if (!Charset.forName(str3).newEncoder().canEncode(str2) && str5 == null) {
                bVar = new b(str + "; charset=UTF-8");
            }
            String str6 = bVar.f61149c;
            if (str6 != null) {
                str4 = str6;
            }
            bArr = str2.getBytes(str4);
        } catch (UnsupportedEncodingException e10) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e10);
            bArr = new byte[0];
        }
        return new g(fVar, bVar.f61147a, new ByteArrayInputStream(bArr), bArr.length);
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
            } catch (IOException e10) {
                d.log(Level.SEVERE, "Could not close", (Throwable) e10);
            }
        }
    }

    public static boolean g(g gVar) {
        String str = gVar.f61171b;
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
        this.f61179a = new ServerSocket();
        this.f61179a.setReuseAddress(true);
        v vVar = new v(this);
        Thread thread = new Thread(vVar);
        this.f61180b = thread;
        thread.setDaemon(true);
        this.f61180b.setName("NanoHttpd Main Listener");
        this.f61180b.start();
        while (!vVar.f30073b && ((IOException) vVar.f30074c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) vVar.f30074c;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }
}
