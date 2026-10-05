package yc;

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
public final class d {
    public final n2.c f50831a;
    public final OutputStream f50832b;
    public final BufferedInputStream f50833c;
    public int d;
    public int f50834e;
    public String f50835f;
    public int f50836g;
    public HashMap h;
    public HashMap f50837i;
    public c f50838j;
    public final String f50839k;
    public String f50840l;
    public final i f50841m;

    public d(i iVar, n2.c cVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f50841m = iVar;
        this.f50831a = cVar;
        this.f50833c = new BufferedInputStream(inputStream, 8192);
        this.f50832b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f50839k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f50837i = new HashMap();
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
                    trim = i.b(nextToken.substring(0, indexOf)).trim();
                    str2 = i.b(nextToken.substring(indexOf + 1));
                } else {
                    trim = i.b(nextToken).trim();
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
                        b10 = i.b(nextToken.substring(0, indexOf));
                    } else {
                        b10 = i.b(nextToken);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        this.f50840l = stringTokenizer.nextToken();
                    } else {
                        this.f50840l = "HTTP/1.1";
                        i.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
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
                throw new h("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            throw new h("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
        } catch (IOException e7) {
            throw new h("SERVER INTERNAL ERROR: IOException: " + e7.getMessage(), e7);
        }
    }

    public final void c() {
        boolean z10;
        f fVar = f.INTERNAL_ERROR;
        i iVar = this.f50841m;
        n2.c cVar = this.f50831a;
        BufferedInputStream bufferedInputStream = this.f50833c;
        OutputStream outputStream = this.f50832b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z11 = false;
                        this.d = 0;
                        this.f50834e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                i.d(bufferedInputStream);
                                i.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i10 = this.f50834e + read;
                                this.f50834e = i10;
                                int d = d(i10, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i11 = this.f50834e;
                                read = bufferedInputStream.read(bArr, i11, 8192 - i11);
                            }
                            if (this.d < this.f50834e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.f50837i;
                            if (hashMap == null) {
                                this.f50837i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f50834e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f50837i);
                            String str = this.f50839k;
                            if (str != null) {
                                this.f50837i.put("remote-addr", str);
                                this.f50837i.put("http-client-ip", str);
                            }
                            int b10 = sa.e.b((String) hashMap2.get("method"));
                            this.f50836g = b10;
                            if (b10 != 0) {
                                this.f50835f = (String) hashMap2.get("uri");
                                this.f50838j = new c(this.f50837i);
                                String str2 = (String) this.f50837i.get("connection");
                                if ("HTTP/1.1".equals(this.f50840l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                g e7 = iVar.e(this);
                                String str3 = (String) this.f50837i.get("accept-encoding");
                                this.f50838j.i();
                                e7.i(this.f50836g);
                                if (i.g(e7) && str3 != null && str3.contains("gzip")) {
                                    z11 = true;
                                }
                                e7.g(z11);
                                e7.h(z10);
                                e7.d(outputStream);
                                if (z10 && !e7.b()) {
                                    i.d(e7);
                                    cVar.d();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new h("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e10) {
                            throw e10;
                        } catch (IOException unused) {
                            i.d(bufferedInputStream);
                            i.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (h e11) {
                        i.c(e11.a(), "text/plain", e11.getMessage()).d(outputStream);
                        i.d(outputStream);
                        i.d(null);
                        cVar.d();
                    }
                } catch (SSLException e12) {
                    i.c(fVar, "text/plain", "SSL PROTOCOL FAILURE: " + e12.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    cVar.d();
                } catch (IOException e13) {
                    i.c(fVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e13.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    cVar.d();
                }
            } catch (SocketException e14) {
                throw e14;
            } catch (SocketTimeoutException e15) {
                throw e15;
            }
        } catch (Throwable th2) {
            i.d(null);
            cVar.d();
            throw th2;
        }
    }
}
