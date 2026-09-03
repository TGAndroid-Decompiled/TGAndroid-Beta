package s5;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s;
import h7.u;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.InflaterInputStream;
import m.r3;
import org.telegram.ui.Components.ai;
public final class m implements t0.h, OnCompleteListener, a3.b {
    public final int f47092a;
    public Object f47093b;
    public Object f47094c;
    public Object d;

    public m() {
        this.f47092a = 10;
    }

    @Override
    public Uri a() {
        return (Uri) this.f47093b;
    }

    @Override
    public Uri c() {
        return (Uri) this.d;
    }

    @Override
    public Object d() {
        return null;
    }

    public y2.i f() {
        String str;
        if (((String) this.f47093b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((v2.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new y2.i((String) this.f47093b, (byte[]) this.f47094c, (v2.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void g(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f47093b;
        x9.e eVar = new x9.e(byteArrayOutputStream, hashMap, (HashMap) this.f47094c, (u9.d) this.d);
        if (obj == null) {
            return;
        }
        u9.d dVar = (u9.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    @Override
    public Object mo38get() {
        return new y2.q(new z9.d(7), new u(7), (d3.b) ((c5.j) this.f47093b).mo38get(), (e3.g) ((r3) this.f47094c).mo38get(), (s) ((sf.f) this.d).mo38get());
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f47094c;
    }

    public ye.e h(ye.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f50905e;
        InputStream inputStream = (ze.a) this.f47093b;
        if (fVar.f50903b) {
            ai aiVar = (ai) this.d;
            aiVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) aiVar.f25257b).read(bArr, i11, i10 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i12 = 0;
            boolean z4 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z4 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                if (b10 == -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (!fVar.f50906f) {
            if (fVar.d) {
                i10 = fVar.f50907g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new ye.e(inflaterInputStream, fVar.f50904c, i10, (ye.h) this.f47094c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public Object i(Bitmap bitmap) {
        ug.a aVar = (ug.a) this.f47093b;
        if (aVar.a(bitmap)) {
            this.d = ((ug.b) this.f47094c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void j(v7.f fVar) {
        try {
            w7.g gVar = (w7.g) this.f47094c;
            v7.i iVar = new v7.i(fVar);
            Parcel M0 = gVar.M0();
            g7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    public int k(tb.e eVar) {
        ArrayList arrayList = (ArrayList) this.f47093b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            vb.f fVar = (vb.f) obj;
            int i12 = fVar.d;
            tb.d dVar = fVar.f48994a;
            int a2 = dVar.a(eVar);
            int i13 = a2 + 4;
            int ordinal = dVar.ordinal();
            int i14 = 4;
            if (ordinal != 1) {
                int i15 = 6;
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                i13 += i12 * 13;
                            }
                        } else {
                            i13 = a2 + 12;
                        }
                    } else {
                        i13 += fVar.a() * 8;
                    }
                } else {
                    int i16 = ((i12 / 2) * 11) + i13;
                    if (i12 % 2 != 1) {
                        i15 = 0;
                    }
                    i13 = i16 + i15;
                }
            } else {
                int i17 = ((i12 / 3) * 10) + i13;
                int i18 = i12 % 3;
                if (i18 != 1) {
                    if (i18 == 2) {
                        i14 = 7;
                    } else {
                        i14 = 0;
                    }
                }
                i13 = i17 + i14;
            }
            i10 += i13;
        }
        return i10;
    }

    public boolean l() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f47094c;
        if (((String) this.d) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f47093b).readLine();
            this.d = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.d = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    public String m() {
        if (l()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void n(String str) {
        if (str != null) {
            this.f47093b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    @Override
    public void onComplete(Task task) {
        x5.a aVar = (x5.a) this.f47093b;
        String str = (String) this.f47094c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f50442a) {
            aVar.f50442a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.f47092a) {
            case 5:
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f47093b;
                int size = arrayList.size();
                vb.f fVar = null;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    vb.f fVar2 = (vb.f) obj;
                    if (fVar != null) {
                        sb.append(",");
                    }
                    sb.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb.toString();
            case 12:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                ze.a aVar = (ze.a) this.f47093b;
                sb2.append(aVar.f4045b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f47092a = i10;
        this.f47093b = obj;
        this.f47094c = obj2;
        this.d = obj3;
    }

    public m(h hVar) {
        this.f47092a = 0;
        this.d = hVar;
        this.f47094c = new AtomicLong((u5.a.f48384b.nextLong() & 65535) * 10000);
    }

    public m(v7.d dVar, w7.g gVar) {
        this.f47092a = 4;
        this.f47094c = gVar;
        b6.m.h(dVar);
        this.f47093b = dVar;
    }

    public m(ug.b bVar) {
        this.f47092a = 3;
        this.f47093b = new ug.a();
        this.f47094c = bVar;
    }

    public m(InputStream inputStream, long j10, int i10, ye.h hVar) {
        this.f47092a = 12;
        ze.a aVar = new ze.a(inputStream, j10, i10);
        this.f47093b = aVar;
        this.d = new ai(aVar, 24);
        this.f47094c = hVar;
    }

    public m(cb.m mVar, tb.e eVar, vb.e eVar2) {
        tb.d dVar;
        int i10;
        int i11;
        this.f47092a = 5;
        this.d = mVar;
        this.f47093b = new ArrayList();
        vb.e eVar3 = eVar2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dVar = tb.d.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f48991c;
            int i15 = i12 + eVar3.d;
            vb.e eVar4 = eVar3.f48992e;
            int i16 = i13;
            tb.d dVar2 = eVar3.f48989a;
            boolean z4 = (dVar2 == tb.d.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f48991c);
            i10 = z4 ? 1 : i16;
            if (eVar4 == null || eVar4.f48989a != dVar2 || z4) {
                ((ArrayList) this.f47093b).add(0, new vb.f(this, dVar2, eVar3.f48990b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z4) {
                ((ArrayList) this.f47093b).add(0, new vb.f(this, dVar, eVar3.f48990b, eVar3.f48991c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z10 = mVar.f2424a;
        tb.b bVar = (tb.b) mVar.d;
        if (z10) {
            vb.f fVar = (vb.f) ((ArrayList) this.f47093b).get(0);
            if (fVar != null && fVar.f48994a != dVar && i17 != 0) {
                ((ArrayList) this.f47093b).add(0, new vb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.f47093b).add(((vb.f) ((ArrayList) this.f47093b).get(0)).f48994a == dVar ? 1 : 0, new vb.f(this, tb.d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = eVar.f48088a;
        int i19 = 26;
        int c3 = m1.j.c(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (c3 == 0) {
            i19 = 9;
        } else if (c3 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int k10 = k(eVar);
        while (i18 < i19 && !vb.c.c(k10, tb.e.c(i18), bVar)) {
            i18++;
        }
        while (i18 > i10 && vb.c.c(k10, tb.e.c(i18 - 1), bVar)) {
            i18--;
        }
        this.f47094c = tb.e.c(i18);
    }

    @Override
    public void b() {
    }

    @Override
    public void e() {
    }

    public m(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f47092a = 2;
        this.f47094c = arrayDeque;
        this.f47093b = bufferedReader;
    }
}
