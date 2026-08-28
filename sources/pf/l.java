package pf;

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
import g7.e6;
import ih.u2;
import java.util.ArrayList;
import kh.a2;
import kh.b2;
import kh.b4;
import kh.b8;
import kh.i9;
import kh.n2;
import kh.r6;
import m.t2;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.s5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ei1;
import org.telegram.ui.ht;
import org.telegram.ui.xe1;
public final class l extends d51 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument A;
    public boolean B;
    public String C;
    public String D;
    public long E;
    public boolean F;
    public u2 H;
    public fr f45667e;
    public org.telegram.ui.ActionBar.w0 f45668f;
    public ph h;
    public j f45669n;
    public s5 f45670r;
    public k f45671s;
    public k v;
    public String f45674y;
    public final h d = new h(this, 1);
    public boolean f45672w = true;
    public TLRPC.Document f45673x = getMediaDataController().getGreetingsSticker();
    public boolean G = f0();

    public static void X(l lVar) {
        l lVar2;
        ht.q().T = null;
        if (lVar.getParentActivity() == null) {
            return;
        }
        if (lVar.getParentActivity() == null || lVar.getParentActivity() == null || lVar.H != null) {
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            u2 u2Var = new u2(lVar2, lVar.getParentActivity(), lVar, lVar.resourceProvider, 2);
            lVar2.H = u2Var;
            u2Var.V1 = new n5.e0(lVar2, 14);
        }
        lVar2.H.f30114f0.e0();
        lVar2.H.J1(1, false);
        u2 u2Var2 = lVar2.H;
        u2Var2.Q1 = true;
        u2Var2.i1(new b8(lVar2, 16));
        lVar2.H.r1();
        u2 u2Var3 = lVar2.H;
        u2Var3.f30149r = null;
        if (lVar2.visibleDialog != null) {
            u2Var3.show();
        } else {
            lVar2.showDialog(u2Var3);
        }
    }

    public static void Y(l lVar) {
        j jVar = lVar.f45669n;
        if (jVar != null && jVar.isAttachedToWindow() && lVar.f45672w) {
            j jVar2 = lVar.f45669n;
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
            jVar2.f35033n.getImageReceiver().setDelegate(new wn(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, f6.f23150lc, 1.0f);
            if (svgThumb != null) {
                jVar2.f35033n.n(ImageLocation.getForDocument(greetingsSticker), yn.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.f35033n.j(ImageLocation.getForDocument(greetingsSticker), yn.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.f35033n.setOnClickListener(new vn(jVar2, greetingsSticker, 1));
        }
    }

    public static void a0(l lVar) {
        if (!(lVar.h.getParent() instanceof View)) {
            return;
        }
        int top = ((View) lVar.h.getParent()).getTop();
        int measuredHeight = lVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
        float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
        lVar.f45669n.setScaleX(clamp);
        lVar.f45669n.setScaleY(clamp);
        lVar.f45669n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
        lVar.h.invalidate();
    }

    @Override
    public final void T(ArrayList arrayList, z41 z41Var) {
        arrayList.add(l41.k(this.h));
        j2.l(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(l41.k(this.f45671s));
        arrayList.add(l41.k(this.v));
        if (this.f45672w) {
            arrayList.add(l41.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.f45674y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.f45674y;
            l41 l41Var = new l41(3);
            l41Var.d = 1;
            l41Var.f30339l = string;
            l41Var.G = str;
            arrayList.add(l41Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.f45673x;
            l41 l41Var2 = new l41(3);
            l41Var2.d = 1;
            l41Var2.f30339l = string2;
            l41Var2.G = document;
            arrayList.add(l41Var2);
        }
        arrayList.add(l41.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean f02 = f0();
        this.G = !f02;
        if (!f02) {
            arrayList.add(l41.B(null));
            l41 e10 = l41.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e10.f30345r = true;
            arrayList.add(e10);
        }
        l41 l41Var3 = new l41(8);
        l41Var3.f30339l = null;
        arrayList.add(l41Var3);
    }

    @Override
    public final CharSequence U() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public final void V(l41 l41Var, View view) {
        View[] viewPages;
        int i9 = l41Var.d;
        if (i9 == 1) {
            n2 n2Var = new n2(getParentActivity(), getResourceProvider(), true, true);
            n2Var.f15742y = new ei1(4, this, view);
            n2Var.A = new h(this, 0);
            for (View view2 : n2Var.f15736f.getViewPages()) {
                if (view2 instanceof b2) {
                    a2 a2Var = ((b2) view2).f14983c;
                    if (a2Var.D == null) {
                        a2Var.D(null);
                    }
                }
            }
            showDialog(n2Var);
        } else if (i9 == 2) {
            this.f45671s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.f45671s.f24544b);
            AndroidUtilities.hideKeyboard(this.v.f24544b);
            this.f45672w = true;
            this.f45669n.d("", "");
            j jVar = this.f45669n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.f45673x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            d0(true);
        }
    }

    @Override
    public final boolean W(l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.f45669n = new yn(context, this.currentAccount, this.f45673x, getResourceProvider());
        ph phVar = new ph(this, context);
        this.h = phVar;
        phVar.setWillNotDraw(false);
        this.f45670r = new s5(this.f45669n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.f45669n.setBackground(new ColorDrawable(0));
        ge geVar = new ge(context, 5);
        geVar.setScaleType(ImageView.ScaleType.MATRIX);
        geVar.setImageDrawable(r6.e(null, this.currentAccount, getUserConfig().getClientUserId(), f6.I.q()));
        this.h.addView(geVar, e6.e(-1, -1, 119));
        this.h.addView(this.f45669n, e6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        k kVar = new k(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.f45671s = kVar;
        kVar.h = true;
        kVar.setShowLimitOnFocus(true);
        k kVar2 = this.f45671s;
        int i9 = f6.f23001d6;
        kVar2.setBackgroundColor(getThemedColor(i9));
        this.f45671s.setDivider(true);
        k kVar3 = this.f45671s;
        kVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(kVar3, 4);
        h3 h3Var = kVar3.f24544b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.u2(gVar, 2));
        k kVar4 = new k(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = kVar4;
        kVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i9));
        this.v.setDivider(true);
        k kVar5 = this.v;
        kVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(kVar5, 4);
        h3 h3Var2 = kVar5.f24544b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.u2(gVar2, 2));
        this.f45669n.d("", "");
        super.createView(context);
        this.f27658a.p1();
        c51 c51Var = this.f27658a;
        c51Var.U2.f35188r = false;
        this.actionBar.setAdaptiveBackground(c51Var);
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 6));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f45667e = new fr(mutate, new jp(f6.w0(null, i10, false)));
        this.f45668f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f45667e);
        d0(false);
        this.f27658a.addOnLayoutChangeListener(new t2(this, 2));
        this.f27658a.j(new kn(this, 18));
        c51 c51Var2 = this.f27658a;
        c51Var2.W2 = true;
        c51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        h0();
        new b4(this.fragmentView, false, new i9(this, 10));
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f45668f != null) {
            boolean e02 = e0();
            this.f45668f.setEnabled(e02);
            float f14 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f45668f.animate();
                if (e02) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (e02) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (e02) {
                    f14 = 1.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.w0 w0Var = this.f45668f;
                if (e02) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f45668f;
                if (e02) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w0Var2.setScaleX(f11);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f45668f;
                if (e02) {
                    f14 = 1.0f;
                }
                w0Var3.setScaleY(f14);
            }
            c51 c51Var = this.f27658a;
            if (c51Var != null && c51Var.U2 != null && this.G != (!f0())) {
                c51 c51Var2 = this.f27658a;
                if (c51Var2 != null && c51Var2.getChildCount() > 0) {
                    View view = null;
                    int i9 = Integer.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f27658a.getChildCount(); i11++) {
                        int R = RecyclerView.R(this.f27658a.getChildAt(i11));
                        View childAt = this.f27658a.getChildAt(i11);
                        if (R != -1 && childAt.getTop() < i9) {
                            i9 = childAt.getTop();
                            i10 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        this.f27659b = i10;
                        int top = view.getTop();
                        this.f27660c = top;
                        if (this.f27659b == 0 && top > AndroidUtilities.dp(88.0f)) {
                            this.f27660c = AndroidUtilities.dp(88.0f);
                        }
                        this.f27658a.T2.h1(i10, view.getTop() - this.f27658a.getPaddingTop());
                    }
                }
                this.f27658a.U2.N(true);
                int i12 = this.f27659b;
                if (i12 >= 0) {
                    c51 c51Var3 = this.f27658a;
                    c51Var3.T2.h1(i12, this.f27660c - c51Var3.getPaddingTop());
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.userInfoDidLoad) {
            h0();
        }
    }

    public final boolean e0() {
        long j10;
        TLRPC.Document document;
        String charSequence = this.f45671s.getText().toString();
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
                boolean z10 = this.f45672w;
                if (!z10 && (document = this.f45673x) != null) {
                    j10 = document.f22386id;
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

    public final boolean f0() {
        k kVar = this.f45671s;
        if (kVar != null && this.v != null) {
            if (!TextUtils.isEmpty(kVar.getText()) || !TextUtils.isEmpty(this.v.getText()) || !this.f45672w) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void g0() {
        TLRPC.Document document;
        fr frVar = this.f45667e;
        if (frVar.f28558c > 0.0f) {
            return;
        }
        frVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!f0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.f45671s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.f45672w && (this.f45673x != null || this.A != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.A;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.f45673x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.f45672w && (document = this.f45673x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new bf.a(this, 24));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void h0() {
        long j10;
        boolean z10;
        z41 z41Var;
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
            k kVar = this.f45671s;
            String str = tL_businessIntro.title;
            this.C = str;
            kVar.setText(str);
            k kVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.D = str2;
            kVar2.setText(str2);
            this.f45673x = userFull.business_intro.sticker;
        } else {
            k kVar3 = this.f45671s;
            this.C = "";
            kVar3.setText("");
            k kVar4 = this.v;
            this.D = "";
            kVar4.setText("");
            this.A = null;
            this.f45673x = null;
        }
        TLRPC.Document document = this.f45673x;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22386id;
        }
        this.E = j10;
        if (document == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45672w = z10;
        j jVar = this.f45669n;
        if (jVar != null) {
            jVar.d(this.f45671s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.f45669n;
            TLRPC.Document document2 = this.f45673x;
            if (document2 == null || this.f45672w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.f45672w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        c51 c51Var = this.f27658a;
        if (c51Var != null && (z41Var = c51Var.U2) != null) {
            z41Var.N(true);
        }
        this.F = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (e0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final l f45650b;

                    {
                        this.f45650b = this;
                    }

                    @Override
                    public final void f(c2 c2Var, int i9) {
                        switch (r2) {
                            case 0:
                                this.f45650b.g0();
                                return;
                            default:
                                this.f45650b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) {
                    public final l f45650b;

                    {
                        this.f45650b = this;
                    }

                    @Override
                    public final void f(c2 c2Var, int i9) {
                        switch (r2) {
                            case 0:
                                this.f45650b.g0();
                                return;
                            default:
                                this.f45650b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f22702a);
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f27658a.setPadding(0, 0, 0, i12);
        this.f27658a.setClipToPadding(false);
    }
}
