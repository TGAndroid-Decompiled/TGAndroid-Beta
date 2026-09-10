package t7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import bi.cb;
import bi.u6;
import c3.b0;
import c3.h0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import l.x;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.k71;
import org.telegram.ui.rv0;
import org.telegram.ui.zd;
public final class u implements ag.a, bg.a, c3.q, q9.e, ea.a, fb.n, g2.g, com.google.android.gms.common.api.internal.s, x, n6.k, q9.d, no0, k1, p2.s, OnFailureListener, r4.c, u9.a, SuccessContinuation, y6.c, k71, z3.k {
    public static u f42105a;
    public static u f42106b;

    @Override
    public void B() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean C(b2.s sVar) {
        return false;
    }

    @Override
    public boolean E1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public int F(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override
    public void G(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean G1() {
        return false;
    }

    @Override
    public h0 I(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public y2.p J() {
        return new p2.r(p2.o.f39613n, null);
    }

    @Override
    public int J1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle M1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean P(t1 t1Var) {
        return false;
    }

    @Override
    public Object P1(u6 u6Var) {
        return new qb.d(u6Var.c(qb.h.class));
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public y2.p T(p2.o oVar, p2.l lVar) {
        return new p2.r(oVar, lVar);
    }

    @Override
    public int U() {
        return 0;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void W(float f7, boolean z10) {
        zd.f39262b = f7 * 2.0f;
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public gh.a X() {
        return null;
    }

    @Override
    public rv0 X1() {
        return null;
    }

    @Override
    public boolean Y(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Y1(long j3) {
        return false;
    }

    @Override
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (q9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f40551a;
            if (str != null) {
                aVar = new q9.a(str, aVar.f40552b, aVar.f40553c, aVar.d, aVar.e, new cb(2, str, aVar), aVar.f40555g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.f11807a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f11808a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public g2.h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public z3.m d(b2.s sVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        return em.a(messageObject);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int h(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public int k(b2.s sVar) {
        return 1;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
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
    public boolean l0() {
        return false;
    }

    @Override
    public Object n2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public boolean o0(y5 y5Var) {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public void p(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public void s0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            bg.a.f2251o.s0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            bg.a.f2250m.s0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public boolean t2(int i10) {
        return false;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public boolean u(l.l lVar) {
        return false;
    }

    @Override
    public String v(long j3) {
        return null;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public t9 x2() {
        return null;
    }

    @Override
    public boolean z1() {
        return false;
    }

    @Override
    public void A0() {
    }

    @Override
    public void Q1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void r() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void w() {
    }

    @Override
    public void y() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B1(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var) {
    }

    @Override
    public void E0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void I1(t1 t1Var) {
    }

    @Override
    public void K(t1 t1Var) {
    }

    @Override
    public void K1(MessageObject messageObject) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void S(t1 t1Var) {
    }

    @Override
    public void X0(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void c2(t1 t1Var) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void k2(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void z0(t1 t1Var) {
    }

    @Override
    public void C1(t1 t1Var, boolean z10) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, t1 t1Var) {
    }

    @Override
    public void P0(int i10, t1 t1Var) {
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(t1 t1Var, ai.j jVar) {
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void c(l.l lVar, boolean z10) {
    }

    @Override
    public void e2(t1 t1Var, long j3) {
    }

    @Override
    public void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void o1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void x(int i10, Object obj) {
    }

    @Override
    public void B0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void t1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void w2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
