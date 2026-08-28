package t5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import d5.e0;
import d5.f0;
import h3.s0;
import h3.t0;
import j$.util.DesugarCollections;
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
import m.t3;
import m3.w;
import n2.p;
import w2.q;
import w3.d0;
import w3.y;
public class c implements OnCompleteListener, y2.b, y {
    public final int f47681a;
    public Object f47682b;
    public Object f47683c;
    public Object d;

    public c(int i9) {
        this.f47681a = i9;
    }

    public void a(we.g gVar) {
        if (((we.e) this.f47682b) == null) {
            this.f47682b = new we.e();
        }
        for (int i9 = 0; i9 < gVar.f48813a.size(); i9++) {
            we.e eVar = (we.e) this.f47682b;
            we.f a2 = gVar.a(i9);
            eVar.h.put(a2.d, a2);
            eVar.h();
        }
    }

    public w2.i b() {
        String str;
        if (((String) this.f47683c) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((t2.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new w2.i((String) this.f47683c, (byte[]) this.f47682b, (t2.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void c(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f47682b;
        t9.e eVar = new t9.e(byteArrayOutputStream, hashMap, (HashMap) this.f47683c, (q9.d) this.d);
        if (obj == null) {
            return;
        }
        q9.d dVar = (q9.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public te.e d(te.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i9 = fVar.f47820e;
        InputStream inputStream = (ue.a) this.f47682b;
        if (fVar.f47818b) {
            p pVar = (p) this.d;
            pVar.getClass();
            byte[] bArr = new byte[i9];
            int i10 = 0;
            while (i10 < i9) {
                int read = ((com.google.firebase.messaging.d) pVar.f18343b).read(bArr, i10, i9 - i10);
                if (read > 0) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < i9; i12++) {
                byte b10 = bArr[i12];
                if (!z10 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                if (b10 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i11);
            i9 = i11;
        }
        if (!fVar.f47821f) {
            if (fVar.d) {
                i9 = fVar.f47822g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new te.e(inflaterInputStream, fVar.f47819c, i9, (te.h) this.f47683c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    @Override
    public void e(e0 e0Var, m3.m mVar, d0 d0Var) {
        this.f47683c = e0Var;
        d0Var.a();
        d0Var.b();
        w I = mVar.I(d0Var.d, 5);
        this.d = I;
        I.c((t0) this.f47682b);
    }

    public void f(we.g gVar) {
        if (((we.e) this.f47682b) != null) {
            for (int i9 = 0; i9 < gVar.f48813a.size(); i9++) {
                we.e eVar = (we.e) this.f47682b;
                eVar.h.remove(gVar.a(i9).d);
                eVar.h();
            }
        }
    }

    @Override
    public void g(d5.y yVar) {
        long c10;
        long j10;
        d5.a.j((e0) this.f47683c);
        int i9 = f0.f4349a;
        e0 e0Var = (e0) this.f47683c;
        synchronized (e0Var) {
            try {
                long j11 = e0Var.f4348c;
                if (j11 != -9223372036854775807L) {
                    c10 = j11 + e0Var.f4347b;
                } else {
                    c10 = e0Var.c();
                }
                j10 = c10;
            } finally {
            }
        }
        long d = ((e0) this.f47683c).d();
        if (j10 != -9223372036854775807L && d != -9223372036854775807L) {
            t0 t0Var = (t0) this.f47682b;
            if (d != t0Var.F) {
                s0 a2 = t0Var.a();
                a2.f9709s = d;
                t0 t0Var2 = new t0(a2);
                this.f47682b = t0Var2;
                ((w) this.d).c(t0Var2);
            }
            int a3 = yVar.a();
            ((w) this.d).a(a3, yVar);
            ((w) this.d).e(j10, 1, a3, 0, null);
        }
    }

    @Override
    public Object mo28get() {
        return new q(new ya.b(7), new wa.a(7), (b3.c) ((b3.b) this.f47682b).mo28get(), (c3.h) ((t3) this.f47683c).mo28get(), (t) ((t) this.d).mo28get());
    }

    public void h(String str) {
        if (str != null) {
            this.f47683c = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void i(we.a aVar) {
        we.g gVar;
        we.g gVar2 = (we.g) this.f47683c;
        if (gVar2 != null && ((we.a) this.d) == null && aVar != null) {
            a(gVar2);
        }
        if (((we.a) this.d) != null && (gVar = (we.g) this.f47683c) != null && aVar == null) {
            f(gVar);
        }
        we.a aVar2 = (we.a) this.d;
        if (aVar2 != null) {
            o5.h hVar = aVar2.f48786a;
            x5.l.e("Must be called from the main thread.");
            hVar.f18990i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f48786a.p(aVar);
            we.g gVar3 = (we.g) this.f47683c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f48791g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public void j(Object obj, String str) {
        c cVar = new c(11);
        ((c) this.d).d = cVar;
        this.d = cVar;
        cVar.f47682b = obj;
        cVar.f47683c = str;
    }

    @Override
    public void onComplete(Task task) {
        a aVar = (a) this.f47682b;
        String str = (String) this.f47683c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f47673a) {
            aVar.f47673a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.f47681a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                ue.a aVar = (ue.a) this.f47682b;
                sb2.append(aVar.f4135b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f47683c);
                sb3.append('{');
                c cVar = (c) ((c) this.f47682b).d;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f47682b;
                    sb3.append(str);
                    String str2 = (String) cVar.f47683c;
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

    public c(Object obj, Object obj2, Object obj3, int i9) {
        this.f47681a = i9;
        this.f47682b = obj;
        this.f47683c = obj2;
        this.d = obj3;
    }

    public c(InputStream inputStream, long j10, int i9, te.h hVar) {
        this.f47681a = 2;
        ue.a aVar = new ue.a(inputStream, j10, i9);
        this.f47682b = aVar;
        this.d = new p(aVar, 22);
        this.f47683c = hVar;
    }

    public c(String str, int i9) {
        this.f47681a = i9;
        switch (i9) {
            case 12:
                c cVar = new c(11);
                this.f47682b = cVar;
                this.d = cVar;
                this.f47683c = str;
                return;
            default:
                s0 s0Var = new s0();
                s0Var.f9705o = str;
                this.f47682b = new t0(s0Var);
                return;
        }
    }

    public c(int i9, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f47681a = 7;
        this.f47683c = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f47682b = unmodifiableList;
        this.d = bArr;
    }

    public c(URL url, v2.i iVar, String str) {
        this.f47681a = 3;
        this.f47682b = url;
        this.d = iVar;
        this.f47683c = str;
    }
}
