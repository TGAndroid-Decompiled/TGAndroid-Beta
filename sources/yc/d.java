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
import org.telegram.messenger.fz;
public final class d {
    public final fz f61183a;
    public final OutputStream f61184b;
    public final BufferedInputStream f61185c;
    public int d;
    public int f61186e;
    public String f61187f;
    public int f61188g;
    public HashMap h;
    public HashMap f61189i;
    public c f61190j;
    public final String f61191k;
    public String f61192l;
    public final i f61193m;

    public d(i iVar, fz fzVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f61193m = iVar;
        this.f61183a = fzVar;
        this.f61185c = new BufferedInputStream(inputStream, 8192);
        this.f61184b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f61191k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f61189i = new HashMap();
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
                        this.f61192l = stringTokenizer.nextToken();
                    } else {
                        this.f61192l = "HTTP/1.1";
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
        boolean z10;
        f fVar = f.INTERNAL_ERROR;
        i iVar = this.f61193m;
        fz fzVar = this.f61183a;
        BufferedInputStream bufferedInputStream = this.f61185c;
        OutputStream outputStream = this.f61184b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z11 = false;
                        this.d = 0;
                        this.f61186e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                i.d(bufferedInputStream);
                                i.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i7 = this.f61186e + read;
                                this.f61186e = i7;
                                int d = d(i7, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i10 = this.f61186e;
                                read = bufferedInputStream.read(bArr, i10, 8192 - i10);
                            }
                            if (this.d < this.f61186e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.f61189i;
                            if (hashMap == null) {
                                this.f61189i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f61186e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f61189i);
                            String str = this.f61191k;
                            if (str != null) {
                                this.f61189i.put("remote-addr", str);
                                this.f61189i.put("http-client-ip", str);
                            }
                            int c10 = p5.c.c((String) hashMap2.get("method"));
                            this.f61188g = c10;
                            if (c10 != 0) {
                                this.f61187f = (String) hashMap2.get("uri");
                                this.f61190j = new c(this.f61189i);
                                String str2 = (String) this.f61189i.get("connection");
                                if ("HTTP/1.1".equals(this.f61192l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                g e10 = iVar.e(this);
                                String str3 = (String) this.f61189i.get("accept-encoding");
                                this.f61190j.f();
                                e10.i(this.f61188g);
                                if (i.g(e10) && str3 != null && str3.contains("gzip")) {
                                    z11 = true;
                                }
                                e10.g(z11);
                                e10.h(z10);
                                e10.d(outputStream);
                                if (z10 && !e10.b()) {
                                    i.d(e10);
                                    fzVar.a();
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
                        fzVar.a();
                    }
                } catch (SSLException e13) {
                    i.c(fVar, "text/plain", "SSL PROTOCOL FAILURE: " + e13.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    fzVar.a();
                } catch (IOException e14) {
                    i.c(fVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e14.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    fzVar.a();
                }
            } catch (SocketException e15) {
                throw e15;
            } catch (SocketTimeoutException e16) {
                throw e16;
            }
        } catch (Throwable th2) {
            i.d(null);
            fzVar.a();
            throw th2;
        }
    }
}
