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
import org.telegram.ui.Components.wg;
public final class g implements Closeable {
    public final f f46712a;
    public final String f46713b;
    public final InputStream f46714c;
    public final long d;
    public final wg e = new wg(this, 1);
    public final HashMap f46715f = new HashMap();
    public int h;
    public boolean f46716n;
    public boolean f46717r;
    public boolean f46718s;

    public g(f fVar, String str, InputStream inputStream, long j3) {
        boolean z10;
        this.f46712a = fVar;
        this.f46713b = str;
        this.f46714c = inputStream;
        this.d = j3;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46716n = z10;
        this.f46718s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f46715f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f46714c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j3;
        String str;
        String str2 = this.f46713b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        f fVar = this.f46712a;
        try {
            if (fVar != null) {
                String str3 = new b(str2).f46693c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + fVar.f46710a + " " + fVar.f46711b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f46718s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f46717r = false;
                }
                if (this.f46717r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f46716n = true;
                }
                InputStream inputStream = this.f46714c;
                if (inputStream != null) {
                    j3 = this.d;
                } else {
                    j3 = 0;
                }
                if (this.h != 5 && this.f46716n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f46717r) {
                    j3 = f(printWriter, j3);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f46716n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f46717r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f46717r) {
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
        } catch (IOException e) {
            i.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
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
                int read = this.f46714c.read(bArr, 0, (int) min);
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
        this.f46717r = z10;
    }

    public final void h(boolean z10) {
        this.f46718s = z10;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
