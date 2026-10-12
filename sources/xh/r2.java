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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.w5;
import yh.d5;
import yh.f5;
public abstract class r2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final fq F;
    public final FrameLayout G;
    public int H;
    public s80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final t1 N;
    public final me.b O;
    public int P;
    public int Q;
    public w7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.m2 f51721a;
    public final int f51722b;
    public final long f51723c;
    public final f5 d;
    public final d5 f51724e;
    public final c6 f51725f;
    public final w1 h;
    public final t91 f51726n;
    public final FrameLayout f51727r;
    public final SpannableStringBuilder f51728s;
    public final SpannableStringBuilder v;
    public final ci.d f51729w;
    public int f51730x;
    public final LinearLayout f51731y;

    public r2(int r28, long r29, android.content.Context r31, org.telegram.ui.ActionBar.m2 r32, org.telegram.ui.ActionBar.c6 r33) {
        throw new UnsupportedOperationException("Method not decompiled: xh.r2.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.c6):void");
    }

    public static void j(org.telegram.ui.ActionBar.e1 e1Var, f5 f5Var, Runnable runnable, int i10) {
        e1Var.setOnClickListener(new sa(f5Var, i10, runnable, 22));
        e1Var.setOnLongClickListener(new ab(f5Var, i10, runnable));
    }

    public final void a() {
        f5 f5Var;
        n2 currentPage = getCurrentPage();
        if (currentPage != null && (f5Var = currentPage.f51625e) != null && currentPage.d) {
            int i10 = f5Var.d;
            new l4(this.f51721a, this.f51723c, i10, new ei.q4(this, i10, currentPage, 5)).show();
        }
    }

    public final boolean b() {
        d5 d5Var = this.f51724e;
        if (!d5Var.h() || d5Var.d().size() >= MessagesController.getInstance(this.f51722b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j3 = this.f51723c;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f51722b;
        if (i10 >= 0) {
            if (j3 != 0 && j3 != UserConfig.getInstance(i11).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j3)), 5);
    }

    public final boolean d() {
        if (this.f51723c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f51731y;
        ci.d dVar = this.f51729w;
        long j3 = this.f51723c;
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
                this.f51730x = 60;
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
            this.f51730x = 60;
            setVisibleHeight(this.Q);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.M > 0) {
            ArrayList d = this.f51724e.d();
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
                this.f51726n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        w1 w1Var = this.h;
        if (w1Var != null && this.f51726n != null) {
            w1Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        n2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f51627n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f51727r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.v0.B(this.f51730x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-frameLayout.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.f51730x));
        }
        return (int) (AndroidUtilities.dp(this.f51730x) - translationY);
    }

    public f5 getCurrentList() {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f51625e;
        }
        return this.d;
    }

    public wm0 getCurrentListView() {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f51626f;
        }
        return null;
    }

    public n2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (n2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        f5 f5Var;
        int i11;
        n2 currentPage = getCurrentPage();
        f5 f5Var2 = this.d;
        if (currentPage != null && (f5Var = currentPage.f51625e) != f5Var2) {
            if (f5Var != null && (i11 = f5Var.f52745n) > 0) {
                return i11;
            }
        } else if (f5Var2 != null && (i10 = f5Var2.f52745n) > 0) {
            return i10;
        }
        long j3 = this.f51723c;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i13 = this.f51722b;
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
        f5 f5Var = this.d;
        if (f5Var != null && !f5Var.f52743l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < f5Var.f52743l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) f5Var.f52743l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f19808id));
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f19808id));
                    i10++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        w1 w1Var = this.h;
        float f7 = 0.0f;
        if (w1Var.getViewPages() != null) {
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    f7 = (((n2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        t91 t91Var = this.f51726n;
        if (t91Var != null) {
            return t91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        n80 n80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        c6 c6Var = this.f51725f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str != null) {
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        z1 z1Var = new z1(this, context, c6Var);
        z1Var.lineYFix = true;
        z1Var.setOnEditorActionListener(new a2(z1Var, callback, a2VarArr, view));
        MediaDataController.getInstance(this.f51722b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        z1Var.setTextSize(1, 18.0f);
        z1Var.setTextColor(h6.w0(h6.f20667j5, c6Var));
        z1Var.setHintColor(h6.w0(h6.Xh, c6Var));
        z1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        z1Var.setFocusable(true);
        z1Var.setInputType(147457);
        z1Var.setLineColors(h6.w0(h6.f20687k6, c6Var), h6.w0(h6.f20705l6, c6Var), h6.w0(h6.f20780p7, c6Var));
        z1Var.setImeOptions(6);
        z1Var.setBackgroundDrawable(null);
        z1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        z1Var.addTextChangedListener(new b2(z1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        z1Var.setText(str);
        linearLayout.addView(z1Var, w5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f20141a.f20150a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new qg.x1(17, z1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w9.w(4));
        a2VarArr[0] = alertDialog$Builder.f20141a;
        s80 s80Var = this.I;
        if (s80Var != null && (n80Var = s80Var.f30462m) != null) {
            n80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f51721a.getClassGuid());
        a2VarArr[0].setOnDismissListener(new ei.t0(this, z1Var, findActivity, 6));
        a2VarArr[0].setOnShowListener(new hg.s(3, z1Var));
        a2VarArr[0].show();
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        a2Var.f20164h0 = false;
        a2Var.d(-1);
        z1Var.setSelection(z1Var.getText().length());
    }

    public final void i() {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        f5 f5Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            d5 d5Var = this.f51724e;
            if (i11 < d5Var.d().size()) {
                if (i11 >= 0 && i11 < d5Var.d().size()) {
                    f5Var = d5Var.e(((TL_stars.TL_starGiftCollection) d5Var.d().get(i11)).collection_id);
                } else {
                    f5Var = null;
                }
                if (f5Var != null) {
                    return f5Var.f52743l.isEmpty();
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
        wb wbVar;
        w1 w1Var = this.h;
        if (w1Var != null) {
            float f10 = 1.0f;
            if (w1Var.getCurrentPosition() == w1Var.getNextPosition()) {
                if (!k(w1Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(w1Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = w1Var.getCurrentPositionAlpha() * f7;
                if (!k(w1Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((w1Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f51727r;
            float B = nextPositionAlpha + org.telegram.messenger.v0.B(this.f51730x, (-frameLayout.getTop()) + this.Q, 1);
            int i10 = 0;
            if (this.Q > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            me.b bVar = this.O;
            bVar.a(z10, true);
            float f11 = bVar.f16087e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.P);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.f51724e.h() && w1Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f51728s;
            }
            this.f51729w.g(spannableStringBuilder, true, true);
            sc scVar = sc.f30532w;
            if (scVar != null && (wbVar = scVar.f30536e) != null) {
                wbVar.updatePosition();
            }
        }
    }

    public final void m() {
        ci.d dVar = this.f51729w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = h6.Oh;
        c6 c6Var = this.f51725f;
        dVar.setBackground(h6.c0(dp, ((xs0) this).U.V0(h6.w0(i10, c6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    n2 n2Var = (n2) view;
                    c6 c6Var2 = n2Var.f51624c;
                    if (n2Var.f51629s != null) {
                        n2Var.f51630w.setTextColor(h6.w0(h6.G6, c6Var2));
                        TextView textView = n2Var.f51631x;
                        int i11 = h6.Oh;
                        textView.setTextColor(h6.w0(i11, c6Var2));
                        n2Var.f51631x.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i11, c6Var2)), 4, 4));
                    } else {
                        n2Var.F.setTextColor(h6.w0(h6.G6, c6Var2));
                        n2Var.G.setTextColor(h6.w0(h6.f20945y6, c6Var2));
                        n2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(h6.w0(h6.f20667j5, c6Var));
        this.f51731y.setBackground(h6.Z(h6.w0(h6.f20650i6, c6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.f51724e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        w1 w1Var = this.h;
        if (w1Var.getViewPages() != null) {
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    ((n2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        View[] viewPages;
        float f10;
        t91 t91Var = this.f51726n;
        if (t91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        t91Var.setTranslationY(min);
        t91Var.setScaleX(lerp);
        t91Var.setScaleY(lerp);
        w1 w1Var = this.h;
        if (w1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    if (((n2) view).I) {
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
        t91Var.setAlpha(w7.n.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f51722b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.f52746o = true;
            f5Var.a();
        }
        d5 d5Var = this.f51724e;
        if (d5Var != null) {
            d5Var.f52616j = true;
            d5Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        n2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f51722b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.f52746o = false;
        }
        d5 d5Var = this.f51724e;
        if (d5Var != null) {
            d5Var.f52616j = false;
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
                if (view instanceof n2) {
                    n2 n2Var = (n2) view;
                    i2 i2Var = n2Var.f51626f;
                    int paddingTop = i2Var.getPaddingTop();
                    i2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(i2Var, new u1(n2Var, paddingTop - i2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        n2 currentPage = getCurrentPage();
        if (currentPage != null) {
            n2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            p(g());
            this.f51726n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new r1(profileActivity, 0));
                }
            }
            if (!z10) {
                t1 t1Var = this.N;
                AndroidUtilities.cancelRunOnUIThread(t1Var);
                AndroidUtilities.runOnUIThread(t1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.Q = i10;
        l();
        w1 w1Var = this.h;
        if (w1Var != null) {
            for (View view : w1Var.getViewPages()) {
                if (view instanceof n2) {
                    ((n2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
