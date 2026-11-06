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
import li.z3;
public final class d {
    public final z3 f59267a;
    public final OutputStream f59268b;
    public final BufferedInputStream f59269c;
    public int d;
    public int f59270e;
    public String f59271f;
    public int f59272g;
    public HashMap h;
    public HashMap f59273i;
    public c f59274j;
    public final String f59275k;
    public String f59276l;
    public final i f59277m;

    public d(i iVar, z3 z3Var, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f59277m = iVar;
        this.f59267a = z3Var;
        this.f59269c = new BufferedInputStream(inputStream, 8192);
        this.f59268b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f59275k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f59273i = new HashMap();
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

    public static int d(int i7, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i7) {
                return 0;
            }
            byte b10 = bArr[i11];
            if (b10 == 13 && bArr[i12] == 10 && (i10 = i11 + 3) < i7 && bArr[i11 + 2] == 13 && bArr[i10] == 10) {
                return i11 + 4;
            }
            if (b10 == 10 && bArr[i12] == 10) {
                return i11 + 2;
            }
            i11 = i12;
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
                        this.f59276l = stringTokenizer.nextToken();
                    } else {
                        this.f59276l = "HTTP/1.1";
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
        } catch (IOException e10) {
            throw new h("SERVER INTERNAL ERROR: IOException: " + e10.getMessage(), e10);
        }
    }

    public final void c() {
        boolean z9;
        f fVar = f.INTERNAL_ERROR;
        i iVar = this.f59277m;
        z3 z3Var = this.f59267a;
        BufferedInputStream bufferedInputStream = this.f59269c;
        OutputStream outputStream = this.f59268b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z10 = false;
                        this.d = 0;
                        this.f59270e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                i.d(bufferedInputStream);
                                i.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i7 = this.f59270e + read;
                                this.f59270e = i7;
                                int d = d(i7, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i10 = this.f59270e;
                                read = bufferedInputStream.read(bArr, i10, 8192 - i10);
                            }
                            if (this.d < this.f59270e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.f59273i;
                            if (hashMap == null) {
                                this.f59273i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f59270e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f59273i);
                            String str = this.f59275k;
                            if (str != null) {
                                this.f59273i.put("remote-addr", str);
                                this.f59273i.put("http-client-ip", str);
                            }
                            int b10 = rf.b.b((String) hashMap2.get("method"));
                            this.f59272g = b10;
                            if (b10 != 0) {
                                this.f59271f = (String) hashMap2.get("uri");
                                this.f59274j = new c(this.f59273i);
                                String str2 = (String) this.f59273i.get("connection");
                                if ("HTTP/1.1".equals(this.f59276l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                g e10 = iVar.e(this);
                                String str3 = (String) this.f59273i.get("accept-encoding");
                                this.f59274j.f();
                                e10.i(this.f59272g);
                                if (i.g(e10) && str3 != null && str3.contains("gzip")) {
                                    z10 = true;
                                }
                                e10.g(z10);
                                e10.h(z9);
                                e10.d(outputStream);
                                if (z9 && !e10.b()) {
                                    i.d(e10);
                                    z3Var.b();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new h("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e11) {
                            throw e11;
                        } catch (IOException unused) {
                            i.d(bufferedInputStream);
                            i.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (h e12) {
                        i.c(e12.a(), "text/plain", e12.getMessage()).d(outputStream);
                        i.d(outputStream);
                        i.d(null);
                        z3Var.b();
                    }
                } catch (SSLException e13) {
                    i.c(fVar, "text/plain", "SSL PROTOCOL FAILURE: " + e13.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    z3Var.b();
                } catch (IOException e14) {
                    i.c(fVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e14.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    z3Var.b();
                }
            } catch (SocketException e15) {
                throw e15;
            } catch (SocketTimeoutException e16) {
                throw e16;
            }
        } catch (Throwable th2) {
            i.d(null);
            z3Var.b();
            throw th2;
        }
    }
}
