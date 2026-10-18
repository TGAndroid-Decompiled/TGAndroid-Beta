package yh;

import ai.ha;
import ai.s8;
import ai.v9;
import ai.y9;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.m7;
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
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.z5;
public abstract class p2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final xp F;
    public final FrameLayout G;
    public int H;
    public i80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final q1 N;
    public final ne.b O;
    public int P;
    public int Q;
    public m7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 f50457a;
    public final int f50458b;
    public final long f50459c;
    public final y9 d;
    public final v9 e;
    public final d6 f50460f;
    public final u1 h;
    public final b91 f50461n;
    public final FrameLayout f50462r;
    public final SpannableStringBuilder f50463s;
    public final SpannableStringBuilder v;
    public final ei.d f50464w;
    public int f50465x;
    public final LinearLayout f50466y;

    public p2(int r27, long r28, android.content.Context r30, org.telegram.ui.ActionBar.n2 r31, org.telegram.ui.ActionBar.d6 r32) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.d6):void");
    }

    public static void j(org.telegram.ui.ActionBar.e1 e1Var, y9 y9Var, Runnable runnable, int i10) {
        e1Var.setOnClickListener(new ha(y9Var, i10, runnable, 23));
        e1Var.setOnLongClickListener(new ya(y9Var, i10, runnable));
    }

    public final void a() {
        y9 y9Var;
        l2 currentPage = getCurrentPage();
        if (currentPage != null && (y9Var = currentPage.e) != null && currentPage.d) {
            int i10 = y9Var.d;
            new k4(this.f50457a, this.f50459c, i10, new gi.g4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        v9 v9Var = this.e;
        if (!v9Var.h() || v9Var.d().size() >= MessagesController.getInstance(this.f50458b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j10 = this.f50459c;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f50458b;
        if (i10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i11).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        if (this.f50459c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f50466y;
        ei.d dVar = this.f50464w;
        long j10 = this.f50459c;
        int i15 = 8;
        if (i10 == i14) {
            if (((Long) objArr[0]).longValue() == j10) {
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
                this.f50465x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.F.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
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
            this.f50465x = 60;
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
                this.f50461n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        u1 u1Var = this.h;
        if (u1Var != null && this.f50461n != null) {
            u1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        l2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f50363n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f50462r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.g0.B(this.f50465x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f50465x));
        }
        return (int) (AndroidUtilities.dp(this.f50465x) - translationY);
    }

    public y9 getCurrentList() {
        l2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public im0 getCurrentListView() {
        l2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f50362f;
        }
        return null;
    }

    public l2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (l2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        y9 y9Var;
        int i11;
        l2 currentPage = getCurrentPage();
        y9 y9Var2 = this.d;
        if (currentPage != null && (y9Var = currentPage.e) != y9Var2) {
            if (y9Var != null && (i11 = y9Var.f2501n) > 0) {
                return i11;
            }
        } else if (y9Var2 != null && (i10 = y9Var2.f2501n) > 0) {
            return i10;
        }
        long j10 = this.f50459c;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f50458b;
        if (i12 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i13).getUserFull(j10);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i13).getChatFull(-j10);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        y9 y9Var = this.d;
        if (y9Var != null && !y9Var.f2499l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < y9Var.f2499l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) y9Var.f2499l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f20278id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f20278id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        u1 u1Var = this.h;
        float f7 = 0.0f;
        if (u1Var.getViewPages() != null) {
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    f7 = (((l2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        b91 b91Var = this.f50461n;
        if (b91Var != null) {
            return b91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        d80 d80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        d6 d6Var = this.f50460f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        if (str != null) {
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        x1 x1Var = new x1(this, context, d6Var);
        x1Var.lineYFix = true;
        x1Var.setOnEditorActionListener(new y1(x1Var, callback, b2VarArr, view));
        MediaDataController.getInstance(this.f50458b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        x1Var.setTextSize(1, 18.0f);
        x1Var.setTextColor(h6.w0(h6.f21092j5, d6Var));
        x1Var.setHintColor(h6.w0(h6.Xh, d6Var));
        x1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        x1Var.setFocusable(true);
        x1Var.setInputType(147457);
        x1Var.setLineColors(h6.w0(h6.f21113k6, d6Var), h6.w0(h6.f21130l6, d6Var), h6.w0(h6.f21207p7, d6Var));
        x1Var.setImeOptions(6);
        x1Var.setBackgroundDrawable(null);
        x1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        x1Var.addTextChangedListener(new z1(x1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        x1Var.setText(str);
        linearLayout.addView(x1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f20601a.f20649a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new org.telegram.ui.web.n(22, x1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ya.b(2));
        b2VarArr[0] = alertDialog$Builder.f20601a;
        i80 i80Var = this.I;
        if (i80Var != null && (d80Var = i80Var.f27124m) != null) {
            d80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f50457a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new gi.r0(this, x1Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new ig.r(3, x1Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.f20662h0 = false;
        b2Var.d(-1);
        x1Var.setSelection(x1Var.getText().length());
    }

    public final void i() {
        l2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        y9 y9Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            v9 v9Var = this.e;
            if (i11 < v9Var.d().size()) {
                if (i11 >= 0 && i11 < v9Var.d().size()) {
                    y9Var = v9Var.e(((TL_stars.TL_starGiftCollection) v9Var.d().get(i11)).collection_id);
                } else {
                    y9Var = null;
                }
                if (y9Var != null) {
                    return y9Var.f2499l.isEmpty();
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
        u1 u1Var = this.h;
        if (u1Var != null) {
            float f10 = 1.0f;
            if (u1Var.getCurrentPosition() == u1Var.getNextPosition()) {
                if (!k(u1Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(u1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = u1Var.getCurrentPositionAlpha() * f7;
                if (!k(u1Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((u1Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f50462r;
            float B = nextPositionAlpha + org.telegram.messenger.g0.B(this.f50465x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            ne.b bVar = this.O;
            bVar.a(z10, true);
            float f11 = bVar.e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.P);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.e.h() && u1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f50463s;
            }
            this.f50464w.g(spannableStringBuilder, true, true);
            qc qcVar = qc.f29631w;
            if (qcVar != null && (ubVar = qcVar.e) != null) {
                ubVar.updatePosition();
            }
        }
    }

    public final void m() {
        ei.d dVar = this.f50464w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = h6.Oh;
        d6 d6Var = this.f50460f;
        dVar.setBackground(h6.c0(dp, ((is0) this).U.X0(h6.w0(i10, d6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    l2 l2Var = (l2) view;
                    d6 d6Var2 = l2Var.f50361c;
                    if (l2Var.f50365s != null) {
                        l2Var.f50366w.setTextColor(h6.w0(h6.G6, d6Var2));
                        TextView textView = l2Var.f50367x;
                        int i11 = h6.Oh;
                        textView.setTextColor(h6.w0(i11, d6Var2));
                        l2Var.f50367x.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i11, d6Var2)), 4, 4));
                    } else {
                        l2Var.F.setTextColor(h6.w0(h6.G6, d6Var2));
                        l2Var.G.setTextColor(h6.w0(h6.f21374y6, d6Var2));
                        l2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(h6.w0(h6.f21092j5, d6Var));
        this.f50466y.setBackground(h6.Z(h6.w0(h6.f21075i6, d6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1 u1Var = this.h;
        if (u1Var.getViewPages() != null) {
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    ((l2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        View[] viewPages;
        float f10;
        b91 b91Var = this.f50461n;
        if (b91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        b91Var.setTranslationY(min);
        b91Var.setScaleX(lerp);
        b91Var.setScaleY(lerp);
        u1 u1Var = this.h;
        if (u1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    if (((l2) view).I) {
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
        b91Var.setAlpha(w7.r.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f50458b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        l2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        y9 y9Var = this.d;
        if (y9Var != null) {
            y9Var.f2502o = true;
            y9Var.a();
        }
        v9 v9Var = this.e;
        if (v9Var != null) {
            v9Var.f2335j = true;
            v9Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        l2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f50458b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        y9 y9Var = this.d;
        if (y9Var != null) {
            y9Var.f2502o = false;
        }
        v9 v9Var = this.e;
        if (v9Var != null) {
            v9Var.f2335j = false;
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
                if (view instanceof l2) {
                    l2 l2Var = (l2) view;
                    g2 g2Var = l2Var.f50362f;
                    int paddingTop = g2Var.getPaddingTop();
                    g2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(g2Var, new r1(l2Var, paddingTop - g2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        l2 currentPage = getCurrentPage();
        if (currentPage != null) {
            l2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            p(g());
            this.f50461n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new s8(profileActivity, 1));
                }
            }
            if (!z10) {
                q1 q1Var = this.N;
                AndroidUtilities.cancelRunOnUIThread(q1Var);
                AndroidUtilities.runOnUIThread(q1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.Q = i10;
        l();
        u1 u1Var = this.h;
        if (u1Var != null) {
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    ((l2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
