package sc;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;
import p4.r;
public final class d {
    public final r f48162a;
    public final OutputStream f48163b;
    public final BufferedInputStream f48164c;
    public int d;
    public int e;
    public String f48165f;
    public int f48166g;
    public HashMap h;
    public HashMap f48167i;
    public c f48168j;
    public final String f48169k;
    public String f48170l;
    public final j f48171m;

    public d(j jVar, r rVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f48171m = jVar;
        this.f48162a = rVar;
        this.f48164c = new BufferedInputStream(inputStream, 8192);
        this.f48163b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f48169k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f48167i = new HashMap();
    }

    public static void b(String str, Map map) {
        String trim;
        String str2;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    trim = j.b(nextToken.substring(0, indexOf)).trim();
                    str2 = j.b(nextToken.substring(indexOf + 1));
                } else {
                    trim = j.b(nextToken).trim();
                    str2 = "";
                }
                List list = (List) map.get(trim);
                if (list == null) {
                    list = new ArrayList();
                    map.put(trim, list);
                }
                list.add(str2);
            }
        }
    }

    public static int d(int i10, byte[] bArr) {
        int i11;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i10) {
                return 0;
            }
            byte b10 = bArr[i12];
            if (b10 == 13 && bArr[i13] == 10 && (i11 = i12 + 3) < i10 && bArr[i12 + 2] == 13 && bArr[i11] == 10) {
                return i12 + 4;
            }
            if (b10 == 10 && bArr[i13] == 10) {
                return i12 + 2;
            }
            i12 = i13;
        }
    }

    public final void a(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        String b10;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine);
            if (stringTokenizer.hasMoreTokens()) {
                hashMap.put("method", stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    int indexOf = nextToken.indexOf(63);
                    if (indexOf >= 0) {
                        b(nextToken.substring(indexOf + 1), hashMap2);
                        b10 = j.b(nextToken.substring(0, indexOf));
                    } else {
                        b10 = j.b(nextToken);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        this.f48170l = stringTokenizer.nextToken();
                    } else {
                        this.f48170l = "HTTP/1.1";
                        j.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                    }
                    String readLine2 = bufferedReader.readLine();
                    while (readLine2 != null && !readLine2.trim().isEmpty()) {
                        int indexOf2 = readLine2.indexOf(58);
                        if (indexOf2 >= 0) {
                            hashMap3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                        }
                        readLine2 = bufferedReader.readLine();
                    }
                    hashMap.put("uri", b10);
                    return;
                }
                throw new i("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            throw new i("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
        } catch (IOException e) {
            throw new i("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void c() {
        boolean z10;
        g gVar = g.INTERNAL_ERROR;
        j jVar = this.f48171m;
        r rVar = this.f48162a;
        BufferedInputStream bufferedInputStream = this.f48164c;
        OutputStream outputStream = this.f48163b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z11 = false;
                        this.d = 0;
                        this.e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                j.d(bufferedInputStream);
                                j.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i10 = this.e + read;
                                this.e = i10;
                                int d = d(i10, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i11 = this.e;
                                read = bufferedInputStream.read(bArr, i11, 8192 - i11);
                            }
                            if (this.d < this.e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.f48167i;
                            if (hashMap == null) {
                                this.f48167i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f48167i);
                            String str = this.f48169k;
                            if (str != null) {
                                this.f48167i.put("remote-addr", str);
                                this.f48167i.put("http-client-ip", str);
                            }
                            int b10 = e.b((String) hashMap2.get("method"));
                            this.f48166g = b10;
                            if (b10 != 0) {
                                this.f48165f = (String) hashMap2.get("uri");
                                this.f48168j = new c(this.f48167i);
                                String str2 = (String) this.f48167i.get("connection");
                                if ("HTTP/1.1".equals(this.f48170l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                h e = jVar.e(this);
                                String str3 = (String) this.f48167i.get("accept-encoding");
                                this.f48168j.l();
                                e.i(this.f48166g);
                                if (j.g(e) && str3 != null && str3.contains("gzip")) {
                                    z11 = true;
                                }
                                e.g(z11);
                                e.h(z10);
                                e.d(outputStream);
                                if (z10 && !e.b()) {
                                    j.d(e);
                                    rVar.clear();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new i("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e7) {
                            throw e7;
                        } catch (IOException unused) {
                            j.d(bufferedInputStream);
                            j.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (i e10) {
                        j.c(e10.a(), "text/plain", e10.getMessage()).d(outputStream);
                        j.d(outputStream);
                        j.d(null);
                        rVar.clear();
                    }
                } catch (SSLException e11) {
                    j.c(gVar, "text/plain", "SSL PROTOCOL FAILURE: " + e11.getMessage()).d(outputStream);
                    j.d(outputStream);
                    j.d(null);
                    rVar.clear();
                } catch (IOException e12) {
                    j.c(gVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage()).d(outputStream);
                    j.d(outputStream);
                    j.d(null);
                    rVar.clear();
                }
            } catch (SocketException e13) {
                throw e13;
            } catch (SocketTimeoutException e14) {
                throw e14;
            }
        } catch (Throwable th2) {
            j.d(null);
            rVar.clear();
            throw th2;
        }
    }
}
