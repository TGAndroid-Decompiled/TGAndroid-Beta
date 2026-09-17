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
import org.telegram.ui.Components.yg;
public final class g implements Closeable {
    public final f f49982a;
    public final String f49983b;
    public final InputStream f49984c;
    public final long d;
    public final yg f49985e = new yg(this, 1);
    public final HashMap f49986f = new HashMap();
    public int h;
    public boolean f49987n;
    public boolean f49988r;
    public boolean f49989s;

    public g(f fVar, String str, InputStream inputStream, long j3) {
        boolean z10;
        this.f49982a = fVar;
        this.f49983b = str;
        this.f49984c = inputStream;
        this.d = j3;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49987n = z10;
        this.f49989s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f49986f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override
    public final void close() {
        InputStream inputStream = this.f49984c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        long j3;
        String str;
        String str2 = this.f49983b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        f fVar = this.f49982a;
        try {
            if (fVar != null) {
                String str3 = new b(str2).f49961c;
                if (str3 == null) {
                    str3 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str3)), false);
                PrintWriter append = printWriter.append((CharSequence) "HTTP/1.1 ");
                append.append((CharSequence) ("" + fVar.f49980a + " " + fVar.f49981b)).append((CharSequence) " \r\n");
                if (str2 != null) {
                    c(printWriter, "Content-Type", str2);
                }
                if (a("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f49985e.entrySet()) {
                    c(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (a("connection") == null) {
                    if (this.f49989s) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    c(printWriter, "Connection", str);
                }
                if (a("content-length") != null) {
                    this.f49988r = false;
                }
                if (this.f49988r) {
                    c(printWriter, "Content-Encoding", "gzip");
                    this.f49987n = true;
                }
                InputStream inputStream = this.f49984c;
                if (inputStream != null) {
                    j3 = this.d;
                } else {
                    j3 = 0;
                }
                if (this.h != 5 && this.f49987n) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f49988r) {
                    j3 = f(printWriter, j3);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.h != 5 && this.f49987n) {
                    ?? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f49988r) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        e(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        e(filterOutputStream, -1L);
                    }
                    filterOutputStream.a();
                } else if (this.f49988r) {
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
                int read = this.f49984c.read(bArr, 0, (int) min);
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
        this.f49988r = z10;
    }

    public final void h(boolean z10) {
        this.f49989s = z10;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
