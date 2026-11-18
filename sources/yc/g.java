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
import org.telegram.ui.Components.vg;
public final class g implements Closeable {
    public final f f61160a;
    public final String f61161b;
    public final InputStream f61162c;
    public final long d;
    public final vg f61163e = new vg(this, 1);
    public final HashMap f61164f = new HashMap();
    public int h;
    public boolean f61165n;
    public boolean f61166r;
    public boolean f61167s;

    public g(f fVar, String str, InputStream inputStream, long j3) {
        boolean z10;
        this.f61160a = fVar;
        this.f61161b = str;
        this.f61162c = inputStream;
        this.d = j3;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f61165n = z10;
        this.f61167s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f61164f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f61162c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j3;
        String str;
        String str2 = this.f61161b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        f fVar = this.f61160a;
        try {
            if (fVar != null) {
                String str3 = new b(str2).f61139c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + fVar.f61158a + " " + fVar.f61159b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f61163e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f61167s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f61166r = false;
                }
                if (this.f61166r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f61165n = true;
                }
                InputStream inputStream = this.f61162c;
                if (inputStream != null) {
                    j3 = this.d;
                } else {
                    j3 = 0;
                }
                if (this.h != 5 && this.f61165n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f61166r) {
                    j3 = f(printWriter, j3);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f61165n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f61166r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f61166r) {
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
                int read = this.f61162c.read(bArr, 0, (int) min);
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

    public final void g(boolean z10) {
        this.f61166r = z10;
    }

    public final void h(boolean z10) {
        this.f61167s = z10;
    }

    public final void i(int i7) {
        this.h = i7;
    }
}
