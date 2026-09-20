package yc;

import c5.m;
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
import v7.j0;
public final class d {
    public final m f46975a;
    public final OutputStream f46976b;
    public final BufferedInputStream f46977c;
    public int d;
    public int e;
    public String f46978f;
    public int f46979g;
    public HashMap h;
    public HashMap f46980i;
    public c f46981j;
    public final String f46982k;
    public String f46983l;
    public final i f46984m;

    public d(i iVar, m mVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f46984m = iVar;
        this.f46975a = mVar;
        this.f46977c = new BufferedInputStream(inputStream, 8192);
        this.f46976b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f46982k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f46980i = new HashMap();
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
                        this.f46983l = stringTokenizer.nextToken();
                    } else {
                        this.f46983l = "HTTP/1.1";
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
        } catch (IOException e) {
            throw new h("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void c() {
        boolean z10;
        f fVar = f.INTERNAL_ERROR;
        i iVar = this.f46984m;
        m mVar = this.f46975a;
        BufferedInputStream bufferedInputStream = this.f46977c;
        OutputStream outputStream = this.f46976b;
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
                                i.d(bufferedInputStream);
                                i.d(outputStream);
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
                            HashMap hashMap = this.f46980i;
                            if (hashMap == null) {
                                this.f46980i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f46980i);
                            String str = this.f46982k;
                            if (str != null) {
                                this.f46980i.put("remote-addr", str);
                                this.f46980i.put("http-client-ip", str);
                            }
                            int b10 = j0.b((String) hashMap2.get("method"));
                            this.f46979g = b10;
                            if (b10 != 0) {
                                this.f46978f = (String) hashMap2.get("uri");
                                this.f46981j = new c(this.f46980i);
                                String str2 = (String) this.f46980i.get("connection");
                                if ("HTTP/1.1".equals(this.f46983l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                g e = iVar.e(this);
                                String str3 = (String) this.f46980i.get("accept-encoding");
                                this.f46981j.i();
                                e.i(this.f46979g);
                                if (i.g(e) && str3 != null && str3.contains("gzip")) {
                                    z11 = true;
                                }
                                e.g(z11);
                                e.h(z10);
                                e.d(outputStream);
                                if (z10 && !e.b()) {
                                    i.d(e);
                                    mVar.a();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new h("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e7) {
                            throw e7;
                        } catch (IOException unused) {
                            i.d(bufferedInputStream);
                            i.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (h e10) {
                        i.c(e10.a(), "text/plain", e10.getMessage()).d(outputStream);
                        i.d(outputStream);
                        i.d(null);
                        mVar.a();
                    }
                } catch (SSLException e11) {
                    i.c(fVar, "text/plain", "SSL PROTOCOL FAILURE: " + e11.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    mVar.a();
                } catch (IOException e12) {
                    i.c(fVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage()).d(outputStream);
                    i.d(outputStream);
                    i.d(null);
                    mVar.a();
                }
            } catch (SocketException e13) {
                throw e13;
            } catch (SocketTimeoutException e14) {
                throw e14;
            }
        } catch (Throwable th2) {
            i.d(null);
            mVar.a();
            throw th2;
        }
    }
}
