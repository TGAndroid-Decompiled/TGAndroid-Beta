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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.eb;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import yh.k5;
import yh.l5;
public abstract class s2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final op F;
    public final FrameLayout G;
    public int H;
    public o70 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final u1 N;
    public final le.c O;
    public int P;
    public int Q;
    public w7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 f46068a;
    public final int f46069b;
    public final long f46070c;
    public final l5 d;
    public final k5 e;
    public final d6 f46071f;
    public final x1 h;
    public final g81 f46072n;
    public final FrameLayout f46073r;
    public final SpannableStringBuilder f46074s;
    public final SpannableStringBuilder v;
    public final ci.d f46075w;
    public int f46076x;
    public final LinearLayout f46077y;

    public s2(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.n2 r30, org.telegram.ui.ActionBar.d6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: xh.s2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, l5 l5Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new wa(l5Var, i10, runnable, 20));
        f1Var.setOnLongClickListener(new eb(l5Var, i10, runnable));
    }

    public final void a() {
        l5 l5Var;
        o2 currentPage = getCurrentPage();
        if (currentPage != null && (l5Var = currentPage.e) != null && currentPage.d) {
            int i10 = l5Var.d;
            new m4(this.f46068a, this.f46070c, i10, new ei.r4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        k5 k5Var = this.e;
        if (!k5Var.h() || k5Var.d().size() >= MessagesController.getInstance(this.f46069b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f46069b;
        long j3 = this.f46070c;
        if (j3 >= 0) {
            if (j3 != 0 && j3 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public final boolean d() {
        if (this.f46070c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f46077y;
        ci.d dVar = this.f46075w;
        long j3 = this.f46070c;
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
                this.f46076x = 60;
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
            this.f46076x = 60;
            setVisibleHeight(this.Q);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.M > 0) {
            ArrayList d = this.e.d();
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
                this.f46072n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        x1 x1Var = this.h;
        if (x1Var != null && this.f46072n != null) {
            x1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        o2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f46003n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f46073r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.z0.B(this.f46076x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f46076x));
        }
        return (int) (AndroidUtilities.dp(this.f46076x) - translationY);
    }

    public l5 getCurrentList() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public ml0 getCurrentListView() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f46002f;
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
        l5 l5Var;
        int i11;
        o2 currentPage = getCurrentPage();
        l5 l5Var2 = this.d;
        if (currentPage != null && (l5Var = currentPage.e) != l5Var2) {
            if (l5Var != null && (i11 = l5Var.f47339n) > 0) {
                return i11;
            }
        } else if (l5Var2 != null && (i10 = l5Var2.f47339n) > 0) {
            return i10;
        }
        int i12 = this.f46069b;
        long j3 = this.f46070c;
        if (j3 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j3);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        l5 l5Var = this.d;
        if (l5Var != null && !l5Var.f47337l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < l5Var.f47337l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) l5Var.f47337l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f18089id));
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f18089id));
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
        g81 g81Var = this.f46072n;
        if (g81Var != null) {
            return g81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        j70 j70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        d6 d6Var = this.f46071f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        if (str != null) {
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        a2 a2Var = new a2(this, context, d6Var);
        a2Var.lineYFix = true;
        a2Var.setOnEditorActionListener(new b2(a2Var, callback, b2VarArr, view));
        MediaDataController.getInstance(this.f46069b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        a2Var.setTextSize(1, 18.0f);
        a2Var.setTextColor(h6.v0(h6.f18895j5, d6Var));
        a2Var.setHintColor(h6.v0(h6.Xh, d6Var));
        a2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        a2Var.setFocusable(true);
        a2Var.setInputType(147457);
        a2Var.setLineColors(h6.v0(h6.f18916k6, d6Var), h6.v0(h6.f18934l6, d6Var), h6.v0(h6.f19008p7, d6Var));
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
        alertDialog$Builder.f18409a.f18447a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new tg.d(11, a2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v3.d(10));
        b2VarArr[0] = alertDialog$Builder.f18409a;
        o70 o70Var = this.I;
        if (o70Var != null && (j70Var = o70Var.f26659m) != null) {
            j70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f46068a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new ei.t0(this, a2Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new hg.t(3, a2Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.f18460h0 = false;
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
        l5 l5Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            k5 k5Var = this.e;
            if (i11 < k5Var.d().size()) {
                if (i11 >= 0 && i11 < k5Var.d().size()) {
                    l5Var = k5Var.e(((TL_stars.TL_starGiftCollection) k5Var.d().get(i11)).collection_id);
                } else {
                    l5Var = null;
                }
                if (l5Var != null) {
                    return l5Var.f47337l.isEmpty();
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
        ub ubVar;
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
            FrameLayout frameLayout = this.f46073r;
            float B = nextPositionAlpha + org.telegram.messenger.z0.B(this.f46076x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            le.c cVar = this.O;
            cVar.a(z10, true);
            float f11 = cVar.e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.P);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.e.h() && x1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f46074s;
            }
            this.f46075w.g(spannableStringBuilder, true, true);
            qc qcVar = qc.f27299w;
            if (qcVar != null && (ubVar = qcVar.e) != null) {
                ubVar.updatePosition();
            }
        }
    }

    public final void m() {
        ci.d dVar = this.f46075w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = h6.Oh;
        d6 d6Var = this.f46071f;
        dVar.setBackground(h6.b0(dp, ((nr0) this).U.V0(h6.v0(i10, d6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    o2 o2Var = (o2) view;
                    d6 d6Var2 = o2Var.f46001c;
                    if (o2Var.f46005s != null) {
                        o2Var.f46006w.setTextColor(h6.v0(h6.G6, d6Var2));
                        TextView textView = o2Var.f46007x;
                        int i11 = h6.Oh;
                        textView.setTextColor(h6.v0(i11, d6Var2));
                        o2Var.f46007x.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i11, d6Var2)), 4, 4));
                    } else {
                        o2Var.F.setTextColor(h6.v0(h6.G6, d6Var2));
                        o2Var.G.setTextColor(h6.v0(h6.f19170y6, d6Var2));
                        o2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(h6.v0(h6.f18895j5, d6Var));
        this.f46077y.setBackground(h6.Y(h6.v0(h6.f18878i6, d6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
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
        g81 g81Var = this.f46072n;
        if (g81Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        g81Var.setTranslationY(min);
        g81Var.setScaleX(lerp);
        g81Var.setScaleY(lerp);
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
        g81Var.setAlpha(w7.p.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f46069b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.f47340o = true;
            l5Var.a();
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.f47299j = true;
            k5Var.i();
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
        int i10 = this.f46069b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.f47340o = false;
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.f47299j = false;
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
                    j2 j2Var = o2Var.f46002f;
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
            this.f46072n.setReordering(z10);
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
