package vf;

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
import k7.c6;
import m.s2;
import m.t2;
import oh.u2;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x51;
import org.telegram.ui.qt;
import org.telegram.ui.yh;
import qh.d4;
import qh.i3;
import qh.j5;
import qh.y1;
public final class k extends c61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument B;
    public boolean C;
    public String D;
    public String E;
    public long F;
    public boolean G;
    public u2 I;
    public or f49076e;
    public org.telegram.ui.ActionBar.w0 f49077f;
    public ph h;
    public i f49078n;
    public x5 f49079r;
    public j f49080s;
    public j v;
    public String f49083y;
    public final g d = new g(this, 1);
    public boolean f49081w = true;
    public TLRPC.Document f49082x = getMediaDataController().getGreetingsSticker();
    public boolean H = g0();

    public static void Y(k kVar) {
        k kVar2;
        qt.q().T = null;
        if (kVar.getParentActivity() == null) {
            return;
        }
        if (kVar.getParentActivity() == null || kVar.getParentActivity() == null || kVar.I != null) {
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            u2 u2Var = new u2(kVar2, kVar.getParentActivity(), kVar, kVar.resourceProvider, 2);
            kVar2.I = u2Var;
            u2Var.W1 = new org.telegram.ui.web.e0(kVar2, 17);
        }
        kVar2.I.f29054g0.f0();
        kVar2.I.J1(1, false);
        u2 u2Var2 = kVar2.I;
        u2Var2.R1 = true;
        u2Var2.i1(new d4(kVar2, 17));
        kVar2.I.r1();
        u2 u2Var3 = kVar2.I;
        u2Var3.f29086r = null;
        if (kVar2.visibleDialog != null) {
            u2Var3.show();
        } else {
            kVar2.showDialog(u2Var3);
        }
    }

    public static void Z(k kVar) {
        i iVar = kVar.f49078n;
        if (iVar != null && iVar.isAttachedToWindow() && kVar.f49081w) {
            i iVar2 = kVar.f49078n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(kVar.currentAccount).getGreetingsSticker();
            g gVar = new g(kVar, 2);
            if (greetingsSticker == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.f27526n.getImageReceiver().setDelegate(new fo(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, k6.f21809lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f27526n.n(ImageLocation.getForDocument(greetingsSticker), ho.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f27526n.j(ImageLocation.getForDocument(greetingsSticker), ho.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f27526n.setOnClickListener(new eo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(k kVar) {
        if (!(kVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) kVar.h.getParent()).getTop();
        int measuredHeight = kVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        kVar.f49078n.setScaleX(clamp);
        kVar.f49078n.setScaleY(clamp);
        kVar.f49078n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        kVar.h.invalidate();
    }

    @Override
    public final void U(ArrayList arrayList, x51 x51Var) {
        arrayList.add(j51.k(this.h));
        yh.r(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(j51.k(this.f49080s));
        arrayList.add(j51.k(this.v));
        if (this.f49081w) {
            arrayList.add(j51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f49083y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f49083y;
            j51 j51Var = new j51(3);
            j51Var.d = 1;
            j51Var.f28014l = string;
            j51Var.G = str;
            arrayList.add(j51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f49082x;
            j51 j51Var2 = new j51(3);
            j51Var2.d = 1;
            j51Var2.f28014l = string2;
            j51Var2.G = document;
            arrayList.add(j51Var2);
        }
        arrayList.add(j51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.H = !g02;
        if (!g02) {
            arrayList.add(j51.B(null));
            j51 e6 = j51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e6.f28020r = true;
            arrayList.add(e6);
        }
        j51 j51Var3 = new j51(8);
        j51Var3.f28014l = null;
        arrayList.add(j51Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(j51 j51Var, View view) {
        View[] viewPages;
        int i10 = j51Var.d;
        if (i10 == 1) {
            y1 y1Var = new y1(getParentActivity(), getResourceProvider(), true, true);
            y1Var.f46351y = new org.telegram.ui.web.m(8, this, view);
            y1Var.B = new g(this, 0);
            for (View view2 : y1Var.f46345f.getViewPages()) {
                if (view2 instanceof qh.o1) {
                    qh.n1 n1Var = ((qh.o1) view2).f45821c;
                    if (n1Var.E == null) {
                        n1Var.D(null);
                    }
                }
            }
            showDialog(y1Var);
        } else if (i10 == 2) {
            this.f49080s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f49080s.f22955b);
            AndroidUtilities.hideKeyboard(this.v.f22955b);
            this.f49081w = true;
            this.f49078n.d("", "");
            i iVar = this.f49078n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f49082x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(j51 j51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f49078n = new ho(context, this.currentAccount, this.f49082x, getResourceProvider());
        ph phVar = new ph(this, context);
        this.h = phVar;
        phVar.setWillNotDraw(false);
        this.f49079r = new x5(this.f49078n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f49078n.setBackground(new ColorDrawable(0));
        ge geVar = new ge(context, 5);
        geVar.setScaleType(ImageView.ScaleType.MATRIX);
        geVar.setImageDrawable(j5.e(null, this.currentAccount, getUserConfig().getClientUserId(), k6.I.q()));
        this.h.addView(geVar, c6.e(-1, -1, 119));
        this.h.addView(this.f49078n, c6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        j jVar = new j(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f49080s = jVar;
        jVar.h = true;
        jVar.setShowLimitOnFocus(true);
        j jVar2 = this.f49080s;
        int i10 = k6.f21659d6;
        jVar2.setBackgroundColor(getThemedColor(i10));
        this.f49080s.setDivider(true);
        j jVar3 = this.f49080s;
        jVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(jVar3, 4);
        g3 g3Var = jVar3.f22955b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new t2(gVar, 2));
        j jVar4 = new j(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = jVar4;
        jVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        j jVar5 = this.v;
        jVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(jVar5, 4);
        g3 g3Var2 = jVar5.f22955b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new t2(gVar2, 2));
        this.f49078n.d("", "");
        super.createView(context);
        this.f25815a.p1();
        b61 b61Var = this.f25815a;
        b61Var.V2.f32957r = false;
        this.actionBar.setAdaptiveBackground(b61Var);
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f49076e = new or(mutate, new tp(k6.w0(null, i11, false)));
        this.f49077f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f49076e);
        e0(false);
        this.f25815a.addOnLayoutChangeListener(new s2(this, 2));
        this.f25815a.j(new nb0(this, 19));
        b61 b61Var2 = this.f25815a;
        b61Var2.X2 = true;
        b61Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new i3(this.fragmentView, false, new org.telegram.ui.web.d1(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f49077f != null) {
            boolean f02 = f0();
            this.f49077f.setEnabled(f02);
            float f14 = 0.0f;
            if (z4) {
                ViewPropertyAnimator animate = this.f49077f.animate();
                if (f02) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (f02) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (f02) {
                    f14 = 1.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.w0 w0Var = this.f49077f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f49077f;
                if (f02) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w0Var2.setScaleX(f11);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f49077f;
                if (f02) {
                    f14 = 1.0f;
                }
                w0Var3.setScaleY(f14);
            }
            b61 b61Var = this.f25815a;
            if (b61Var != null && b61Var.V2 != null && this.H != (!g0())) {
                b61 b61Var2 = this.f25815a;
                if (b61Var2 != null && b61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f25815a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f25815a.getChildAt(i12));
                        View childAt = this.f25815a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f25816b = i11;
                        int top = view.getTop();
                        this.f25817c = top;
                        if (this.f25816b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f25817c = AndroidUtilities.dp(88.0f);
                        }
                        this.f25815a.U2.h1(i11, view.getTop() - this.f25815a.getPaddingTop());
                    }
                }
                this.f25815a.V2.N(true);
                int i13 = this.f25816b;
                if (i13 >= 0) {
                    b61 b61Var3 = this.f25815a;
                    b61Var3.U2.h1(i13, this.f25817c - b61Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f49080s.getText().toString();
        String str = this.D;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.v.getText().toString();
            String str3 = this.E;
            if (str3 != null) {
                str2 = str3;
            }
            if (TextUtils.equals(charSequence2, str2)) {
                boolean z4 = this.f49081w;
                if (!z4 && (document = this.f49082x) != null) {
                    j10 = document.f20849id;
                } else {
                    j10 = 0;
                }
                if (j10 == this.F) {
                    if (z4 || this.B == null) {
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
        j jVar = this.f49080s;
        if (jVar != null && this.v != null) {
            if (!TextUtils.isEmpty(jVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f49081w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        or orVar = this.f49076e;
        if (orVar.f29840c > 0.0f) {
            return;
        }
        orVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f49080s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f49081w && (this.f49082x != null || this.B != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.B;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f49082x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f49081w && (document = this.f49082x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new gf.a(this, 24));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        long j10;
        boolean z4;
        x51 x51Var;
        if (this.G) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            j jVar = this.f49080s;
            String str = tL_businessIntro.title;
            this.D = str;
            jVar.setText(str);
            j jVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.E = str2;
            jVar2.setText(str2);
            this.f49082x = userFull.business_intro.sticker;
        } else {
            j jVar3 = this.f49080s;
            this.D = "";
            jVar3.setText("");
            j jVar4 = this.v;
            this.E = "";
            jVar4.setText("");
            this.B = null;
            this.f49082x = null;
        }
        TLRPC.Document document = this.f49082x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20849id;
        }
        this.F = j10;
        if (document == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f49081w = z4;
        i iVar = this.f49078n;
        if (iVar != null) {
            iVar.d(this.f49080s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.f49078n;
            TLRPC.Document document2 = this.f49082x;
            if (document2 == null || this.f49081w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f49081w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        b61 b61Var = this.f25815a;
        if (b61Var != null && (x51Var = b61Var.V2) != null) {
            x51Var.N(true);
        }
        this.G = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (f0()) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new c2(this) {
                    public final k f49059b;

                    {
                        this.f49059b = this;
                    }

                    @Override
                    public final void j(d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f49059b.h0();
                                return;
                            default:
                                this.f49059b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new c2(this) {
                    public final k f49059b;

                    {
                        this.f49059b = this;
                    }

                    @Override
                    public final void j(d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f49059b.h0();
                                return;
                            default:
                                this.f49059b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f21166a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
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
        this.f25815a.setPadding(0, 0, 0, i13);
        this.f25815a.setClipToPadding(false);
    }
}
