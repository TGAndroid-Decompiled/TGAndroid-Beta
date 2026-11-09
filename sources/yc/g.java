package yc;

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
import org.telegram.ui.Components.gg;
public final class g implements Closeable {
    public final f f59389a;
    public final String f59390b;
    public final InputStream f59391c;
    public final long d;
    public final gg f59392e = new gg(this, 1);
    public final HashMap f59393f = new HashMap();
    public int h;
    public boolean f59394n;
    public boolean f59395r;
    public boolean f59396s;

    public g(f fVar, String str, InputStream inputStream, long j3) {
        boolean z9;
        this.f59389a = fVar;
        this.f59390b = str;
        this.f59391c = inputStream;
        this.d = j3;
        if (j3 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59394n = z9;
        this.f59396s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f59393f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f59391c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j3;
        String str;
        String str2 = this.f59390b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        f fVar = this.f59389a;
        try {
            if (fVar != null) {
                String str3 = new b(str2).f59368c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + fVar.f59387a + " " + fVar.f59388b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f59392e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f59396s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f59395r = false;
                }
                if (this.f59395r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f59394n = true;
                }
                InputStream inputStream = this.f59391c;
                if (inputStream != null) {
                    j3 = this.d;
                } else {
                    j3 = 0;
                }
                if (this.h != 5 && this.f59394n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f59395r) {
                    j3 = f(printWriter, j3);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f59394n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f59395r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f59395r) {
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
        } catch (IOException e10) {
            i.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e10);
        }
    }

    public final void e(OutputStream outputStream, long j3) {
        boolean z9;
        long min;
        byte[] bArr = new byte[(int) 16384];
        if (j3 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        while (true) {
            if (j3 > 0 || z9) {
                if (z9) {
                    min = 16384;
                } else {
                    min = Math.min(j3, 16384L);
                }
                int read = this.f59391c.read(bArr, 0, (int) min);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z9) {
                    j3 -= read;
                }
            } else {
                return;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j3) {
        String a10 = a("content-length");
        if (a10 != null) {
            try {
                j3 = Long.parseLong(a10);
            } catch (NumberFormatException unused) {
                i.d.severe("content-length was no number ".concat(a10));
            }
        }
        printWriter.print("Content-Length: " + j3 + "\r\n");
        return j3;
    }

    public final void g(boolean z9) {
        this.f59395r = z9;
    }

    public final void h(boolean z9) {
        this.f59396s = z9;
    }

    public final void i(int i7) {
        this.h = i7;
    }
}
