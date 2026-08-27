package xe;

import a0.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.n;
import androidx.emoji2.text.o;
import androidx.emoji2.text.u;
import c2.d0;
import c2.e0;
import c7.m;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.clearcut.h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.t;
import d5.p;
import f2.o1;
import f2.s1;
import f2.t1;
import f2.u1;
import g.r;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l.b0;
import m1.j;
import n5.i;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc;
import org.telegram.ui.PhotoViewer;
import r0.j0;
import r0.m0;
import r0.z;

public final class b implements i, s, l, OnCompleteListener, h, y2.b, SuccessContinuation {
    public static volatile b d;

    public final int f49391a;

    public Object f49392b;

    public Object f49393c;

    public b(int i10, Object obj, Object obj2) {
        this.f49391a = i10;
        this.f49393c = obj;
        this.f49392b = obj2;
    }

    public static b D() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0, (byte) 0);
                    d = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static boolean l(Editable editable, KeyEvent keyEvent, boolean z10) {
        u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
                for (u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public byte[] A(b4.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f49393c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f49392b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f1910a);
            dataOutputStream.writeByte(0);
            String str = aVar.f1911b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f1912c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f1913e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }

    public View B(int i10, int i11, int i12, int i13) {
        s1 s1Var = (s1) this.f49393c;
        t1 t1Var = (t1) this.f49392b;
        int iN = t1Var.n();
        int iV = t1Var.v();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = t1Var.A(i10);
            int iF = t1Var.f(viewA);
            int iG = t1Var.G(viewA);
            s1Var.f5826b = iN;
            s1Var.f5827c = iV;
            s1Var.d = iF;
            s1Var.f5828e = iG;
            if (i12 != 0) {
                s1Var.f5825a = i12;
                if (s1Var.a()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                s1Var.f5825a = i13;
                if (s1Var.a()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public File C() {
        if (((File) this.f49392b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f49392b) == null) {
                        t8.h hVar = (t8.h) this.f49393c;
                        hVar.a();
                        this.f49392b = new File(hVar.f48119a.getFilesDir(), "PersistedInstallation." + ((t8.h) this.f49393c).d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f49392b;
    }

    public synchronized Map E() {
        try {
            if (((Map) this.f49393c) == null) {
                this.f49393c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f49392b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f49393c;
    }

    public boolean F(CharSequence charSequence, int i10, int i11, o oVar) {
        boolean zL;
        if (oVar.f1370c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f49393c;
            p1.a aVarB = oVar.b();
            int iA = aVarB.a(8);
            short s10 = iA != 0 ? ((ByteBuffer) aVarB.d).getShort(iA + aVarB.f45341a) : (short) 0;
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 || s10 <= i12) {
                ThreadLocal threadLocal = androidx.emoji2.text.d.f1345b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb2 = (StringBuilder) threadLocal.get();
                sb2.setLength(0);
                while (i10 < i11) {
                    sb2.append(charSequence.charAt(i10));
                    i10++;
                }
                TextPaint textPaint = dVar.f1346a;
                String string = sb2.toString();
                ThreadLocal threadLocal2 = i0.d.f10492a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zL = e0.b.l(textPaint, string);
                } else {
                    int length = string.length();
                    if (length == 1 && Character.isWhitespace(string.charAt(0))) {
                        zL = true;
                    } else {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i13 = 0;
                                    while (i13 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i13)) + i13;
                                        fMeasureText4 += textPaint.measureText(string, i13, iCharCount);
                                        i13 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zL = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zL = true;
                            } else {
                                ThreadLocal threadLocal3 = i0.d.f10492a;
                                q0.b bVar = (q0.b) threadLocal3.get();
                                if (bVar == null) {
                                    bVar = new q0.b(new Rect(), new Rect());
                                    threadLocal3.set(bVar);
                                } else {
                                    ((Rect) bVar.f46057a).setEmpty();
                                    ((Rect) bVar.f46058b).setEmpty();
                                }
                                Object obj = bVar.f46058b;
                                Rect rect = (Rect) bVar.f46057a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                textPaint.getTextBounds(string, 0, length, (Rect) obj);
                                zL = !rect.equals(obj);
                            }
                        } else {
                            zL = false;
                        }
                    }
                }
            } else {
                zL = false;
            }
            oVar.f1370c = zL ? 2 : 1;
        }
        return oVar.f1370c == 2;
    }

    public void G(aa.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f205a);
            jSONObject.put("Status", j.b(bVar.f206b));
            jSONObject.put("AuthToken", bVar.f207c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f209f);
            jSONObject.put("ExpiresInSecs", bVar.f208e);
            jSONObject.put("FisError", bVar.f210g);
            t8.h hVar = (t8.h) this.f49393c;
            hVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f48119a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(C())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean H() {
        return ((a) ((u2.b) this.f49392b).f48262b) != null;
    }

    public boolean I(View view) {
        s1 s1Var = (s1) this.f49393c;
        t1 t1Var = (t1) this.f49392b;
        int iN = t1Var.n();
        int iV = t1Var.v();
        int iF = t1Var.f(view);
        int iG = t1Var.G(view);
        s1Var.f5826b = iN;
        s1Var.f5827c = iV;
        s1Var.d = iF;
        s1Var.f5828e = iG;
        s1Var.f5825a = 24579;
        return s1Var.a();
    }

    public void J(k.a aVar) {
        t tVar = (t) this.f49392b;
        ((ActionMode.Callback) tVar.f4619b).onDestroyActionMode(tVar.r(aVar));
        r rVar = (r) this.f49393c;
        if (rVar.A != null) {
            rVar.f6298f.getDecorView().removeCallbacks(rVar.B);
        }
        if (rVar.f6311y != null) {
            m0 m0Var = rVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 m0VarA = j0.a(rVar.f6311y);
            m0VarA.a(0.0f);
            rVar.C = m0VarA;
            m0VarA.d(new g.j(this, 2));
        }
        rVar.f6310x = null;
        ViewGroup viewGroup = rVar.F;
        WeakHashMap weakHashMap = j0.f46605a;
        z.c(viewGroup);
        rVar.y();
    }

    public boolean K(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((r) this.f49393c).F;
        WeakHashMap weakHashMap = j0.f46605a;
        z.c(viewGroup);
        t tVar = (t) this.f49392b;
        ActionMode.Callback callback = (ActionMode.Callback) tVar.f4619b;
        k.e eVarR = tVar.r(aVar);
        k kVar = (k) tVar.f4621e;
        Menu b0Var = (Menu) kVar.get(menu);
        if (b0Var == null) {
            b0Var = new b0((Context) tVar.f4620c, (l.l) menu);
            kVar.put(menu, b0Var);
        }
        return callback.onPrepareActionMode(eVarR, b0Var);
    }

    public p L(o1 o1Var, int i10) {
        u1 u1Var;
        p pVar;
        a0.f fVar = (a0.f) this.f49392b;
        int iC = fVar.c(o1Var);
        if (iC >= 0 && (u1Var = (u1) fVar.h(iC)) != null) {
            int i11 = u1Var.f5835a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                u1Var.f5835a = i12;
                if (i10 == 4) {
                    pVar = u1Var.f5836b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    pVar = u1Var.f5837c;
                }
                if ((i12 & 12) == 0) {
                    fVar.f(iC);
                    u1Var.f5835a = 0;
                    u1Var.f5836b = null;
                    u1Var.f5837c = null;
                    u1.d.j(u1Var);
                }
                return pVar;
            }
        }
        return null;
    }

    public aa.b M() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(C());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = j.c(5)[iOptInt];
        if (i11 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i11 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new aa.b(strOptString, i11, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void N(o1 o1Var) {
        u1 u1Var = (u1) ((a0.f) this.f49392b).get(o1Var);
        if (u1Var == null) {
            return;
        }
        u1Var.f5835a &= -2;
    }

    public void O(o1 o1Var) {
        a0.f fVar = (a0.f) this.f49392b;
        a0.h hVar = (a0.h) this.f49393c;
        for (int iM = hVar.m() - 1; iM >= 0; iM--) {
            if (o1Var == hVar.n(iM)) {
                Object[] objArr = hVar.f18c;
                Object obj = objArr[iM];
                Object obj2 = a0.i.f19a;
                if (obj == obj2) {
                    break;
                }
                objArr[iM] = obj2;
                hVar.f16a = true;
                break;
            }
        }
        u1 u1Var = (u1) fVar.get(o1Var);
        if (u1Var != null) {
            fVar.remove(o1Var);
            u1Var.f5835a = 0;
            u1Var.f5836b = null;
            u1Var.f5837c = null;
            u1.d.j(u1Var);
        }
    }

    public void P(g gVar) {
        e eVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        u2.b bVar = (u2.b) this.f49392b;
        g gVar3 = (g) bVar.d;
        if (d1.f.t()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.f49412a;
                if (gVar != null && arrayList.size() == gVar.f49412a.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        f fVarA = gVar3.a(i10);
                        f fVarA2 = gVar.a(i10);
                        if ((fVarA == null && fVarA2 == null) || (fVarA != null && fVarA2 != null && Objects.equals(fVarA.f49407a, fVarA2.f49407a) && Objects.equals(fVarA.f49408b, fVarA2.f49408b) && Objects.equals(fVarA.f49409c, fVarA2.f49409c) && Objects.equals(fVarA.d, fVarA2.d) && fVarA.f49410e == fVarA2.f49410e && fVarA.f49411f == fVarA2.f49411f)) {
                        }
                    }
                    return;
                }
            }
        }
        if (((a) bVar.f48262b) != null && gVar != null) {
            bVar.c(gVar);
        }
        if (((a) bVar.f48262b) != null && (gVar2 = (g) bVar.d) != null) {
            bVar.g(gVar2);
        }
        if (gVar != null && gVar.f49412a.size() > 0 && !gVar.a(0).f49407a.startsWith("audio/") && (eVar = (e) bVar.f48263c) != null) {
            eVar.l(null, null);
        }
        a aVar = (a) bVar.f48262b;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f49390g = 0;
            aVar.h = 0;
            aVar.p();
        }
        bVar.d = gVar;
    }

    public void Q(n5.c cVar) {
        u2.b bVar = (u2.b) this.f49392b;
        if (cVar == null) {
            return;
        }
        y5.l.e("Must be called from the main thread.");
        o5.h hVar = cVar.f18308j;
        String strA = cVar.a();
        if (TextUtils.isEmpty(strA) || hVar == null) {
            return;
        }
        a aVar = (a) bVar.f48262b;
        if (aVar == null || !TextUtils.equals(aVar.f49387c.a(), strA)) {
            bVar.i(new a(cVar, (n5.h) this.f49393c, hVar));
            y5.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.f18309k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer photoViewerT1 = PhotoViewer.t1();
            e.i();
            if (photoViewerT1.A == null || photoViewerT1.f35583a0 == null || !photoViewerT1.Q1()) {
                return;
            }
            new mc(photoViewerT1.f35583a0, new jh.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    @Override
    public void a(n5.g gVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((n5.c) gVar).a());
    }

    @Override
    public void accept(Object obj, Object obj2) {
        c7.j jVar;
        long jMin;
        v5.c cVar;
        n nVar = (n) this.f49392b;
        LocationRequest locationRequest = (LocationRequest) this.f49393c;
        c7.l lVar = (c7.l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        lVar.getClass();
        com.google.android.gms.common.api.internal.p pVarE = nVar.e();
        com.google.android.gms.common.api.internal.n nVar2 = pVarE.f3318c;
        nVar2.getClass();
        v5.c[] cVarArrL = lVar.l();
        boolean z10 = false;
        if (cVarArrL != null) {
            int length = cVarArrL.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrL[i10];
                if ("location_updates_with_callback".equals(cVar.f48790a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z10 = true;
            }
        }
        synchronized (lVar.R) {
            try {
                c7.j jVar2 = (c7.j) lVar.R.get(nVar2);
                if (jVar2 == null || z10) {
                    c7.j jVar3 = new c7.j(nVar);
                    lVar.R.put(nVar2, jVar3);
                    jVar = jVar3;
                } else {
                    jVar2.K0(pVarE);
                    jVar = jVar2;
                    jVar2 = null;
                }
                String str = nVar2.f3309b + "@" + System.identityHashCode(nVar2.f3308a);
                if (z10) {
                    c7.b0 b0Var = (c7.b0) lVar.u();
                    m mVar = new m(2, jVar2 == null ? null : jVar2, jVar, null, null, str);
                    c7.f fVar = new c7.f(null, taskCompletionSource);
                    Parcel parcelM0 = b0Var.M0();
                    c7.e.c(parcelM0, mVar);
                    c7.e.c(parcelM0, locationRequest);
                    c7.e.d(parcelM0, fVar);
                    b0Var.Q0(parcelM0, 88);
                } else {
                    c7.b0 b0Var2 = (c7.b0) lVar.u();
                    int i11 = locationRequest.f4337a;
                    long j10 = locationRequest.f4338b;
                    long j11 = locationRequest.f4339c;
                    long j12 = locationRequest.d;
                    long j13 = locationRequest.f4340e;
                    int i12 = locationRequest.f4341f;
                    float f10 = locationRequest.h;
                    boolean z11 = locationRequest.f4342n;
                    long j14 = locationRequest.f4343r;
                    int i13 = locationRequest.f4344s;
                    int i14 = locationRequest.v;
                    String str2 = locationRequest.f4345w;
                    boolean z12 = locationRequest.f4346x;
                    WorkSource workSource = locationRequest.f4347y;
                    c7.k kVar = locationRequest.A;
                    String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                    if (j11 == -1) {
                        jMin = j10;
                    } else {
                        jMin = i11 == 105 ? j11 : Math.min(j11, j10);
                    }
                    c7.p pVar = new c7.p(1, new c7.o(new LocationRequest(i11, j10, jMin, Math.max(j12, j10), Long.MAX_VALUE, j13, i12, f10, z11, j14 == -1 ? j10 : j14, i13, i14, str3, z12, new WorkSource(workSource), kVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, jVar, null, new c7.i(taskCompletionSource, jVar), str);
                    Parcel parcelM1 = b0Var2.M0();
                    c7.e.c(parcelM1, pVar);
                    b0Var2.Q0(parcelM1, 59);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void b(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((n5.c) gVar).a() + " " + i10);
    }

    @Override
    public void c(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((n5.c) gVar).a() + " " + i10);
        ((u2.b) this.f49392b).i(null);
    }

    @Override
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new v((Context) this.f49392b, ((w) this.f49393c).createDataSource());
    }

    @Override
    public void d(n5.g gVar) {
        n5.c cVar = (n5.c) gVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        Q(cVar);
    }

    @Override
    public void e(n5.g gVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((n5.c) gVar).a() + " " + z10);
    }

    @Override
    public void f(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((n5.c) gVar).a() + " " + i10);
    }

    public void g(o1 o1Var, p pVar) {
        a0.f fVar = (a0.f) this.f49392b;
        u1 u1VarA = (u1) fVar.get(o1Var);
        if (u1VarA == null) {
            u1VarA = u1.a();
            fVar.put(o1Var, u1VarA);
        }
        u1VarA.f5837c = pVar;
        u1VarA.f5835a |= 8;
    }

    @Override
    public Object mo28get() {
        int i10 = 6;
        w9.d dVar = new w9.d(i10);
        e7.v vVar = new e7.v(i10);
        Object objMo28get = ((oc.a) this.f49392b).mo28get();
        oc.a aVar = (oc.a) this.f49393c;
        return new d3.h(dVar, vVar, d3.a.f4729f, (d3.j) objMo28get, aVar);
    }

    @Override
    public void h(n5.g gVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((n5.c) gVar).a() + " " + i10);
    }

    @Override
    public void i(n5.g gVar, String str) {
        n5.c cVar = (n5.c) gVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        Q(cVar);
    }

    @Override
    public void j(n5.g gVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((n5.c) gVar).a() + " " + str);
    }

    public void k() {
        String str = (String) this.f49392b;
        try {
            k9.c cVar = (k9.c) this.f49393c;
            cVar.getClass();
            new File(cVar.f15099b, str).createNewFile();
        } catch (IOException e9) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e9);
        }
    }

    public void m(k3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.f49392b;
        if (handler != null) {
            handler.post(new e5.v(this, fVar, 0));
        }
    }

    public void n(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.n(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void o(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f49392b;
        androidx.fragment.app.v vVar = j0Var.f1464w.f1557b;
        androidx.fragment.app.s sVar = j0Var.f1466y;
        if (sVar != null) {
            sVar.p().f1457o.o(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        n5.b bVar;
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.f49392b;
        n5.b bVar2 = (n5.b) this.f49393c;
        c2.b0 b0Var = pVar.f3611c;
        r5.b bVar3 = com.google.android.gms.internal.cast.p.f3610j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        Log.i(bVar3.f46768a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f18299x)));
        boolean z12 = z10 && bVar2.f18299x;
        if (b0Var == null || (bVar = pVar.d) == null) {
            return;
        }
        boolean z13 = bVar.v;
        boolean z14 = bVar.f18297s;
        d0 d0Var = new d0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d0Var.f2248b = z12;
        }
        if (i10 >= 30) {
            d0Var.d = z13;
        }
        if (i10 >= 30) {
            d0Var.f2249c = z14;
        }
        c2.b0.i(new e0(d0Var));
        Log.i(bVar3.f46768a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.f3614i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
        if (z13) {
            com.google.android.gms.internal.cast.s sVar = pVar.f3613f;
            y5.l.h(sVar);
            com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
            c2.b0.b();
            c2.b0.c().f2255f = oVar;
            c2.a(c1.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    public void p(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.p(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void q(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void r(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.r(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void s(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.s(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void t(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f49392b;
        androidx.fragment.app.v vVar = j0Var.f1464w.f1557b;
        androidx.fragment.app.s sVar = j0Var.f1466y;
        if (sVar != null) {
            sVar.p().f1457o.t(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override
    public Task then(Object obj) {
        int i10 = 0;
        switch (this.f49391a) {
            case 24:
                m9.a aVar = (m9.a) obj;
                f9.o oVar = ((f9.l) this.f49393c).f5948e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{f9.o.b(oVar), oVar.f5965m.v((Executor) this.f49392b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            case 25:
                m9.a aVar2 = (m9.a) obj;
                f9.m mVar = (f9.m) this.f49393c;
                if (aVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                b bVar = (b) mVar.f5951c;
                b bVar2 = (b) mVar.f5951c;
                f9.o.b((f9.o) bVar.f49393c);
                ((f9.o) bVar2.f49393c).f5965m.v((Executor) this.f49392b, null);
                ((f9.o) bVar2.f49393c).f5969q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((f9.o) this.f49393c).f5958e.R(new f9.m(i10, this, (Boolean) obj));
        }
    }

    public void u(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void v(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.v(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void w(androidx.fragment.app.s f10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.w(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void x(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void y(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void z(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.j.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f49392b).f1466y;
        if (sVar != null) {
            sVar.p().f1457o.z(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f49393c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override
    public Object zzp() {
        HashMap map;
        Map map2;
        HashMap mapB;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f49392b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f49393c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false) {
            mapB = bVar.b();
        } else {
            map = bVar.f3781e;
        }
        if (map2 == null) {
            map2 = map;
            map2 = mapB;
            synchronized (bVar.d) {
                try {
                    HashMap map3 = bVar.f3781e;
                    map2 = map3;
                    if (map3 == null) {
                        HashMap mapB2 = bVar.b();
                        bVar.f3781e = mapB2;
                        map2 = mapB2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.EMPTY_MAP;
        }
        return (String) map2.get(dVar.f3793b);
    }

    public b(Object obj, int i10) {
        this.f49391a = i10;
        this.f49392b = obj;
        this.f49393c = null;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f49391a = i10;
        this.f49392b = obj;
        this.f49393c = obj2;
    }

    public b(androidx.fragment.app.j0 j0Var) {
        this.f49391a = 5;
        this.f49392b = j0Var;
        this.f49393c = new CopyOnWriteArrayList();
    }

    public b(int i10, byte b10) {
        this.f49391a = i10;
        switch (i10) {
            case 2:
                break;
            case 7:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f49392b = byteArrayOutputStream;
                this.f49393c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 12:
                this.f49392b = new HashMap();
                break;
            case 16:
                this.f49392b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f49393c = new ReferenceQueue();
                break;
            case 23:
                this.f49392b = new a0.f(0);
                this.f49393c = new a0.h();
                break;
            case 28:
                this.f49392b = new AtomicInteger();
                this.f49393c = new AtomicInteger();
                break;
            default:
                n5.a aVarC = n5.a.c(ApplicationLoader.applicationContext);
                u3.k kVar = new u3.k(7);
                aVarC.getClass();
                y5.l.e("Must be called from the main thread.");
                n5.h hVar = aVarC.f18281c;
                hVar.getClass();
                try {
                    n5.z zVar = hVar.f18319a;
                    n5.k kVar2 = new n5.k(kVar);
                    Parcel parcelM0 = zVar.M0();
                    com.google.android.gms.internal.cast.t.d(parcelM0, kVar2);
                    zVar.Q0(parcelM0, 4);
                } catch (RemoteException e9) {
                    n5.h.f18318c.a(e9, "Unable to call %s on %s.", "addCastStateListener", n5.z.class.getSimpleName());
                }
                this.f49392b = new u2.b(9);
                n5.h hVarB = aVarC.b();
                this.f49393c = hVarB;
                hVarB.a(this);
                Q(hVarB.c());
                break;
        }
    }

    public b(Context context, int i10) {
        this.f49391a = i10;
        switch (i10) {
            case 14:
                this.f49392b = context;
                break;
            default:
                w wVar = new w();
                this.f49392b = context.getApplicationContext();
                this.f49393c = wVar;
                break;
        }
    }

    public b(t8.h hVar) {
        this.f49391a = 1;
        this.f49393c = hVar;
    }

    public b(t tVar, xa.a aVar, androidx.emoji2.text.d dVar) {
        this.f49391a = 3;
        this.f49392b = tVar;
        this.f49393c = dVar;
    }

    public b(t1 t1Var) {
        this.f49391a = 22;
        this.f49392b = t1Var;
        s1 s1Var = new s1();
        s1Var.f5825a = 0;
        this.f49393c = s1Var;
    }

    public b(int i10) {
        this.f49391a = 21;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f49392b = bitmapCreateBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f49393c = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
    }

    public b(Animator animator) {
        this.f49391a = 4;
        this.f49392b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f49393c = animatorSet;
        animatorSet.play(animator);
    }

    public b(f9.l lVar, Executor executor, String str) {
        this.f49391a = 24;
        this.f49393c = lVar;
        this.f49392b = executor;
    }
}
