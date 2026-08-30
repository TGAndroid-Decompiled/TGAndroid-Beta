package uf;

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
import k7.b6;
import m.u2;
import nh.t2;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.pt;
import org.telegram.ui.yh;
import ph.d4;
import ph.i3;
import ph.l5;
import ph.y1;
public final class k extends b61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument B;
    public boolean C;
    public String D;
    public String E;
    public long F;
    public boolean G;
    public t2 I;
    public mr e;
    public org.telegram.ui.ActionBar.w0 f45331f;
    public ph h;
    public i f45332n;
    public w5 f45333r;
    public j f45334s;
    public j v;
    public String f45337y;
    public final g d = new g(this, 1);
    public boolean f45335w = true;
    public TLRPC.Document f45336x = getMediaDataController().getGreetingsSticker();
    public boolean H = g0();

    public static void Y(k kVar) {
        k kVar2;
        pt.q().T = null;
        if (kVar.getParentActivity() == null) {
            return;
        }
        if (kVar.getParentActivity() == null || kVar.getParentActivity() == null || kVar.I != null) {
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            t2 t2Var = new t2(kVar2, kVar.getParentActivity(), kVar, kVar.resourceProvider, 2);
            kVar2.I = t2Var;
            t2Var.W1 = new qk0(kVar2, 15);
        }
        kVar2.I.f26702g0.f0();
        kVar2.I.J1(1, false);
        t2 t2Var2 = kVar2.I;
        t2Var2.R1 = true;
        t2Var2.i1(new d4(kVar2, 17));
        kVar2.I.r1();
        t2 t2Var3 = kVar2.I;
        t2Var3.f26734r = null;
        if (kVar2.visibleDialog != null) {
            t2Var3.show();
        } else {
            kVar2.showDialog(t2Var3);
        }
    }

    public static void Z(k kVar) {
        i iVar = kVar.f45332n;
        if (iVar != null && iVar.isAttachedToWindow() && kVar.f45335w) {
            i iVar2 = kVar.f45332n;
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
            iVar2.f24925n.getImageReceiver().setDelegate(new co(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, j6.f20055lc, 1.0f);
            if (svgThumb != null) {
                iVar2.f24925n.n(ImageLocation.getForDocument(greetingsSticker), fo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.f24925n.j(ImageLocation.getForDocument(greetingsSticker), fo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.f24925n.setOnClickListener(new bo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(k kVar) {
        if (!(kVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) kVar.h.getParent()).getTop();
        int measuredHeight = kVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        kVar.f45332n.setScaleX(clamp);
        kVar.f45332n.setScaleY(clamp);
        kVar.f45332n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        kVar.h.invalidate();
    }

    @Override
    public final void U(ArrayList arrayList, w51 w51Var) {
        arrayList.add(i51.k(this.h));
        yh.r(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(i51.k(this.f45334s));
        arrayList.add(i51.k(this.v));
        if (this.f45335w) {
            arrayList.add(i51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f45337y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f45337y;
            i51 i51Var = new i51(3);
            i51Var.d = 1;
            i51Var.f25565l = string;
            i51Var.G = str;
            arrayList.add(i51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f45336x;
            i51 i51Var2 = new i51(3);
            i51Var2.d = 1;
            i51Var2.f25565l = string2;
            i51Var2.G = document;
            arrayList.add(i51Var2);
        }
        arrayList.add(i51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.H = !g02;
        if (!g02) {
            arrayList.add(i51.B(null));
            i51 e = i51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.f25571r = true;
            arrayList.add(e);
        }
        i51 i51Var3 = new i51(8);
        i51Var3.f25565l = null;
        arrayList.add(i51Var3);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void W(i51 i51Var, View view) {
        View[] viewPages;
        int i10 = i51Var.d;
        if (i10 == 1) {
            y1 y1Var = new y1(getParentActivity(), getResourceProvider(), true, true);
            y1Var.f42611y = new org.telegram.ui.web.m(7, this, view);
            y1Var.B = new g(this, 0);
            for (View view2 : y1Var.f42605f.getViewPages()) {
                if (view2 instanceof ph.o1) {
                    ph.n1 n1Var = ((ph.o1) view2).f42039c;
                    if (n1Var.E == null) {
                        n1Var.D(null);
                    }
                }
            }
            showDialog(y1Var);
        } else if (i10 == 2) {
            this.f45334s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f45334s.f21199b);
            AndroidUtilities.hideKeyboard(this.v.f21199b);
            this.f45335w = true;
            this.f45332n.d("", "");
            i iVar = this.f45332n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f45336x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override
    public final boolean X(i51 i51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f45332n = new fo(context, this.currentAccount, this.f45336x, getResourceProvider());
        ph phVar = new ph(this, context);
        this.h = phVar;
        phVar.setWillNotDraw(false);
        this.f45333r = new w5(this.f45332n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f45332n.setBackground(new ColorDrawable(0));
        ge geVar = new ge(context, 5);
        geVar.setScaleType(ImageView.ScaleType.MATRIX);
        geVar.setImageDrawable(l5.e(null, this.currentAccount, getUserConfig().getClientUserId(), j6.I.q()));
        this.h.addView(geVar, b6.e(-1, -1, 119));
        this.h.addView(this.f45332n, b6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        j jVar = new j(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f45334s = jVar;
        jVar.h = true;
        jVar.setShowLimitOnFocus(true);
        j jVar2 = this.f45334s;
        int i10 = j6.f19906d6;
        jVar2.setBackgroundColor(getThemedColor(i10));
        this.f45334s.setDivider(true);
        j jVar3 = this.f45334s;
        jVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(jVar3, 4);
        g3 g3Var = jVar3.f21199b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new u2(gVar, 2));
        j jVar4 = new j(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = jVar4;
        jVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        j jVar5 = this.v;
        jVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(jVar5, 4);
        g3 g3Var2 = jVar5.f21199b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new u2(gVar2, 2));
        this.f45332n.d("", "");
        super.createView(context);
        this.f23580a.p1();
        a61 a61Var = this.f23580a;
        a61Var.V2.f30240r = false;
        this.actionBar.setAdaptiveBackground(a61Var);
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = j6.f20227v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new mr(mutate, new rp(j6.w0(null, i11, false)));
        this.f45331f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.f23580a.addOnLayoutChangeListener(new m.t2(this, 2));
        this.f23580a.j(new lb0(this, 19));
        a61 a61Var2 = this.f23580a;
        a61Var2.X2 = true;
        a61Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new i3(this.fragmentView, false, new org.telegram.ui.web.y0(this, 17));
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
        if (this.f45331f != null) {
            boolean f02 = f0();
            this.f45331f.setEnabled(f02);
            float f14 = 0.0f;
            if (z4) {
                ViewPropertyAnimator animate = this.f45331f.animate();
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
                org.telegram.ui.ActionBar.w0 w0Var = this.f45331f;
                if (f02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f45331f;
                if (f02) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w0Var2.setScaleX(f11);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f45331f;
                if (f02) {
                    f14 = 1.0f;
                }
                w0Var3.setScaleY(f14);
            }
            a61 a61Var = this.f23580a;
            if (a61Var != null && a61Var.V2 != null && this.H != (!g0())) {
                a61 a61Var2 = this.f23580a;
                if (a61Var2 != null && a61Var2.getChildCount() > 0) {
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f23580a.getChildCount(); i12++) {
                        int R = RecyclerView.R(this.f23580a.getChildAt(i12));
                        View childAt = this.f23580a.getChildAt(i12);
                        if (R != -1 && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f23581b = i11;
                        int top = view.getTop();
                        this.f23582c = top;
                        if (this.f23581b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f23582c = AndroidUtilities.dp(88.0f);
                        }
                        this.f23580a.U2.h1(i11, view.getTop() - this.f23580a.getPaddingTop());
                    }
                }
                this.f23580a.V2.N(true);
                int i13 = this.f23581b;
                if (i13 >= 0) {
                    a61 a61Var3 = this.f23580a;
                    a61Var3.U2.h1(i13, this.f23582c - a61Var3.getPaddingTop());
                }
            }
        }
    }

    public final boolean f0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f45334s.getText().toString();
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
                boolean z4 = this.f45335w;
                if (!z4 && (document = this.f45336x) != null) {
                    j10 = document.f19190id;
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
        j jVar = this.f45334s;
        if (jVar != null && this.v != null) {
            if (!TextUtils.isEmpty(jVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f45335w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0() {
        TLRPC.Document document;
        mr mrVar = this.e;
        if (mrVar.f27111c > 0.0f) {
            return;
        }
        mrVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f45334s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f45335w && (this.f45336x != null || this.B != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.B;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f45336x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f45335w && (document = this.f45336x) != null) {
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
        w51 w51Var;
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
            j jVar = this.f45334s;
            String str = tL_businessIntro.title;
            this.D = str;
            jVar.setText(str);
            j jVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.E = str2;
            jVar2.setText(str2);
            this.f45336x = userFull.business_intro.sticker;
        } else {
            j jVar3 = this.f45334s;
            this.D = "";
            jVar3.setText("");
            j jVar4 = this.v;
            this.E = "";
            jVar4.setText("");
            this.B = null;
            this.f45336x = null;
        }
        TLRPC.Document document = this.f45336x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19190id;
        }
        this.F = j10;
        if (document == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f45335w = z4;
        i iVar = this.f45332n;
        if (iVar != null) {
            iVar.d(this.f45334s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.f45332n;
            TLRPC.Document document2 = this.f45336x;
            if (document2 == null || this.f45335w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.f45335w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        a61 a61Var = this.f23580a;
        if (a61Var != null && (w51Var = a61Var.V2) != null) {
            w51Var.N(true);
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
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new c2(this) {
                    public final k f45314b;

                    {
                        this.f45314b = this;
                    }

                    @Override
                    public final void i(d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f45314b.h0();
                                return;
                            default:
                                this.f45314b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new c2(this) {
                    public final k f45314b;

                    {
                        this.f45314b = this;
                    }

                    @Override
                    public final void i(d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f45314b.h0();
                                return;
                            default:
                                this.f45314b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f19503a);
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
        this.f23580a.setPadding(0, 0, 0, i13);
        this.f23580a.setClipToPadding(false);
    }
}
