package zc;

import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;
import org.telegram.ui.Components.ah;
public final class g implements Closeable {
    public final f f54434a;
    public final String f54435b;
    public final InputStream f54436c;
    public final long d;
    public final ah f54437e = new ah(this, 1);
    public final HashMap f54438f = new HashMap();
    public int h;
    public boolean f54439n;
    public boolean f54440r;
    public boolean f54441s;

    public g(f fVar, String str, InputStream inputStream, long j3) {
        boolean z10;
        this.f54434a = fVar;
        this.f54435b = str;
        this.f54436c = inputStream;
        this.d = j3;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f54439n = z10;
        this.f54441s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f54438f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f54436c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j3;
        String str;
        String str2 = this.f54435b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        f fVar = this.f54434a;
        try {
            if (fVar != null) {
                String str3 = new b(str2).f54413c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + fVar.f54432a + " " + fVar.f54433b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f54437e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f54441s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f54440r = false;
                }
                if (this.f54440r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f54439n = true;
                }
                InputStream inputStream = this.f54436c;
                if (inputStream != null) {
                    j3 = this.d;
                } else {
                    j3 = 0;
                }
                if (this.h != 5 && this.f54439n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f54440r) {
                    j3 = f(printWriter, j3);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f54439n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f54440r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f54440r) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    e(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    e(outputStream, j3);
                }
                outputStream.flush();
                i.d(inputStream);
                return;
            }
            throw new Error("sendResponse(): Status can't be null.");
        } catch (IOException e7) {
            i.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e7);
        }
    }

    public final void e(OutputStream outputStream, long j3) {
        boolean z10;
        long min;
        byte[] bArr = new byte[(int) 16384];
        if (j3 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        while (true) {
            if (j3 > 0 || z10) {
                if (z10) {
                    min = 16384;
                } else {
                    min = Math.min(j3, 16384L);
                }
                int read = this.f54436c.read(bArr, 0, (int) min);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z10) {
                    j3 -= read;
                }
            } else {
                return;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j3) {
        String a2 = a("content-length");
        if (a2 != null) {
            try {
                j3 = Long.parseLong(a2);
            } catch (NumberFormatException unused) {
                i.d.severe("content-length was no number ".concat(a2));
            }
        }
        printWriter.print("Content-Length: " + j3 + "\r\n");
        return j3;
    }

    public final void g(boolean z10) {
        this.f54440r = z10;
    }

    public final void h(boolean z10) {
        this.f54441s = z10;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
