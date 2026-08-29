package sf;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import lh.s2;
import m.t2;
import m.u2;
import nh.d6;
import nh.f6;
import nh.k2;
import nh.t4;
import nh.w3;
import nh.x1;
import nh.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.zn;
import org.telegram.ui.fi1;
import org.telegram.ui.ht;
import org.telegram.ui.th;
public final class l extends p51 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument A;
    public boolean B;
    public String C;
    public String D;
    public long E;
    public boolean F;
    public s2 H;
    public ir f47841e;
    public org.telegram.ui.ActionBar.w0 f47842f;
    public sh h;
    public j f47843n;
    public t5 f47844r;
    public k f47845s;
    public k v;
    public String f47848y;
    public final h d = new h(this, 1);
    public boolean f47846w = true;
    public TLRPC.Document f47847x = getMediaDataController().getGreetingsSticker();
    public boolean G = g0();

    public static void Y(l lVar) {
        l lVar2;
        ht.q().T = null;
        if (lVar.getParentActivity() == null) {
            return;
        }
        if (lVar.getParentActivity() == null || lVar.getParentActivity() == null || lVar.H != null) {
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            s2 s2Var = new s2(lVar2, lVar.getParentActivity(), lVar, lVar.resourceProvider, 2);
            lVar2.H = s2Var;
            s2Var.V1 = new d6(lVar2, 23);
        }
        lVar2.H.f31005f0.f0();
        lVar2.H.J1(1, false);
        s2 s2Var2 = lVar2.H;
        s2Var2.Q1 = true;
        s2Var2.i1(new t4(lVar2, 17));
        lVar2.H.r1();
        s2 s2Var3 = lVar2.H;
        s2Var3.f31040r = null;
        if (lVar2.visibleDialog != null) {
            s2Var3.show();
        } else {
            lVar2.showDialog(s2Var3);
        }
    }

    public static void Z(l lVar) {
        j jVar = lVar.f47843n;
        if (jVar != null && jVar.isAttachedToWindow() && lVar.f47846w) {
            j jVar2 = lVar.f47843n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(lVar.currentAccount).getGreetingsSticker();
            h hVar = new h(lVar, 2);
            if (greetingsSticker == null) {
                jVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = jVar2.B;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            jVar2.f27517n.getImageReceiver().setDelegate(new ao(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, g6.lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f27517n.n(ImageLocation.getForDocument(greetingsSticker), co.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f27517n.j(ImageLocation.getForDocument(greetingsSticker), co.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f27517n.setOnClickListener(new zn(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(l lVar) {
        if (!(lVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) lVar.h.getParent()).getTop();
        int measuredHeight = lVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        lVar.f47843n.setScaleX(clamp);
        lVar.f47843n.setScaleY(clamp);
        lVar.f47843n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        lVar.h.invalidate();
    }

    @Override
    public final void U(ArrayList arrayList, k51 k51Var) {
        arrayList.add(w41.k(this.h));
        th.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(w41.k(this.f47845s));
        arrayList.add(w41.k(this.v));
        if (this.f47846w) {
            arrayList.add(w41.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f47848y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f47848y;
            w41 w41Var = new w41(3);
            w41Var.d = 1;
            w41Var.f34300l = string;
            w41Var.G = str;
            arrayList.add(w41Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f47847x;
            w41 w41Var2 = new w41(3);
            w41Var2.d = 1;
            w41Var2.f34300l = string2;
            w41Var2.G = document;
            arrayList.add(w41Var2);
        }
        arrayList.add(w41.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.G = !g02;
        if (!g02) {
            arrayList.add(w41.B(null));
            w41 e10 = w41.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e10.f34306r = true;
            arrayList.add(e10);
        }
        w41 w41Var3 = new w41(8);
        w41Var3.f34300l = null;
        arrayList.add(w41Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(w41 w41Var, View view) {
        View[] viewPages;
        int i10 = w41Var.d;
        if (i10 == 1) {
            k2 k2Var = new k2(getParentActivity(), getResourceProvider(), true, true);
            k2Var.f17999y = new fi1(7, this, view);
            k2Var.A = new h(this, 0);
            for (View view2 : k2Var.f17993f.getViewPages()) {
                if (view2 instanceof y1) {
                    x1 x1Var = ((y1) view2).f18854c;
                    if (x1Var.D == null) {
                        x1Var.D(null);
                    }
                }
            }
            showDialog(k2Var);
        } else if (i10 == 2) {
            this.f47845s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f47845s.f24387b);
            AndroidUtilities.hideKeyboard(this.v.f24387b);
            this.f47846w = true;
            this.f47843n.d("", "");
            j jVar = this.f47843n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f47847x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(w41 w41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f47843n = new co(context, this.currentAccount, this.f47847x, getResourceProvider());
        sh shVar = new sh(this, context);
        this.h = shVar;
        shVar.setWillNotDraw(false);
        this.f47844r = new t5(this.f47843n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f47843n.setBackground(new ColorDrawable(0));
        je jeVar = new je(context, 5);
        jeVar.setScaleType(ImageView.ScaleType.MATRIX);
        jeVar.setImageDrawable(f6.e(null, this.currentAccount, getUserConfig().getClientUserId(), g6.I.q()));
        this.h.addView(jeVar, i7.f6.e(-1, -1, 119));
        this.h.addView(this.f47843n, i7.f6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        k kVar = new k(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f47845s = kVar;
        kVar.h = true;
        kVar.setShowLimitOnFocus(true);
        k kVar2 = this.f47845s;
        int i10 = g6.f23062d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        this.f47845s.setDivider(true);
        k kVar3 = this.f47845s;
        kVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(kVar3, 4);
        e3 e3Var = kVar3.f24387b;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new u2(gVar, 2));
        k kVar4 = new k(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = kVar4;
        kVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        k kVar5 = this.v;
        kVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(kVar5, 4);
        e3 e3Var2 = kVar5.f24387b;
        e3Var2.setImeOptions(6);
        e3Var2.setOnEditorActionListener(new u2(gVar2, 2));
        this.f47843n.d("", "");
        super.createView(context);
        this.f31601a.p1();
        o51 o51Var = this.f31601a;
        o51Var.U2.f29939r = false;
        this.actionBar.setAdaptiveBackground(o51Var);
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f47841e = new ir(mutate, new np(g6.w0(null, i11, false)));
        this.f47842f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f47841e);
        e0(false);
        this.f31601a.addOnLayoutChangeListener(new t2(this, 2));
        this.f31601a.j(new h00(this, 19));
        o51 o51Var2 = this.f31601a;
        o51Var2.W2 = true;
        o51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new w3(this.fragmentView, false, new nh.b0(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.f47842f != null) {
            boolean f02 = f0();
            this.f47842f.setEnabled(f02);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f47842f.animate();
                if (f02) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (f02) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (f02) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.w0 w0Var = this.f47842f;
                if (f02) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                w0Var.setAlpha(f9);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f47842f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f47842f;
                if (f02) {
                    f13 = 1.0f;
                }
                w0Var3.setScaleY(f13);
            }
            o51 o51Var = this.f31601a;
            if (o51Var != null && o51Var.U2 != null && this.G != (!g0())) {
                o51 o51Var2 = this.f31601a;
                if (o51Var2 != null && o51Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f31601a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f31601a.getChildAt(i12));
                        View childAt = this.f31601a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f31602b = i11;
                        int top = view.getTop();
                        this.f31603c = top;
                        if (this.f31602b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f31603c = AndroidUtilities.dp(88.0f);
                        }
                        this.f31601a.T2.h1(i11, view.getTop() - this.f31601a.getPaddingTop());
                    }
                }
                this.f31601a.U2.N(true);
                int i13 = this.f31602b;
                if (i13 >= 0) {
                    o51 o51Var3 = this.f31601a;
                    o51Var3.T2.h1(i13, this.f31603c - o51Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f47845s.getText().toString();
        String str = this.C;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.v.getText().toString();
            String str3 = this.D;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z10 = this.f47846w;
                if (!z10 && (document = this.f47847x) != null) {
                    j10 = document.f22398id;
                } else {
                    j10 = 0;
                }
                if (j10 == this.E) {
                    if (z10 || this.A == null) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean g0() {
        k kVar = this.f47845s;
        if (kVar != null && this.v != null) {
            if (!TextUtils.isEmpty(kVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f47846w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        ir irVar = this.f47841e;
        if (irVar.f29455c > 0.0f) {
            return;
        }
        irVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f47845s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f47846w && (this.f47847x != null || this.A != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.A;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f47847x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f47846w && (document = this.f47847x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ef.a(this, 24));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j10;
        boolean z10;
        k51 k51Var;
        if (this.F) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            k kVar = this.f47845s;
            String str = tL_businessIntro.title;
            this.C = str;
            kVar.setText(str);
            k kVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.D = str2;
            kVar2.setText(str2);
            this.f47847x = userFull.business_intro.sticker;
        } else {
            k kVar3 = this.f47845s;
            this.C = "";
            kVar3.setText("");
            k kVar4 = this.v;
            this.D = "";
            kVar4.setText("");
            this.A = null;
            this.f47847x = null;
        }
        TLRPC.Document document = this.f47847x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22398id;
        }
        this.E = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47846w = z10;
        j jVar = this.f47843n;
        if (jVar != null) {
            jVar.d(this.f47845s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f47843n;
            TLRPC.Document document2 = this.f47847x;
            if (document2 == null || this.f47846w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f47846w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        o51 o51Var = this.f31601a;
        if (o51Var != null && (k51Var = o51Var.U2) != null) {
            k51Var.N(true);
        }
        this.F = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (f0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new b2(this) {
                    public final l f47823b;

                    {
                        this.f47823b = this;
                    }

                    @Override
                    public final void g(c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f47823b.h0();
                                return;
                            default:
                                this.f47823b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new b2(this) {
                    public final l f47823b;

                    {
                        this.f47823b = this;
                    }

                    @Override
                    public final void g(c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f47823b.h0();
                                return;
                            default:
                                this.f47823b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f22714a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31601a.setPadding(0, 0, 0, i13);
        this.f31601a.setClipToPadding(false);
    }
}
