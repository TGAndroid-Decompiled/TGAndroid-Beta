package v5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s;
import f5.c0;
import f7.v;
import j$.util.DesugarCollections;
import j3.s0;
import j3.t0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.InflaterInputStream;
import m.s3;
import o3.w;
import y2.q;
import y3.d0;
import y3.y;
public class c implements OnCompleteListener, a3.b, y {
    public final int f49408a;
    public Object f49409b;
    public Object f49410c;
    public Object d;

    public c(int i10) {
        this.f49408a = i10;
    }

    public void a(ze.g gVar) {
        if (((ze.e) this.f49409b) == null) {
            this.f49409b = new ze.e();
        }
        for (int i10 = 0; i10 < gVar.f50844a.size(); i10++) {
            ze.e eVar = (ze.e) this.f49409b;
            ze.f a2 = gVar.a(i10);
            eVar.h.put(a2.d, a2);
            eVar.h();
        }
    }

    @Override
    public void b(c0 c0Var, o3.m mVar, d0 d0Var) {
        this.f49410c = c0Var;
        d0Var.a();
        d0Var.b();
        w Z1 = mVar.Z1(d0Var.d, 5);
        this.d = Z1;
        Z1.b((t0) this.f49409b);
    }

    @Override
    public void c(f5.w wVar) {
        long c3;
        long j10;
        f5.a.j((c0) this.f49410c);
        int i10 = f5.d0.f6579a;
        c0 c0Var = (c0) this.f49410c;
        synchronized (c0Var) {
            try {
                long j11 = c0Var.f6578c;
                if (j11 != -9223372036854775807L) {
                    c3 = j11 + c0Var.f6577b;
                } else {
                    c3 = c0Var.c();
                }
                j10 = c3;
            } finally {
            }
        }
        long d = ((c0) this.f49410c).d();
        if (j10 != -9223372036854775807L && d != -9223372036854775807L) {
            t0 t0Var = (t0) this.f49409b;
            if (d != t0Var.F) {
                s0 a2 = t0Var.a();
                a2.f10746s = d;
                t0 t0Var2 = new t0(a2);
                this.f49409b = t0Var2;
                ((w) this.d).b(t0Var2);
            }
            int a10 = wVar.a();
            ((w) this.d).e(a10, wVar);
            ((w) this.d).c(j10, 1, a10, 0, null);
        }
    }

    public y2.i d() {
        String str;
        if (((String) this.f49410c) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((v2.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new y2.i((String) this.f49410c, (byte[]) this.f49409b, (v2.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f49409b;
        v9.e eVar = new v9.e(byteArrayOutputStream, hashMap, (HashMap) this.f49410c, (s9.d) this.d);
        if (obj == null) {
            return;
        }
        s9.d dVar = (s9.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public we.e f(we.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f49869e;
        InputStream inputStream = (xe.a) this.f49409b;
        if (fVar.f49867b) {
            org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) this.d;
            nVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) nVar.f30787b).read(bArr, i11, i10 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i12 = 0;
            boolean z10 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z10 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                if (b10 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (!fVar.f49870f) {
            if (fVar.d) {
                i10 = fVar.f49871g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new we.e(inflaterInputStream, fVar.f49868c, i10, (we.h) this.f49410c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public void g(ze.g gVar) {
        if (((ze.e) this.f49409b) != null) {
            for (int i10 = 0; i10 < gVar.f50844a.size(); i10++) {
                ze.e eVar = (ze.e) this.f49409b;
                eVar.h.remove(gVar.a(i10).d);
                eVar.h();
            }
        }
    }

    @Override
    public Object mo18get() {
        return new q(new v(8), new bb.a(8), (d3.b) ((a5.j) this.f49409b).mo18get(), (e3.f) ((s3) this.f49410c).mo18get(), (s) ((s) this.d).mo18get());
    }

    public void h(String str) {
        if (str != null) {
            this.f49410c = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void i(ze.a aVar) {
        ze.g gVar;
        ze.g gVar2 = (ze.g) this.f49410c;
        if (gVar2 != null && ((ze.a) this.d) == null && aVar != null) {
            a(gVar2);
        }
        if (((ze.a) this.d) != null && (gVar = (ze.g) this.f49410c) != null && aVar == null) {
            g(gVar);
        }
        ze.a aVar2 = (ze.a) this.d;
        if (aVar2 != null) {
            q5.h hVar = aVar2.f50817a;
            z5.l.e("Must be called from the main thread.");
            hVar.f46397i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f50817a.p(aVar);
            ze.g gVar3 = (ze.g) this.f49410c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f50822g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public void j(Object obj, String str) {
        c cVar = new c(10);
        ((c) this.d).d = cVar;
        this.d = cVar;
        cVar.f49409b = obj;
        cVar.f49410c = str;
    }

    @Override
    public void onComplete(Task task) {
        a aVar = (a) this.f49409b;
        String str = (String) this.f49410c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f49400a) {
            aVar.f49400a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.f49408a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                xe.a aVar = (xe.a) this.f49409b;
                sb2.append(aVar.f5149b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f49410c);
                sb3.append('{');
                c cVar = (c) ((c) this.f49409b).d;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f49409b;
                    sb3.append(str);
                    String str2 = (String) cVar.f49410c;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb3.append(obj);
                    }
                    cVar = (c) cVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public c(Object obj, Object obj2, Object obj3, int i10) {
        this.f49408a = i10;
        this.f49409b = obj;
        this.f49410c = obj2;
        this.d = obj3;
    }

    public c(InputStream inputStream, long j10, int i10, we.h hVar) {
        this.f49408a = 3;
        xe.a aVar = new xe.a(inputStream, j10, i10);
        this.f49409b = aVar;
        this.d = new org.telegram.ui.Components.n(aVar, 23);
        this.f49410c = hVar;
    }

    public c(String str, int i10) {
        this.f49408a = i10;
        switch (i10) {
            case 11:
                c cVar = new c(10);
                this.f49409b = cVar;
                this.d = cVar;
                this.f49410c = str;
                return;
            default:
                s0 s0Var = new s0();
                s0Var.f10742o = str;
                this.f49409b = new t0(s0Var);
                return;
        }
    }

    public c(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f49408a = 7;
        this.f49410c = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f49409b = unmodifiableList;
        this.d = bArr;
    }

    public c(URL url, x2.i iVar, String str) {
        this.f49408a = 2;
        this.f49409b = url;
        this.d = iVar;
        this.f49410c = str;
    }
}
