package xh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.w7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import yh.d5;
import yh.e5;
public abstract class s2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final dq F;
    public final FrameLayout G;
    public int H;
    public q80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final u1 N;
    public final me.b O;
    public int P;
    public int Q;
    public w7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 f51555a;
    public final int f51556b;
    public final long f51557c;
    public final e5 d;
    public final d5 f51558e;
    public final e6 f51559f;
    public final x1 h;
    public final o91 f51560n;
    public final FrameLayout f51561r;
    public final SpannableStringBuilder f51562s;
    public final SpannableStringBuilder v;
    public final ci.d f51563w;
    public int f51564x;
    public final LinearLayout f51565y;

    public s2(int r28, long r29, android.content.Context r31, org.telegram.ui.ActionBar.n2 r32, org.telegram.ui.ActionBar.e6 r33) {
        throw new UnsupportedOperationException("Method not decompiled: xh.s2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.e6):void");
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, e5 e5Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new sa(e5Var, i10, runnable, 22));
        f1Var.setOnLongClickListener(new ab(e5Var, i10, runnable));
    }

    public final void a() {
        e5 e5Var;
        o2 currentPage = getCurrentPage();
        if (currentPage != null && (e5Var = currentPage.f51482e) != null && currentPage.d) {
            int i10 = e5Var.d;
            new m4(this.f51555a, this.f51557c, i10, new ei.q4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        d5 d5Var = this.f51558e;
        if (!d5Var.h() || d5Var.d().size() >= MessagesController.getInstance(this.f51556b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j3 = this.f51557c;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f51556b;
        if (i10 >= 0) {
            if (j3 != 0 && j3 != UserConfig.getInstance(i11).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j3)), 5);
    }

    public final boolean d() {
        if (this.f51557c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f51565y;
        ci.d dVar = this.f51563w;
        long j3 = this.f51557c;
        int i15 = 8;
        if (i10 == i14) {
            if (((Long) objArr[0]).longValue() == j3) {
                if (d()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                dVar.setVisibility(i13);
                if (d()) {
                    i15 = 0;
                }
                linearLayout.setVisibility(i15);
                this.f51564x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.F.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j3) {
                f(true);
                n();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (d()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            dVar.setVisibility(i12);
            if (d()) {
                i15 = 0;
            }
            linearLayout.setVisibility(i15);
            this.f51564x = 60;
            setVisibleHeight(this.Q);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.M > 0) {
            ArrayList d = this.f51558e.d();
            int i10 = 0;
            while (true) {
                if (i10 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.M) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i10 >= 0 && tL_starGiftCollection != null) {
                this.M = 0;
                this.f51560n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        x1 x1Var = this.h;
        if (x1Var != null && this.f51560n != null) {
            x1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        o2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f51484n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f51561r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.q.B(this.f51564x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f51564x));
        }
        return (int) (AndroidUtilities.dp(this.f51564x) - translationY);
    }

    public e5 getCurrentList() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f51482e;
        }
        return this.d;
    }

    public rm0 getCurrentListView() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f51483f;
        }
        return null;
    }

    public o2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (o2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        e5 e5Var;
        int i11;
        o2 currentPage = getCurrentPage();
        e5 e5Var2 = this.d;
        if (currentPage != null && (e5Var = currentPage.f51482e) != e5Var2) {
            if (e5Var != null && (i11 = e5Var.f52488n) > 0) {
                return i11;
            }
        } else if (e5Var2 != null && (i10 = e5Var2.f52488n) > 0) {
            return i10;
        }
        long j3 = this.f51557c;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i13 = this.f51556b;
        if (i12 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i13).getUserFull(j3);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i13).getChatFull(-j3);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        e5 e5Var = this.d;
        if (e5Var != null && !e5Var.f52486l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < e5Var.f52486l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) e5Var.f52486l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f20048id));
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f20048id));
                    i10++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        x1 x1Var = this.h;
        float f7 = 0.0f;
        if (x1Var.getViewPages() != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    f7 = (((o2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        o91 o91Var = this.f51560n;
        if (o91Var != null) {
            return o91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        l80 l80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        e6 e6Var = this.f51559f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (str != null) {
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        a2 a2Var = new a2(this, context, e6Var);
        a2Var.lineYFix = true;
        a2Var.setOnEditorActionListener(new b2(a2Var, callback, b2VarArr, view));
        MediaDataController.getInstance(this.f51556b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        a2Var.setTextSize(1, 18.0f);
        a2Var.setTextColor(i6.w0(i6.f20909j5, e6Var));
        a2Var.setHintColor(i6.w0(i6.Xh, e6Var));
        a2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        a2Var.setFocusable(true);
        a2Var.setInputType(147457);
        a2Var.setLineColors(i6.w0(i6.f20929k6, e6Var), i6.w0(i6.f20947l6, e6Var), i6.w0(i6.f21022p7, e6Var));
        a2Var.setImeOptions(6);
        a2Var.setBackgroundDrawable(null);
        a2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        a2Var.addTextChangedListener(new c2(a2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a2Var.setText(str);
        linearLayout.addView(a2Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f20378a.f20411a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new qg.x1(16, a2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xa.b(2));
        b2VarArr[0] = alertDialog$Builder.f20378a;
        q80 q80Var = this.I;
        if (q80Var != null && (l80Var = q80Var.f30110m) != null) {
            l80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f51555a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new ei.t0(this, a2Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new hg.s(3, a2Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.f20425h0 = false;
        b2Var.d(-1);
        a2Var.setSelection(a2Var.getText().length());
    }

    public final void i() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        e5 e5Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            d5 d5Var = this.f51558e;
            if (i11 < d5Var.d().size()) {
                if (i11 >= 0 && i11 < d5Var.d().size()) {
                    e5Var = d5Var.e(((TL_stars.TL_starGiftCollection) d5Var.d().get(i11)).collection_id);
                } else {
                    e5Var = null;
                }
                if (e5Var != null) {
                    return e5Var.f52486l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f7;
        float nextPositionAlpha;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        xb xbVar;
        x1 x1Var = this.h;
        if (x1Var != null) {
            float f10 = 1.0f;
            if (x1Var.getCurrentPosition() == x1Var.getNextPosition()) {
                if (!k(x1Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(x1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = x1Var.getCurrentPositionAlpha() * f7;
                if (!k(x1Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((x1Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f51561r;
            float B = nextPositionAlpha + org.telegram.messenger.q.B(this.f51564x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            me.b bVar = this.O;
            bVar.a(z10, true);
            float f11 = bVar.f16341e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.P);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.f51558e.h() && x1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f51562s;
            }
            this.f51563w.g(spannableStringBuilder, true, true);
            tc tcVar = tc.f31088w;
            if (tcVar != null && (xbVar = tcVar.f31092e) != null) {
                xbVar.updatePosition();
            }
        }
    }

    public final void m() {
        ci.d dVar = this.f51563w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = i6.Oh;
        e6 e6Var = this.f51559f;
        dVar.setBackground(i6.c0(dp, ((ss0) this).U.V0(i6.w0(i10, e6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    o2 o2Var = (o2) view;
                    e6 e6Var2 = o2Var.f51481c;
                    if (o2Var.f51486s != null) {
                        o2Var.f51487w.setTextColor(i6.w0(i6.G6, e6Var2));
                        TextView textView = o2Var.f51488x;
                        int i11 = i6.Oh;
                        textView.setTextColor(i6.w0(i11, e6Var2));
                        o2Var.f51488x.setBackground(i6.Z(i6.m1(0.1f, i6.w0(i11, e6Var2)), 4, 4));
                    } else {
                        o2Var.F.setTextColor(i6.w0(i6.G6, e6Var2));
                        o2Var.G.setTextColor(i6.w0(i6.f21185y6, e6Var2));
                        o2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(i6.w0(i6.f20909j5, e6Var));
        this.f51565y.setBackground(i6.Z(i6.w0(i6.f20892i6, e6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.f51558e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        x1 x1Var = this.h;
        if (x1Var.getViewPages() != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    ((o2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        View[] viewPages;
        float f10;
        o91 o91Var = this.f51560n;
        if (o91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        o91Var.setTranslationY(min);
        o91Var.setScaleX(lerp);
        o91Var.setScaleY(lerp);
        x1 x1Var = this.h;
        if (x1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    if (((o2) view).I) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    f7 += f10;
                }
            }
        } else {
            f7 = 0.0f;
        }
        o91Var.setAlpha(w7.o.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f51556b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.f52489o = true;
            e5Var.a();
        }
        d5 d5Var = this.f51558e;
        if (d5Var != null) {
            d5Var.f52436j = true;
            d5Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        o2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f51556b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.f52489o = false;
        }
        d5 d5Var = this.f51558e;
        if (d5Var != null) {
            d5Var.f52436j = false;
        }
    }

    public abstract void p(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.P != i10) {
            this.P = i10;
            l();
        }
    }

    public void setPaddingTop(int i10) {
        View[] viewPages;
        if (this.K != i10) {
            this.K = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof o2) {
                    o2 o2Var = (o2) view;
                    j2 j2Var = o2Var.f51483f;
                    int paddingTop = j2Var.getPaddingTop();
                    j2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(j2Var, new v1(o2Var, paddingTop - j2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            o2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            p(g());
            this.f51560n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new s1(profileActivity, 0));
                }
            }
            if (!z10) {
                u1 u1Var = this.N;
                AndroidUtilities.cancelRunOnUIThread(u1Var);
                AndroidUtilities.runOnUIThread(u1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.Q = i10;
        l();
        x1 x1Var = this.h;
        if (x1Var != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    ((o2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
