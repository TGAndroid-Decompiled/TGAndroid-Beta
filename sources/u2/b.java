package u2;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import d5.f0;
import d5.g0;
import d5.z;
import e7.v;
import h3.s0;
import h3.t0;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.InflaterInputStream;
import m.t3;
import m3.m;
import m3.w;
import t2.d;
import ue.h;
import w2.i;
import w2.q;
import w3.e0;
import w3.y;
import xe.e;
import xe.f;
import xe.g;
import y5.l;

public class b implements OnCompleteListener, y2.b, y {

    public final int f48261a;

    public Object f48262b;

    public Object f48263c;
    public Object d;

    public b(int i10) {
        this.f48261a = i10;
    }

    @Override
    public void a(f0 f0Var, m mVar, e0 e0Var) {
        this.d = f0Var;
        e0Var.a();
        e0Var.b();
        w wVarC = mVar.C(e0Var.d, 5);
        this.f48262b = wVarC;
        wVarC.c((t0) this.f48263c);
    }

    @Override
    public void b(z zVar) {
        long jC;
        d5.a.j((f0) this.d);
        int i10 = g0.f4795a;
        f0 f0Var = (f0) this.d;
        synchronized (f0Var) {
            try {
                long j10 = f0Var.f4793c;
                jC = j10 != -9223372036854775807L ? j10 + f0Var.f4792b : f0Var.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        long jD = ((f0) this.d).d();
        if (jC == -9223372036854775807L || jD == -9223372036854775807L) {
            return;
        }
        t0 t0Var = (t0) this.f48263c;
        if (jD != t0Var.F) {
            s0 s0VarA = t0Var.a();
            s0VarA.f8139s = jD;
            t0 t0Var2 = new t0(s0VarA);
            this.f48263c = t0Var2;
            ((w) this.f48262b).c(t0Var2);
        }
        int iA = zVar.a();
        ((w) this.f48262b).a(iA, zVar);
        ((w) this.f48262b).e(jC, 1, iA, 0, null);
    }

    public void c(g gVar) {
        if (((e) this.f48263c) == null) {
            this.f48263c = new e();
        }
        for (int i10 = 0; i10 < gVar.f49412a.size(); i10++) {
            e eVar = (e) this.f48263c;
            f fVarA = gVar.a(i10);
            eVar.h.put(fVarA.d, fVarA);
            eVar.h();
        }
    }

    public i d() {
        String strConcat = ((String) this.f48262b) == null ? " backendName" : "";
        if (((d) this.d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new i((String) this.f48262b, (byte[]) this.f48263c, (d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f48263c;
        u9.e eVar = new u9.e(byteArrayOutputStream, map, (HashMap) this.d, (r9.d) this.f48262b);
        if (obj == null) {
            return;
        }
        r9.d dVar = (r9.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new r9.b("No encoder for " + obj.getClass());
        }
    }

    public ue.e f(ue.f fVar) {
        InputStream inflaterInputStream;
        int i10 = fVar.f48542e;
        InputStream byteArrayInputStream = (ve.a) this.f48263c;
        if (fVar.f48540b) {
            n1.d dVar = (n1.d) this.f48262b;
            dVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = ((com.google.firebase.messaging.d) dVar.f18088b).read(bArr, i11, i10 - i11);
                if (i12 <= 0) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            int i13 = 0;
            boolean z10 = false;
            for (int i14 = 0; i14 < i10; i14++) {
                byte b10 = bArr[i14];
                if (!z10 || b10 != 0) {
                    bArr[i13] = b10;
                    i13++;
                }
                z10 = b10 == -1;
            }
            byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i13);
            i10 = i13;
        }
        if (fVar.f48543f) {
            throw new ue.c("Frame encryption is not supported");
        }
        if (fVar.d) {
            i10 = fVar.f48544g;
            inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        } else {
            inflaterInputStream = byteArrayInputStream;
        }
        return new ue.e(inflaterInputStream, fVar.f48541c, i10, (h) this.d, fVar);
    }

    public void g(g gVar) {
        if (((e) this.f48263c) == null) {
            return;
        }
        for (int i10 = 0; i10 < gVar.f49412a.size(); i10++) {
            e eVar = (e) this.f48263c;
            eVar.h.remove(gVar.a(i10).d);
            eVar.h();
        }
    }

    @Override
    public Object mo28get() {
        int i10 = 6;
        return new q(new w9.d(i10), new v(i10), (b3.b) ((af.h) this.f48263c).mo28get(), (c3.g) ((t3) this.d).mo28get(), (t) ((t) this.f48262b).mo28get());
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f48262b = str;
    }

    public void i(xe.a aVar) {
        g gVar;
        g gVar2 = (g) this.d;
        if (gVar2 != null && ((xe.a) this.f48262b) == null && aVar != null) {
            c(gVar2);
        }
        if (((xe.a) this.f48262b) != null && (gVar = (g) this.d) != null && aVar == null) {
            g(gVar);
        }
        xe.a aVar2 = (xe.a) this.f48262b;
        if (aVar2 != null) {
            o5.h hVar = aVar2.f49385a;
            l.e("Must be called from the main thread.");
            hVar.f19337i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f49385a.p(aVar);
            g gVar3 = (g) this.d;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f49390g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.f48262b = aVar;
    }

    public void j(Object obj, String str) {
        b bVar = new b(11);
        ((b) this.d).d = bVar;
        this.d = bVar;
        bVar.f48263c = obj;
        bVar.f48262b = str;
    }

    @Override
    public void onComplete(Task task) {
        u5.a aVar = (u5.a) this.f48263c;
        String str = (String) this.f48262b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f48398a) {
            aVar.f48398a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.f48261a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                ve.a aVar = (ve.a) this.f48263c;
                sb2.append(aVar.f4577b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f48262b);
                sb3.append('{');
                b bVar = (b) ((b) this.f48263c).d;
                String str = "";
                while (bVar != null) {
                    Object obj = bVar.f48263c;
                    sb3.append(str);
                    String str2 = (String) bVar.f48262b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb3.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb3.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    bVar = (b) bVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public b(Object obj, Object obj2, Object obj3, int i10) {
        this.f48261a = i10;
        this.f48263c = obj;
        this.d = obj2;
        this.f48262b = obj3;
    }

    public b(u5.a aVar, String str, ScheduledFuture scheduledFuture) {
        this.f48261a = 1;
        this.f48263c = aVar;
        this.f48262b = str;
        this.d = scheduledFuture;
    }

    public b(InputStream inputStream, long j10, int i10, h hVar) {
        this.f48261a = 3;
        ve.a aVar = new ve.a(inputStream, j10, i10);
        this.f48263c = aVar;
        this.f48262b = new n1.d(aVar, 23);
        this.d = hVar;
    }

    public b(String str, int i10) {
        this.f48261a = i10;
        switch (i10) {
            case 12:
                b bVar = new b(11);
                this.f48263c = bVar;
                this.d = bVar;
                this.f48262b = str;
                break;
            default:
                s0 s0Var = new s0();
                s0Var.f8135o = str;
                this.f48263c = new t0(s0Var);
                break;
        }
    }

    public b(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f48261a = 7;
        this.f48262b = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f48263c = listUnmodifiableList;
        this.d = bArr;
    }
}
