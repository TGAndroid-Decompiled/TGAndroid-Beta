package vc;

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
import org.telegram.ui.Components.eg;
public final class g implements Closeable {
    public final f f56544a;
    public final String f56545b;
    public final InputStream f56546c;
    public final long d;
    public final eg f56547e = new eg(this, 1);
    public final HashMap f56548f = new HashMap();
    public int h;
    public boolean f56549n;
    public boolean f56550r;
    public boolean f56551s;

    public g(f fVar, String str, InputStream inputStream, long j10) {
        boolean z10;
        this.f56544a = fVar;
        this.f56545b = str;
        this.f56546c = inputStream;
        this.d = j10;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f56549n = z10;
        this.f56551s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f56548f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f56546c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j10;
        String str;
        String str2 = this.f56545b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        f fVar = this.f56544a;
        try {
            if (fVar != null) {
                String str3 = new b(str2).f56523c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + fVar.f56542a + " " + fVar.f56543b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f56547e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f56551s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f56550r = false;
                }
                if (this.f56550r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f56549n = true;
                }
                InputStream inputStream = this.f56546c;
                if (inputStream != null) {
                    j10 = this.d;
                } else {
                    j10 = 0;
                }
                if (this.h != 5 && this.f56549n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f56550r) {
                    j10 = f(printWriter, j10);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f56549n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f56550r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f56550r) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    e(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    e(outputStream, j10);
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

    public final void e(OutputStream outputStream, long j10) {
        boolean z10;
        long min;
        byte[] bArr = new byte[(int) 16384];
        if (j10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        while (true) {
            if (j10 > 0 || z10) {
                if (z10) {
                    min = 16384;
                } else {
                    min = Math.min(j10, 16384L);
                }
                int read = this.f56546c.read(bArr, 0, (int) min);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z10) {
                    j10 -= read;
                }
            } else {
                return;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j10) {
        String a10 = a("content-length");
        if (a10 != null) {
            try {
                j10 = Long.parseLong(a10);
            } catch (NumberFormatException unused) {
                i.d.severe("content-length was no number ".concat(a10));
            }
        }
        printWriter.print("Content-Length: " + j10 + "\r\n");
        return j10;
    }

    public final void g(boolean z10) {
        this.f56550r = z10;
    }

    public final void h(boolean z10) {
        this.f56551s = z10;
    }

    public final void i(int i3) {
        this.h = i3;
    }
}
