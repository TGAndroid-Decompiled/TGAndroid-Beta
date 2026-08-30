package uf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import k7.b6;
import nh.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.w51;
import ph.d4;
public final class u0 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public int C;
    public boolean D;
    public g61 f45445a;
    public mr f45446b;
    public org.telegram.ui.ActionBar.w0 f45447c;
    public boolean d;
    public FrameLayout e;
    public r0 f45448f;
    public FrameLayout h;
    public t0 f45449n;
    public cq f45450r;
    public y3 f45451s;
    public boolean v;
    public TLRPC.TL_businessLocation f45452w;
    public TLRPC.GeoPoint f45453x;
    public String f45454y;

    public u0() {
        super(null);
        this.C = -4;
    }

    public final void U(boolean z4) {
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        if (this.f45447c != null) {
            boolean V = V();
            this.f45447c.setEnabled(V);
            float f14 = 0.0f;
            if (z4) {
                ViewPropertyAnimator animate = this.f45447c.animate();
                if (V) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (V) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (V) {
                    f14 = 1.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.w0 w0Var = this.f45447c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f45447c;
                if (V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w0Var2.setScaleX(f11);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f45447c;
                if (V) {
                    f14 = 1.0f;
                }
                w0Var3.setScaleY(f14);
            }
            g61 g61Var = this.f45445a;
            if (g61Var != null && g61Var.V2 != null) {
                boolean z11 = this.D;
                if (this.f45452w != null && (this.f45453x != null || !TextUtils.isEmpty(this.f45454y))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 != z10) {
                    this.f45445a.V2.N(true);
                }
            }
        }
    }

    public final boolean V() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        TLRPC.GeoPoint geoPoint;
        if (this.f45453x == null && TextUtils.isEmpty(this.f45454y)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f45452w != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 != z10) {
            return true;
        }
        if (this.f45453x == null && TextUtils.isEmpty(this.f45454y)) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f45452w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return true;
        }
        String str2 = this.f45454y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f45453x;
        if (geoPoint2 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f45452w;
        if (tL_businessLocation2 != null && tL_businessLocation2.geo_point != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            return true;
        }
        if (geoPoint2 == null || (tL_businessLocation2 != null && (geoPoint = tL_businessLocation2.geo_point) != null && ((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)))) {
            return false;
        }
        return true;
    }

    public final void W() {
        boolean z4;
        String trim;
        if (this.f45446b.f27111c > 0.0f) {
            return;
        }
        if (this.f45453x == null && TextUtils.isEmpty(this.f45454y)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f45454y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                r0 r0Var = this.f45448f;
                int i10 = -this.C;
                this.C = i10;
                AndroidUtilities.shakeViewSpring(r0Var, i10);
                return;
            }
        }
        this.f45446b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z4) {
            if (this.f45453x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f45453x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f45454y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f45454y;
                if (this.f45453x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f45453x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new q0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        w51 w51Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f45452w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f45453x = tL_businessLocation.geo_point;
            this.f45454y = tL_businessLocation.address;
        } else {
            this.f45453x = null;
            this.f45454y = "";
        }
        r0 r0Var = this.f45448f;
        if (r0Var != null) {
            this.d = true;
            r0Var.setText(this.f45454y);
            r0 r0Var2 = this.f45448f;
            r0Var2.setSelection(r0Var2.getText().length());
            this.d = false;
        }
        Y();
        g61 g61Var = this.f45445a;
        if (g61Var != null && (w51Var = g61Var.V2) != null) {
            w51Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        y3 y3Var;
        int measuredWidth;
        t0 t0Var = this.f45449n;
        if (t0Var != null && (y3Var = this.f45451s) != null) {
            if (this.f45453x != null) {
                t0Var.setAlpha(0.0f);
                this.f45449n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f45451s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f45451s.getMeasuredWidth();
                }
                float f10 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                y3 y3Var2 = this.f45451s;
                TLRPC.GeoPoint geoPoint = this.f45453x;
                y3Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), android.support.v4.media.a.l(i10, "_240"), this.f45450r, null);
                return;
            }
            y3Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f20227v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f45446b = new mr(mutate, new rp(j6.w0(null, i10, false)));
        this.f45447c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f45446b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19852a7, false));
        r0 r0Var = new r0(this, getParentActivity());
        this.f45448f = r0Var;
        r0Var.setTextSize(1, 17.0f);
        this.f45448f.setHintTextColor(j6.w0(null, j6.H6, false));
        r0 r0Var2 = this.f45448f;
        int i11 = j6.G6;
        r0Var2.setTextColor(j6.w0(null, i11, false));
        this.f45448f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f45448f.setMaxLines(5);
        this.f45448f.setSingleLine(false);
        this.f45448f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r0 r0Var3 = this.f45448f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        r0Var3.setGravity(i12 | 48);
        this.f45448f.setInputType(180225);
        this.f45448f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f45448f.setCursorColor(j6.w0(null, i11, false));
        this.f45448f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f45448f.setCursorWidth(1.5f);
        this.f45448f.addTextChangedListener(new dh.c(this, 19));
        this.f45448f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f45448f, b6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = j6.f19906d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        r0 r0Var4 = this.f45448f;
        if (r0Var4 != null) {
            this.d = true;
            r0Var4.setText(this.f45454y);
            r0 r0Var5 = this.f45448f;
            r0Var5.setSelection(r0Var5.getText().length());
            this.d = false;
        }
        this.f45451s = new y3(this, context, 11);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, j6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f45451s.getImageReceiver());
        cq cqVar = new cq(svgThumb);
        this.f45450r = cqVar;
        cqVar.setCallback(this.f45451s);
        this.f45451s.setBackgroundColor(getThemedColor(i13));
        this.f45449n = new t0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f45451s, b6.c(-1.0f, -1));
        this.h.addView(this.f45449n, b6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        g61 g61Var = new g61(this, new d4(this, 21), new p0(this, 0), null);
        this.f45445a = g61Var;
        g61Var.p1();
        g61 g61Var2 = this.f45445a;
        g61Var2.V2.f30240r = false;
        frameLayout.addView(g61Var2, b6.c(-1.0f, -1));
        this.actionBar.A(this.f45445a, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !V();
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        boolean z10;
        if (this.f45453x == null && TextUtils.isEmpty(this.f45454y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (V() && !z10) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new p0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new p0(this, 2));
                showDialog(alertDialog$Builder.f19503a);
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f45445a.setPadding(0, 0, 0, i13);
        this.f45445a.setClipToPadding(false);
    }
}
