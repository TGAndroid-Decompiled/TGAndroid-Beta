package t7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import l.x;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.i71;
import org.telegram.ui.pv0;
import org.telegram.ui.yd;
public final class u implements bg.a, c3.g, cg.a, ea.a, fb.o, g2.g, com.google.android.gms.common.api.internal.s, x, n6.k, q9.d, to0, l1, p2.s, OnFailureListener, r4.c, u9.a, SuccessContinuation, x9.c, y6.d, y2.j, i71 {
    public static u f43358a;
    public static u f43359b;

    public u(Object obj) {
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
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
            i10 = i11;
            i13 = 1;
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
    public Object G(cf.c cVar) {
        return new qb.d(cVar.e(qb.h.class));
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public y2.o H() {
        return new p2.r(p2.o.f40803n, null);
    }

    @Override
    public boolean I1() {
        return false;
    }

    @Override
    public void J(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public y2.o K(p2.o oVar, p2.l lVar) {
        return new p2.r(oVar, lVar);
    }

    @Override
    public int L1(int i10, int i11, int i12) {
        bg.a aVar;
        if (i11 == 6) {
            aVar = bg.a.f3559l;
        } else if (i11 > i12) {
            aVar = bg.a.f3556i;
        } else if (i11 < i12) {
            aVar = bg.a.f3557j;
        } else {
            aVar = bg.a.f3558k;
        }
        return aVar.L1(i10, i11, i12);
    }

    @Override
    public boolean N0(long j3) {
        return false;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void T0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        bg.a aVar;
        if (i10 == 6) {
            aVar = bg.a.f3559l;
        } else if (i10 > i11) {
            aVar = bg.a.f3556i;
        } else if (i10 < i11) {
            aVar = bg.a.f3557j;
        } else {
            aVar = bg.a.f3558k;
        }
        aVar.T0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        yd.f39906b = f7 * 2.0f;
    }

    @Override
    public boolean X0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public pv0 Y1() {
        return null;
    }

    @Override
    public void a() {
        synchronized (z2.b.f48397a) {
            Object obj = z2.b.f48398b;
            synchronized (obj) {
                if (z2.b.f48399c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f48399c = true;
                }
            }
        }
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.f12917a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f12918a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public String c() {
        return null;
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public g2.h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public a3.l d(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int d = cVar.d(context, str, true);
        lVar.f143b = d;
        if (d != 0) {
            lVar.f144c = 1;
            return lVar;
        }
        int m10 = cVar.m(context, str);
        lVar.f142a = m10;
        if (m10 != 0) {
            lVar.f144c = -1;
        }
        return lVar;
    }

    @Override
    public boolean d1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public String h(u1 u1Var) {
        return null;
    }

    @Override
    public int i0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean i1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public int l0() {
        return 0;
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public boolean p0(y5 y5Var) {
        return false;
    }

    @Override
    public Object p2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public boolean q(l.l lVar) {
        return false;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public s9 z2() {
        return null;
    }

    @Override
    public void A0() {
    }

    @Override
    public void B() {
    }

    @Override
    public void D() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void k() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void v() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
    }

    @Override
    public void K1(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void O0(u1 u1Var) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void Y0(u1 u1Var) {
    }

    @Override
    public void a1(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(u1 u1Var) {
    }

    @Override
    public void j0(u1 u1Var) {
    }

    @Override
    public long m(long j3) {
        return j3;
    }

    @Override
    public void m2(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void z(u1 u1Var) {
    }

    @Override
    public void z0(u1 u1Var) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E1(u1 u1Var, boolean z10) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void Q0(int i10, u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g(l.l lVar, boolean z10) {
    }

    @Override
    public void g2(u1 u1Var, long j3) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void n1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void q1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void x(int i10, Object obj) {
    }

    @Override
    public void B0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void W0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void r0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void v1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void y2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
