package pa;

import a3.n0;
import a8.me;
import a8.yb;
import ag.j;
import ai.f0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.b2;
import bi.r;
import c3.b0;
import c3.j0;
import c3.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import f9.i0;
import hb.n;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import k9.u;
import l.k;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.cv0;
import org.telegram.ui.d3;
import p2.m;
import p2.p;
import p2.s;
import p2.t;
import sb.l;
public final class d implements n0, q, dg.a, s9.e, fa.b, ga.a, n, w, kp0, j1, t, s9.d, r4.c, v5.a, w9.a, Continuation, z6.d {
    public static final CharSequence B(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static fa.a e(sb.b bVar) {
        return new fa.a(System.currentTimeMillis() + 3600000, new j(8), new cc.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static byte[] f(i0 i0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yb.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.f7854x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static short k(short s10, short s11) {
        int i10;
        int i11 = s10 + 32768;
        int i12 = s11 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    @Override
    public boolean C0(long j10) {
        return false;
    }

    @Override
    public boolean C1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void D1(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public fa.a E(sb.b bVar, JSONObject jSONObject) {
        return e(bVar);
    }

    @Override
    public cv0 E1() {
        return null;
    }

    @Override
    public j0 F1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public y2.n G() {
        return new s(p.f46588n, null);
    }

    @Override
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(k(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public boolean G1(long j10) {
        return false;
    }

    @Override
    public boolean I1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean J0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean L(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean M() {
        return false;
    }

    @Override
    public boolean N(s1 s1Var) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O0(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public void Q0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public y2.n R(p pVar, m mVar) {
        return new s(pVar, mVar);
    }

    @Override
    public int S() {
        return 0;
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override
    public void U(float f7, boolean z10) {
        r.f5310b = f7 * 2.0f;
    }

    @Override
    public Object U1() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public jh.a V() {
        return null;
    }

    @Override
    public boolean W(s1 s1Var) {
        return false;
    }

    @Override
    public boolean X(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean X1(int i10) {
        return false;
    }

    @Override
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (s9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f47983a;
            if (str != null) {
                aVar = new s9.a(str, aVar.f47984b, aVar.f47985c, aVar.d, aVar.e, new f0(13, str, aVar), aVar.f47987g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public void b(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public t9 b2() {
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int c0(s1 s1Var) {
        return 0;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public Object d1(me meVar) {
        sb.a aVar = new sb.a();
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(7);
        ReferenceQueue referenceQueue = aVar.f48040a;
        Set set = aVar.f48041b;
        set.add(new l(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new u(26, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public String h(s1 s1Var) {
        return null;
    }

    @Override
    public boolean h0(c6 c6Var) {
        return false;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public a3.l l0(Context context, String str, z6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.f139a = cVar.U(context, str);
        int i10 = 1;
        int t10 = cVar.t(context, str, true);
        lVar.f140b = t10;
        int i11 = lVar.f139a;
        if (i11 == 0) {
            i11 = 0;
            if (t10 == 0) {
                i10 = 0;
                lVar.f141c = i10;
                return lVar;
            }
        }
        if (t10 < i11) {
            i10 = -1;
        }
        lVar.f141c = i10;
        return lVar;
    }

    @Override
    public long o() {
        return System.currentTimeMillis();
    }

    @Override
    public boolean p1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public boolean t(k kVar) {
        return false;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public String u(long j10) {
        return null;
    }

    @Override
    public void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public StackTraceElement[] w(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i13 = 1;
            i10 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public CharacterStyle w1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean y1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void A() {
    }

    @Override
    public void T() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void q() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void y() {
    }

    @Override
    public void z() {
    }

    @Override
    public void z1() {
    }

    @Override
    public void A0(s1 s1Var) {
    }

    @Override
    public void D(s1 s1Var) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I(s1 s1Var) {
    }

    @Override
    public void K(MessageObject messageObject) {
    }

    @Override
    public void K0(s1 s1Var) {
    }

    @Override
    public void K1(s1 s1Var) {
    }

    @Override
    public void L0(s1 s1Var) {
    }

    @Override
    public void Q(s1 s1Var) {
    }

    @Override
    public void R1(s1 s1Var) {
    }

    @Override
    public void Z(int i10) {
    }

    @Override
    public void d0(s1 s1Var) {
    }

    @Override
    public void g0(String str) {
    }

    @Override
    public void m(s1 s1Var) {
    }

    @Override
    public void m1(s1 s1Var) {
    }

    @Override
    public void onVideoSizeChanged(b2 b2Var) {
    }

    @Override
    public void p(s1 s1Var) {
    }

    @Override
    public void r(s1 s1Var) {
    }

    @Override
    public void r0(s1 s1Var) {
    }

    @Override
    public void s(s1 s1Var) {
    }

    @Override
    public void s1(s1 s1Var) {
    }

    @Override
    public void u1(MessageObject messageObject) {
    }

    @Override
    public void v(s1 s1Var) {
    }

    @Override
    public void w0(s1 s1Var) {
    }

    @Override
    public void x(s1 s1Var) {
    }

    @Override
    public void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void C(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, s1 s1Var) {
    }

    @Override
    public void F0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void J(int i10, s1 s1Var) {
    }

    @Override
    public void M1(s1 s1Var, long j10) {
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Y(int i10, Object obj) {
    }

    @Override
    public void Z0(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void g(k kVar, boolean z10) {
    }

    @Override
    public void n0(s1 s1Var, bh.n nVar) {
    }

    @Override
    public void n1(s1 s1Var, boolean z10) {
    }

    @Override
    public void q1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void I0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void a2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void b0(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void f1(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void j0(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void l1(s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void t0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void u0(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void y0(s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void B1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void m0(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void o0(s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void H1(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void P(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
