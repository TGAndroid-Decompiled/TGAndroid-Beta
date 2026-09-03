package s5;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
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
import m.s3;
public final class m implements t0.h, OnCompleteListener, a3.b {
    public final int f44152a;
    public Object f44153b;
    public Object f44154c;
    public Object d;

    public m() {
        this.f44152a = 11;
    }

    @Override
    public Uri a() {
        return (Uri) this.f44153b;
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
        if (((String) this.f44153b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((v2.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new y2.i((String) this.f44153b, (byte[]) this.f44154c, (v2.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void g(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f44153b;
        x9.e eVar = new x9.e(byteArrayOutputStream, hashMap, (HashMap) this.f44154c, (u9.d) this.d);
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
    public Object mo28get() {
        return new y2.q(new u(7), new db.a(7), (d3.b) ((c5.j) this.f44153b).mo28get(), (e3.g) ((s3) this.f44154c).mo28get(), (com.google.firebase.messaging.r) ((rf.f) this.d).mo28get());
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f44154c;
    }

    public xe.f h(xe.g gVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = gVar.e;
        InputStream inputStream = (ye.a) this.f44153b;
        if (gVar.f46997b) {
            xe.b bVar = (xe.b) this.d;
            bVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) bVar.f46987a).read(bArr, i11, i10 - i11);
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
        if (!gVar.f46999f) {
            if (gVar.d) {
                i10 = gVar.f47000g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new xe.f(inflaterInputStream, gVar.f46998c, i10, (xe.i) this.f44154c, gVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public Object i(Bitmap bitmap) {
        tg.a aVar = (tg.a) this.f44153b;
        if (aVar.a(bitmap)) {
            this.d = ((tg.b) this.f44154c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void j(v7.f fVar) {
        try {
            w7.g gVar = (w7.g) this.f44154c;
            v7.i iVar = new v7.i(fVar);
            Parcel M0 = gVar.M0();
            g7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public int k(tb.e eVar) {
        ArrayList arrayList = (ArrayList) this.f44153b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            vb.f fVar = (vb.f) obj;
            int i12 = fVar.d;
            tb.d dVar = fVar.f45724a;
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
        ArrayDeque arrayDeque = (ArrayDeque) this.f44154c;
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
            String readLine = ((BufferedReader) this.f44153b).readLine();
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
            this.f44153b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    @Override
    public void onComplete(Task task) {
        x5.a aVar = (x5.a) this.f44153b;
        String str = (String) this.f44154c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f46871a) {
            aVar.f46871a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.f44152a) {
            case 5:
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f44153b;
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
            case 10:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                ye.a aVar = (ye.a) this.f44153b;
                sb2.append(aVar.f3975b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f44152a = i10;
        this.f44153b = obj;
        this.f44154c = obj2;
        this.d = obj3;
    }

    public m(h hVar) {
        this.f44152a = 0;
        this.d = hVar;
        this.f44154c = new AtomicLong((u5.a.f45159b.nextLong() & 65535) * 10000);
    }

    public m(v7.d dVar, w7.g gVar) {
        this.f44152a = 4;
        this.f44154c = gVar;
        b6.m.h(dVar);
        this.f44153b = dVar;
    }

    public m(tg.b bVar) {
        this.f44152a = 2;
        this.f44153b = new tg.a();
        this.f44154c = bVar;
    }

    public m(InputStream inputStream, long j10, int i10, xe.i iVar) {
        this.f44152a = 10;
        ye.a aVar = new ye.a(inputStream, j10, i10);
        this.f44153b = aVar;
        this.d = new xe.b(aVar);
        this.f44154c = iVar;
    }

    public m(cb.m mVar, tb.e eVar, vb.e eVar2) {
        tb.d dVar;
        int i10;
        int i11;
        this.f44152a = 5;
        this.d = mVar;
        this.f44153b = new ArrayList();
        vb.e eVar3 = eVar2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dVar = tb.d.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f45722c;
            int i15 = i12 + eVar3.d;
            vb.e eVar4 = eVar3.e;
            int i16 = i13;
            tb.d dVar2 = eVar3.f45720a;
            boolean z4 = (dVar2 == tb.d.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f45722c);
            i10 = z4 ? 1 : i16;
            if (eVar4 == null || eVar4.f45720a != dVar2 || z4) {
                ((ArrayList) this.f44153b).add(0, new vb.f(this, dVar2, eVar3.f45721b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z4) {
                ((ArrayList) this.f44153b).add(0, new vb.f(this, dVar, eVar3.f45721b, eVar3.f45722c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z10 = mVar.f2255a;
        tb.b bVar = (tb.b) mVar.d;
        if (z10) {
            vb.f fVar = (vb.f) ((ArrayList) this.f44153b).get(0);
            if (fVar != null && fVar.f45724a != dVar && i17 != 0) {
                ((ArrayList) this.f44153b).add(0, new vb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.f44153b).add(((vb.f) ((ArrayList) this.f44153b).get(0)).f45724a == dVar ? 1 : 0, new vb.f(this, tb.d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = eVar.f44700a;
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
        this.f44154c = tb.e.c(i18);
    }

    @Override
    public void b() {
    }

    @Override
    public void e() {
    }

    public m(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f44152a = 3;
        this.f44154c = arrayDeque;
        this.f44153b = bufferedReader;
    }
}
