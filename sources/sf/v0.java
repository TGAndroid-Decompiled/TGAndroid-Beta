package sf;

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
import i7.f6;
import lh.y3;
import nh.t4;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.yp;
public final class v0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public boolean C;
    public u51 f47969a;
    public ir f47970b;
    public org.telegram.ui.ActionBar.w0 f47971c;
    public boolean d;
    public FrameLayout f47972e;
    public s0 f47973f;
    public FrameLayout h;
    public u0 f47974n;
    public yp f47975r;
    public y3 f47976s;
    public boolean v;
    public TLRPC.TL_businessLocation f47977w;
    public TLRPC.GeoPoint f47978x;
    public String f47979y;

    public v0() {
        super(null);
        this.B = -4;
    }

    public final void U(boolean z10) {
        float f9;
        float f10;
        boolean z11;
        float f11;
        float f12;
        if (this.f47971c != null) {
            boolean V = V();
            this.f47971c.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f47971c.animate();
                if (V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (V) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (V) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.w0 w0Var = this.f47971c;
                if (V) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                w0Var.setAlpha(f9);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f47971c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f47971c;
                if (V) {
                    f13 = 1.0f;
                }
                w0Var3.setScaleY(f13);
            }
            u51 u51Var = this.f47969a;
            if (u51Var != null && u51Var.U2 != null) {
                boolean z12 = this.C;
                if (this.f47977w != null && (this.f47978x != null || !TextUtils.isEmpty(this.f47979y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f47969a.U2.N(true);
                }
            }
        }
    }

    public final boolean V() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        boolean z14;
        boolean z15;
        TLRPC.GeoPoint geoPoint;
        if (this.f47978x == null && TextUtils.isEmpty(this.f47979y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f47977w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f47978x == null && TextUtils.isEmpty(this.f47979y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f47977w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f47979y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f47978x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f47977w;
        if (tL_businessLocation2 != null && tL_businessLocation2.geo_point != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 != z15) {
            return true;
        }
        if (geoPoint2 == null || (tL_businessLocation2 != null && (geoPoint = tL_businessLocation2.geo_point) != null && ((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)))) {
            return false;
        }
        return true;
    }

    public final void W() {
        boolean z10;
        String trim;
        if (this.f47970b.f29455c > 0.0f) {
            return;
        }
        if (this.f47978x == null && TextUtils.isEmpty(this.f47979y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f47979y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                s0 s0Var = this.f47973f;
                int i10 = -this.B;
                this.B = i10;
                AndroidUtilities.shakeViewSpring(s0Var, i10);
                return;
            }
        }
        this.f47970b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f47978x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f47978x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f47979y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f47979y;
                if (this.f47978x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f47978x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new r0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        k51 k51Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f47977w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f47978x = tL_businessLocation.geo_point;
            this.f47979y = tL_businessLocation.address;
        } else {
            this.f47978x = null;
            this.f47979y = "";
        }
        s0 s0Var = this.f47973f;
        if (s0Var != null) {
            this.d = true;
            s0Var.setText(this.f47979y);
            s0 s0Var2 = this.f47973f;
            s0Var2.setSelection(s0Var2.getText().length());
            this.d = false;
        }
        Y();
        u51 u51Var = this.f47969a;
        if (u51Var != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        y3 y3Var;
        int measuredWidth;
        u0 u0Var = this.f47974n;
        if (u0Var != null && (y3Var = this.f47976s) != null) {
            if (this.f47978x != null) {
                u0Var.setAlpha(0.0f);
                this.f47974n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f47976s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f47976s.getMeasuredWidth();
                }
                float f9 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f9);
                int min = Math.min(2, (int) Math.ceil(f9));
                y3 y3Var2 = this.f47976s;
                TLRPC.GeoPoint geoPoint = this.f47978x;
                y3Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), u3.c.d(i10, "_240"), this.f47975r, null);
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
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f47970b = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.f47971c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f47970b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        s0 s0Var = new s0(this, getParentActivity());
        this.f47973f = s0Var;
        s0Var.setTextSize(1, 17.0f);
        this.f47973f.setHintTextColor(g6.w0(null, g6.H6, false));
        s0 s0Var2 = this.f47973f;
        int i11 = g6.G6;
        s0Var2.setTextColor(g6.w0(null, i11, false));
        this.f47973f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f47973f.setMaxLines(5);
        this.f47973f.setSingleLine(false);
        this.f47973f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s0 s0Var3 = this.f47973f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        s0Var3.setGravity(i12 | 48);
        this.f47973f.setInputType(180225);
        this.f47973f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f47973f.setCursorColor(g6.w0(null, i11, false));
        this.f47973f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f47973f.setCursorWidth(1.5f);
        this.f47973f.addTextChangedListener(new bh.c(this, 19));
        this.f47973f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f47972e = frameLayout2;
        frameLayout2.addView(this.f47973f, f6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f47972e;
        int i13 = g6.f23062d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        s0 s0Var4 = this.f47973f;
        if (s0Var4 != null) {
            this.d = true;
            s0Var4.setText(this.f47979y);
            s0 s0Var5 = this.f47973f;
            s0Var5.setSelection(s0Var5.getText().length());
            this.d = false;
        }
        this.f47976s = new y3(this, context, 11);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, g6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f47976s.getImageReceiver());
        yp ypVar = new yp(svgThumb);
        this.f47975r = ypVar;
        ypVar.setCallback(this.f47976s);
        this.f47976s.setBackgroundColor(getThemedColor(i13));
        this.f47974n = new u0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f47976s, f6.c(-1.0f, -1));
        this.h.addView(this.f47974n, f6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        u51 u51Var = new u51(this, new t4(this, 21), new q0(this, 0), null);
        this.f47969a = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.f47969a;
        u51Var2.U2.f29939r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.f47969a, true);
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
    public final boolean onBackPressed(boolean z10) {
        boolean z11;
        if (this.f47978x == null && TextUtils.isEmpty(this.f47979y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new q0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new q0(this, 2));
                showDialog(alertDialog$Builder.f22714a);
            }
            return false;
        }
        return super.onBackPressed(z10);
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
        this.f47969a.setPadding(0, 0, 0, i13);
        this.f47969a.setClipToPadding(false);
    }
}
