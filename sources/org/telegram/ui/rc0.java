package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class rc0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public mc0 E0;
    public final UndoView[] F;
    public final int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public jc0 H0;
    public IMapsProvider.IMap I;
    public zb0 I0;
    public IMapsProvider.ICameraUpdate J;
    public hc0 J0;
    public IMapsProvider.IMapView K;
    public org.telegram.ui.Cells.z3 K0;
    public IMapsProvider.ICameraUpdate L;
    public TL_stories.MediaArea L0;
    public boolean M;
    public boolean M0;
    public float N;
    public boolean N0;
    public IMapsProvider.ICircle O;
    public Boolean O0;
    public double P;
    public final Bitmap[] P0;
    public boolean Q;
    public int Q0;
    public org.telegram.ui.Components.ej0 R;
    public k0 S;
    public fc0 T;
    public org.telegram.ui.Components.nm0 U;
    public org.telegram.ui.Components.nm0 V;
    public kc0 W;
    public View X;
    public s4.c0 Y;
    public org.telegram.ui.ActionBar.w0 Z;
    public ImageView f42921a;
    public boolean f42922a0;
    public TextView f42923b;
    public boolean f42924b0;
    public ImageView f42925c;
    public boolean f42926c0;
    public org.telegram.ui.ActionBar.w0 d;
    public boolean f42927d0;
    public org.telegram.ui.Components.ql e;
    public long f42928e0;
    public LinearLayout f42929f;
    public boolean f42930f0;
    public final ArrayList f42931g0;
    public ImageView h;
    public final a0.h f42932h0;
    public long f42933i0;
    public boolean f42934j0;
    public final ArrayList f42935k0;
    public AnimatorSet f42936l0;
    public IMapsProvider.IMarker m0;
    public TextView f42937n;
    public qc0 f42938n0;
    public FrameLayout f42939o0;
    public boolean f42940p0;
    public boolean f42941q0;
    public TextView f42942r;
    public boolean f42943r0;
    public Drawable f42944s;
    public boolean f42945s0;
    public boolean f42946t0;
    public boolean f42947u0;
    public di.h3 v;
    public Location f42948v0;
    public org.telegram.ui.ActionBar.w0 f42949w;
    public Location f42950w0;
    public oc0 f42951x;
    public int f42952x0;
    public fi.v3 f42953y;
    public TLRPC.TL_channelLocation f42954y0;
    public TLRPC.TL_channelLocation f42955z0;

    public rc0(int i10) {
        super(null);
        this.F = new UndoView[2];
        this.f42924b0 = true;
        this.f42926c0 = false;
        this.f42927d0 = true;
        this.f42930f0 = true;
        this.f42931g0 = new ArrayList();
        this.f42932h0 = new a0.h();
        this.f42933i0 = -1L;
        this.f42935k0 = new ArrayList();
        this.f42940p0 = true;
        this.G0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.N0 = true;
        this.P0 = new Bitmap[7];
        this.F0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void V(rc0 rc0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = rc0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.f22112id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(rc0Var.currentAccount).getLastKnownLocation();
                tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
                tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i12 = sharingLocationInfo.lastSentProximityMeters;
                int i13 = sharingLocationInfo.proximityMeters;
                if (i12 != i13) {
                    inputMedia.proximity_notification_radius = i13;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = LocationController.getHeading(lastKnownLocation);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i14 = inputMedia2.flags;
                inputMedia2.flags = i14 | 4;
                int i15 = Integer.MAX_VALUE;
                if (i10 == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = sharingLocationInfo.period + i10;
                }
                sharingLocationInfo.period = i11;
                inputMedia2.period = i11;
                if (i10 != Integer.MAX_VALUE) {
                    i15 = sharingLocationInfo.stopTime + i10;
                }
                sharingLocationInfo.stopTime = i15;
                inputMedia2.flags = i14 | 6;
                MessageObject messageObject = sharingLocationInfo.messageObject;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i11;
                    rc0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                rc0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        rc0Var.x0(i10, user, 0);
    }

    public static void W(rc0 rc0Var) {
        zb0 zb0Var;
        rc0Var.getLocationController().markLiveLoactionsAsRead(rc0Var.f42928e0);
        if (!rc0Var.isPaused && (zb0Var = rc0Var.I0) != null) {
            AndroidUtilities.runOnUIThread(zb0Var, 5000L);
        }
    }

    public static IMapsProvider.LatLng q0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z10, boolean z11) {
        float f7;
        float f10;
        Boolean bool = this.O0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.O0 = Boolean.valueOf(z10);
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.7f;
        if (!z11) {
            TextView textView = this.f42923b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f42923b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f42923b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f42923b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f42923b.setVisibility(0);
        ViewPropertyAnimator animate = this.f42923b.animate();
        if (z10) {
            f11 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f11);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.7f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f7);
        if (z10) {
            f12 = 1.0f;
        }
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.ds.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.d60(12, this, z10)).start();
    }

    public final void B0(boolean z10) {
        int i10;
        int i11;
        int i12;
        FrameLayout.LayoutParams layoutParams;
        float f7;
        s4.e1 K = this.U.K(0);
        if (K != null) {
            i10 = (int) K.f47773a.getY();
            i11 = Math.min(i10, 0) + this.G0;
        } else {
            i10 = -this.S.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.S.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.K.getView().getVisibility() == 0) {
                    this.K.getView().setVisibility(4);
                    this.S.setVisibility(4);
                    oc0 oc0Var = this.f42951x;
                    if (oc0Var != null) {
                        oc0Var.setVisibility(4);
                    }
                }
            } else if (this.K.getView().getVisibility() == 4) {
                this.K.getView().setVisibility(0);
                this.S.setVisibility(0);
                oc0 oc0Var2 = this.f42951x;
                if (oc0Var2 != null) {
                    oc0Var2.setVisibility(0);
                }
            }
            this.S.setTranslationY(Math.min(0, i10));
            int i13 = -i10;
            int i14 = i13 / 2;
            this.K.getView().setTranslationY(Math.max(0, i14));
            oc0 oc0Var3 = this.f42951x;
            if (oc0Var3 != null) {
                oc0Var3.setTranslationY(Math.max(0, i14));
            }
            int measuredHeight = this.G0 - this.d.getMeasuredHeight();
            int i15 = this.F0;
            if (i15 != 0 && i15 != 1) {
                i12 = 10;
            } else {
                i12 = 30;
            }
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + i12), i13);
            this.d.setTranslationY(min);
            this.f42925c.setTranslationY(min);
            fi.v3 v3Var = this.f42953y;
            if (v3Var != null) {
                v3Var.setTranslationY(min);
            }
            org.telegram.ui.Components.ql qlVar = this.e;
            if (qlVar != null) {
                qlVar.f31932c = min;
                qlVar.setTranslationY(min + qlVar.f31931b);
            }
            View view = this.X;
            if (view != null) {
                if (view.getTag() == null) {
                    f7 = 48.0f;
                } else {
                    f7 = 69.0f;
                }
                int dp = (i11 / 2) + (i13 - AndroidUtilities.dp(f7));
                this.f42952x0 = dp;
                view.setTranslationY(dp);
            }
            if (!z10) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.G0) {
                        layoutParams2.height = AndroidUtilities.dp(10.0f) + this.G0;
                        IMapsProvider.IMap iMap = this.I;
                        if (iMap != null) {
                            iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                        }
                        this.K.getView().setLayoutParams(layoutParams2);
                    }
                }
                oc0 oc0Var4 = this.f42951x;
                if (oc0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) oc0Var4.getLayoutParams()) != null) {
                    if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.G0) {
                        layoutParams.height = AndroidUtilities.dp(10.0f) + this.G0;
                        this.f42951x.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void C0() {
        if (this.f42941q0) {
            if (this.f42945s0) {
                this.V.setEmptyView(null);
                this.f42929f.setVisibility(8);
                this.V.setVisibility(8);
                return;
            }
            this.V.setEmptyView(this.f42929f);
            return;
        }
        this.f42929f.setVisibility(8);
    }

    public final void D0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f42923b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f42934j0) {
            A0(false, true);
            k0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f42931g0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((lc0) arrayList.get(i13)).f41075b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f42932h0.f(getUserConfig().getClientUserId()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42948v0 != null && !z10) {
            i12++;
        }
        if (i12 >= 2) {
            z11 = true;
        }
        A0(z11, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23540n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23300a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23573oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23627ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
    }

    public final lc0 c0(TLRPC.Message message) {
        lc0 lc0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.f42932h0;
        lc0 lc0Var2 = (lc0) hVar.f(fromChatId);
        if (lc0Var2 == null) {
            ?? obj = new Object();
            obj.f41075b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f41076c = getMessagesController().getUser(Long.valueOf(obj.f41075b.from_id.user_id));
                obj.f41074a = obj.f41075b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    obj.f41076c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    obj.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                obj.f41074a = dialogId;
            }
            w0(obj);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap h02 = h0(obj);
                lc0Var = obj;
                if (h02 != null) {
                    position.icon(h02);
                    position.anchor(0.5f, 0.907f);
                    obj.e = this.I.addMarker(position);
                    if (!UserObject.isUserSelf(obj.f41076c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.I.addMarker(flat);
                        obj.f41077f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            obj.f41077f.setIcon(R.drawable.map_pin_cone2);
                            obj.f41078g = true;
                        } else {
                            addMarker.setRotation(0);
                            obj.f41077f.setIcon(R.drawable.map_pin_circle);
                            obj.f41078g = false;
                        }
                    }
                    this.f42931g0.add(obj);
                    hVar.k(obj, obj.f41074a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42928e0);
                    int i11 = (obj.f41074a > getUserConfig().getClientUserId() ? 1 : (obj.f41074a == getUserConfig().getClientUserId() ? 0 : -1));
                    lc0Var = obj;
                    lc0Var = obj;
                    if (i11 == 0 && sharingLocationInfo != null) {
                        int i12 = obj.f41075b.f22049id;
                        lc0Var = obj;
                        if (i12 == sharingLocationInfo.mid) {
                            Location location = this.f42948v0;
                            lc0Var = obj;
                            if (location != null) {
                                obj.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f42948v0.getLongitude()));
                                lc0Var = obj;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                lc0Var = obj;
            }
        } else {
            lc0Var2.f41075b = message;
            lc0Var2.e.setPosition(latLng);
            int i13 = (this.f42933i0 > lc0Var2.f41074a ? 1 : (this.f42933i0 == lc0Var2.f41074a ? 0 : -1));
            lc0Var = lc0Var2;
            if (i13 == 0) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var2.e.getPosition()));
                lc0Var = lc0Var2;
            }
        }
        org.telegram.ui.Components.ej0 ej0Var = this.R;
        if (ej0Var != null) {
            ej0Var.c(true);
        }
        D0();
        return lc0Var;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        boolean z11;
        TLRPC.Chat chat;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        boolean z14;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.f42943r0 = false;
        this.f42941q0 = false;
        this.f42945s0 = false;
        fc0 fc0Var = this.T;
        if (fc0Var != null) {
            fc0Var.F();
        }
        kc0 kc0Var = this.W;
        if (kc0Var != null) {
            kc0Var.F();
        }
        if (this.f42954y0 != null) {
            Location location = new Location("network");
            this.f42950w0 = location;
            location.setLatitude(this.f42954y0.geo_point.lat);
            this.f42950w0.setLongitude(this.f42954y0.geo_point._long);
        } else if (this.A0 != null) {
            Location location2 = new Location("network");
            this.f42950w0 = location2;
            location2.setLatitude(this.A0.messageOwner.media.geo.lat);
            this.f42950w0.setLongitude(this.A0.messageOwner.media.geo._long);
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42926c0 = z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.y6.f23428h5;
        org.telegram.ui.ActionBar.f7.i(i12, kVar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.m(kVar2, 5, i13, getResourceProvider());
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, i13, getResourceProvider());
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.I5, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ec0(this));
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        TLRPC.TL_channelLocation tL_channelLocation = this.f42954y0;
        int i14 = this.F0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.A0;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                    org.telegram.ui.ActionBar.w0 c10 = l4.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.Z = c10;
                    c10.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
                } else {
                    String str = this.A0.messageOwner.media.title;
                    if (str != null && str.length() > 0) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                    }
                    if (i14 != 3) {
                        org.telegram.ui.ActionBar.w0 c11 = l4.c(0, R.drawable.ic_ab_other, getResourceProvider());
                        this.Z = c11;
                        c11.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                        if (!getLocationController().isSharingLocation(this.f42928e0) && this.N0) {
                            this.Z.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.Z.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f42951x = new oc0(this, context);
                    org.telegram.ui.ActionBar.w0 c12 = l4.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c12.N();
                    c12.H = new jg.e2(this, 13);
                    this.f42949w = c12;
                    c12.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f42949w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f42949w.getSearchField();
                    org.telegram.ui.ActionBar.f7.V(searchField, i13, getResourceProvider());
                    org.telegram.ui.ActionBar.f7.w(searchField, i13, getResourceProvider());
                    org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Vd, getResourceProvider());
                }
            }
        }
        pc0 pc0Var = new pc0(this, context);
        this.fragmentView = pc0Var;
        org.telegram.ui.ActionBar.f7.i(i12, pc0Var, getResourceProvider());
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f42944s = mutate;
        int themedColor = getThemedColor(i12);
        this.Q0 = themedColor;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f42944s.getPadding(rect);
        if (i14 != 0 && i14 != 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        k0 k0Var = new k0(this, context, 11);
        this.S = k0Var;
        k0Var.setBackgroundDrawable(new org.telegram.ui.Components.dd(o0()));
        MessageObject messageObject2 = this.A0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.ql qlVar = new org.telegram.ui.Components.ql(context, 1);
            this.e = qlVar;
            qlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int i15 = org.telegram.ui.ActionBar.y6.f23724wi;
            int themedColor2 = getThemedColor(i15);
            int i16 = org.telegram.ui.ActionBar.y6.xi;
            int themedColor3 = getThemedColor(i16);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            org.telegram.ui.Components.kb1.b(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(ag.z0.f1401b);
            org.telegram.ui.ActionBar.f7.R(this.e, j02, org.telegram.ui.ActionBar.f7.N(i15), org.telegram.ui.ActionBar.f7.N(i16), getResourceProvider());
            org.telegram.ui.ActionBar.f7.V(this.e, org.telegram.ui.ActionBar.y6.f23704vi, getResourceProvider());
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S.addView(this.e, org.telegram.ui.Components.kb1.h(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                this.e.setOnClickListener(new View.OnClickListener(this) {
                    public final rc0 f45648b;

                    {
                        this.f45648b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        TLRPC.User user;
                        boolean z15;
                        int i17 = r2;
                        rc0 rc0Var = this.f45648b;
                        switch (i17) {
                            case 0:
                                rc0Var.z0(false);
                                rc0Var.T.H(null, rc0Var.f42950w0, true);
                                rc0Var.C0 = true;
                                rc0Var.y0();
                                return;
                            case 1:
                                rc0Var.d.U(null, null);
                                return;
                            case 2:
                                int i18 = rc0Var.F0;
                                Activity parentActivity = rc0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (rc0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
                                        int i19 = R.raw.permission_request_location;
                                        int i20 = org.telegram.ui.ActionBar.y6.L5;
                                        alertDialog$Builder.m(i19, 72, rc0Var.getThemedColor(i20), null);
                                        alertDialog$Builder.n(i20, rc0Var.getResourceProvider());
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                        e2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new yb0(rc0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        rc0Var.showDialog(e2Var);
                                        return;
                                    }
                                    return;
                                } else if (rc0Var.e0() || i18 == 3) {
                                    if ((rc0Var.A0 != null && i18 != 3) || rc0Var.f42954y0 != null) {
                                        if (rc0Var.f42948v0 != null && (iMap = rc0Var.I) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude()), rc0Var.I.getMaxZoomLevel() - 4.0f));
                                        }
                                    } else if (rc0Var.f42948v0 != null && rc0Var.I != null) {
                                        ImageView imageView = rc0Var.f42921a;
                                        int i21 = org.telegram.ui.ActionBar.y6.f23704vi;
                                        org.telegram.ui.ActionBar.f7.t(imageView, i21, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                        rc0Var.f42921a.setTag(Integer.valueOf(i21));
                                        rc0Var.T.L(null);
                                        rc0Var.B0 = false;
                                        rc0Var.z0(false);
                                        rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude())));
                                        if (rc0Var.C0 && i18 != 8) {
                                            Location location3 = rc0Var.f42948v0;
                                            if (location3 != null) {
                                                rc0Var.T.H(null, location3, true);
                                            }
                                            rc0Var.C0 = false;
                                            rc0Var.y0();
                                        }
                                    }
                                    if (rc0Var.m0 != null) {
                                        rc0Var.X.setVisibility(0);
                                        oc0 oc0Var = rc0Var.f42951x;
                                        IMapsProvider.IMarker iMarker = rc0Var.m0;
                                        HashMap hashMap = oc0Var.f42061a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            oc0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        rc0Var.m0 = null;
                                        rc0Var.f42938n0 = null;
                                        rc0Var.f42939o0 = null;
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            case 3:
                                rc0Var.f42933i0 = -1L;
                                rc0Var.B0 = true;
                                if (rc0Var.k0()) {
                                    rc0Var.f42934j0 = true;
                                    rc0Var.A0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (rc0Var.getParentActivity() != null && rc0Var.f42948v0 != null && rc0Var.e0() && rc0Var.I != null) {
                                    fi.v3 v3Var = rc0Var.f42953y;
                                    if (v3Var != null) {
                                        v3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0);
                                    if (rc0Var.G) {
                                        rc0Var.F[0].d(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        rc0Var.f42925c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = rc0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            rc0Var.O = null;
                                        }
                                        rc0Var.G = true;
                                        rc0Var.n0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new kb0(2, rc0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = rc0Var.O;
                                    if (iCircle2 == null) {
                                        rc0Var.f0(500);
                                    } else {
                                        rc0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(rc0Var.f42928e0)) {
                                        user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42928e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity2 = rc0Var.getParentActivity();
                                    yb0 yb0Var = new yb0(rc0Var, 3);
                                    org.telegram.ui.Components.voip.k1 k1Var = new org.telegram.ui.Components.voip.k1(25, rc0Var, user);
                                    zb0 zb0Var = new zb0(rc0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity2);
                                    frameLayout.f27859a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f27862f = false;
                                    frameLayout.h = null;
                                    frameLayout.f27863n = new Rect();
                                    new Paint();
                                    frameLayout.f27866w = true;
                                    frameLayout.F = org.telegram.ui.Components.ds.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = zb0Var;
                                    frameLayout.f27868y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    org.telegram.ui.ActionBar.f7.y(frameLayout, mutate2, org.telegram.ui.ActionBar.y6.f23428h5, null, PorterDuff.Mode.MULTIPLY);
                                    mutate2.getPadding(rect2);
                                    int i22 = rect2.left;
                                    frameLayout.f27867x = i22;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i22, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i22, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, org.telegram.ui.Components.kb1.i(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = yb0Var;
                                    org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(parentActivity2, null);
                                    frameLayout.G = nd0Var;
                                    nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    nd0Var.setItemCount(5);
                                    org.telegram.ui.Components.nd0 nd0Var2 = new org.telegram.ui.Components.nd0(parentActivity2, null);
                                    frameLayout.H = nd0Var2;
                                    nd0Var2.setItemCount(5);
                                    nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(frameLayout, parentActivity2);
                                    frameLayout.P = bj0Var;
                                    bj0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                    bj0Var.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity2);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, null, 1, 20.0f);
                                    frameLayout3.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new ei.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    bj0Var.addView(linearLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                                    TextView textView2 = new TextView(parentActivity2);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity2);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                                    nd0Var.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 0));
                                    nd0Var.setMinValue(0);
                                    nd0Var.setMaxValue(10);
                                    nd0Var.setWrapSelectorWheel(false);
                                    nd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(frameLayout, 1);
                                    nd0Var.setOnValueChangedListener(zi0Var);
                                    nd0Var2.setMinValue(0);
                                    nd0Var2.setMaxValue(10);
                                    nd0Var2.setWrapSelectorWheel(false);
                                    nd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(nd0Var2, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                                    nd0Var2.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 2));
                                    nd0Var2.setOnValueChangedListener(zi0Var);
                                    nd0Var.setValue(0);
                                    nd0Var2.setValue(6);
                                    bj0Var.addView(frameLayout4, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                                    frameLayout4.addView((View) textView3, org.telegram.ui.Components.kb1.g(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.ga(23, frameLayout, k1Var));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, null);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, org.telegram.ui.Components.kb1.g(48.0f, -1));
                                    frameLayout2.addView(bj0Var, org.telegram.ui.Components.kb1.i(-1, -2, 51));
                                    rc0Var.R = frameLayout;
                                    ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                                    org.telegram.ui.Components.ej0 ej0Var = rc0Var.R;
                                    ej0Var.f27864r = false;
                                    AnimatorSet animatorSet = ej0Var.f27865s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        ej0Var.f27865s = null;
                                    }
                                    org.telegram.ui.Components.aj0 aj0Var = ej0Var.v;
                                    aj0Var.measure(View.MeasureSpec.makeMeasureSpec((ej0Var.f27867x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (ej0Var.f27864r) {
                                        z15 = true;
                                    } else {
                                        aj0Var.setVisibility(0);
                                        if (ej0Var.f27866w) {
                                            ej0Var.setLayerType(2, null);
                                        }
                                        aj0Var.setTranslationY(aj0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        ej0Var.f27865s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                                        ej0Var.f27865s.setDuration(400L);
                                        ej0Var.f27865s.setStartDelay(20L);
                                        ej0Var.f27865s.setInterpolator(ej0Var.F);
                                        z15 = true;
                                        ej0Var.f27865s.addListener(new org.telegram.ui.Components.dj0(ej0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        ej0Var.f27865s.start();
                                    }
                                    ej0Var.c(z15);
                                    return;
                                }
                                return;
                            default:
                                rc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = rc0Var.A0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                        }
                    }
                });
                z11 = false;
                this.e.setTranslationX(0.0f);
            } else {
                z11 = false;
                this.e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                this.e.setOnClickListener(new View.OnClickListener(this) {
                    public final rc0 f45648b;

                    {
                        this.f45648b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        TLRPC.User user;
                        boolean z15;
                        int i17 = r2;
                        rc0 rc0Var = this.f45648b;
                        switch (i17) {
                            case 0:
                                rc0Var.z0(false);
                                rc0Var.T.H(null, rc0Var.f42950w0, true);
                                rc0Var.C0 = true;
                                rc0Var.y0();
                                return;
                            case 1:
                                rc0Var.d.U(null, null);
                                return;
                            case 2:
                                int i18 = rc0Var.F0;
                                Activity parentActivity = rc0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (rc0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
                                        int i19 = R.raw.permission_request_location;
                                        int i20 = org.telegram.ui.ActionBar.y6.L5;
                                        alertDialog$Builder.m(i19, 72, rc0Var.getThemedColor(i20), null);
                                        alertDialog$Builder.n(i20, rc0Var.getResourceProvider());
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                        e2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new yb0(rc0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        rc0Var.showDialog(e2Var);
                                        return;
                                    }
                                    return;
                                } else if (rc0Var.e0() || i18 == 3) {
                                    if ((rc0Var.A0 != null && i18 != 3) || rc0Var.f42954y0 != null) {
                                        if (rc0Var.f42948v0 != null && (iMap = rc0Var.I) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude()), rc0Var.I.getMaxZoomLevel() - 4.0f));
                                        }
                                    } else if (rc0Var.f42948v0 != null && rc0Var.I != null) {
                                        ImageView imageView = rc0Var.f42921a;
                                        int i21 = org.telegram.ui.ActionBar.y6.f23704vi;
                                        org.telegram.ui.ActionBar.f7.t(imageView, i21, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                        rc0Var.f42921a.setTag(Integer.valueOf(i21));
                                        rc0Var.T.L(null);
                                        rc0Var.B0 = false;
                                        rc0Var.z0(false);
                                        rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude())));
                                        if (rc0Var.C0 && i18 != 8) {
                                            Location location3 = rc0Var.f42948v0;
                                            if (location3 != null) {
                                                rc0Var.T.H(null, location3, true);
                                            }
                                            rc0Var.C0 = false;
                                            rc0Var.y0();
                                        }
                                    }
                                    if (rc0Var.m0 != null) {
                                        rc0Var.X.setVisibility(0);
                                        oc0 oc0Var = rc0Var.f42951x;
                                        IMapsProvider.IMarker iMarker = rc0Var.m0;
                                        HashMap hashMap = oc0Var.f42061a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            oc0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        rc0Var.m0 = null;
                                        rc0Var.f42938n0 = null;
                                        rc0Var.f42939o0 = null;
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            case 3:
                                rc0Var.f42933i0 = -1L;
                                rc0Var.B0 = true;
                                if (rc0Var.k0()) {
                                    rc0Var.f42934j0 = true;
                                    rc0Var.A0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (rc0Var.getParentActivity() != null && rc0Var.f42948v0 != null && rc0Var.e0() && rc0Var.I != null) {
                                    fi.v3 v3Var = rc0Var.f42953y;
                                    if (v3Var != null) {
                                        v3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0);
                                    if (rc0Var.G) {
                                        rc0Var.F[0].d(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        rc0Var.f42925c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = rc0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            rc0Var.O = null;
                                        }
                                        rc0Var.G = true;
                                        rc0Var.n0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new kb0(2, rc0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = rc0Var.O;
                                    if (iCircle2 == null) {
                                        rc0Var.f0(500);
                                    } else {
                                        rc0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(rc0Var.f42928e0)) {
                                        user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42928e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity2 = rc0Var.getParentActivity();
                                    yb0 yb0Var = new yb0(rc0Var, 3);
                                    org.telegram.ui.Components.voip.k1 k1Var = new org.telegram.ui.Components.voip.k1(25, rc0Var, user);
                                    zb0 zb0Var = new zb0(rc0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity2);
                                    frameLayout.f27859a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f27862f = false;
                                    frameLayout.h = null;
                                    frameLayout.f27863n = new Rect();
                                    new Paint();
                                    frameLayout.f27866w = true;
                                    frameLayout.F = org.telegram.ui.Components.ds.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = zb0Var;
                                    frameLayout.f27868y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    org.telegram.ui.ActionBar.f7.y(frameLayout, mutate2, org.telegram.ui.ActionBar.y6.f23428h5, null, PorterDuff.Mode.MULTIPLY);
                                    mutate2.getPadding(rect2);
                                    int i22 = rect2.left;
                                    frameLayout.f27867x = i22;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i22, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i22, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, org.telegram.ui.Components.kb1.i(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = yb0Var;
                                    org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(parentActivity2, null);
                                    frameLayout.G = nd0Var;
                                    nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    nd0Var.setItemCount(5);
                                    org.telegram.ui.Components.nd0 nd0Var2 = new org.telegram.ui.Components.nd0(parentActivity2, null);
                                    frameLayout.H = nd0Var2;
                                    nd0Var2.setItemCount(5);
                                    nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(frameLayout, parentActivity2);
                                    frameLayout.P = bj0Var;
                                    bj0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                    bj0Var.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity2);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, null, 1, 20.0f);
                                    frameLayout3.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new ei.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    bj0Var.addView(linearLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                                    TextView textView2 = new TextView(parentActivity2);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity2);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                                    nd0Var.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 0));
                                    nd0Var.setMinValue(0);
                                    nd0Var.setMaxValue(10);
                                    nd0Var.setWrapSelectorWheel(false);
                                    nd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(frameLayout, 1);
                                    nd0Var.setOnValueChangedListener(zi0Var);
                                    nd0Var2.setMinValue(0);
                                    nd0Var2.setMaxValue(10);
                                    nd0Var2.setWrapSelectorWheel(false);
                                    nd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(nd0Var2, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                                    nd0Var2.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 2));
                                    nd0Var2.setOnValueChangedListener(zi0Var);
                                    nd0Var.setValue(0);
                                    nd0Var2.setValue(6);
                                    bj0Var.addView(frameLayout4, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                                    frameLayout4.addView((View) textView3, org.telegram.ui.Components.kb1.g(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.ga(23, frameLayout, k1Var));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, null);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, org.telegram.ui.Components.kb1.g(48.0f, -1));
                                    frameLayout2.addView(bj0Var, org.telegram.ui.Components.kb1.i(-1, -2, 51));
                                    rc0Var.R = frameLayout;
                                    ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                                    org.telegram.ui.Components.ej0 ej0Var = rc0Var.R;
                                    ej0Var.f27864r = false;
                                    AnimatorSet animatorSet = ej0Var.f27865s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        ej0Var.f27865s = null;
                                    }
                                    org.telegram.ui.Components.aj0 aj0Var = ej0Var.v;
                                    aj0Var.measure(View.MeasureSpec.makeMeasureSpec((ej0Var.f27867x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (ej0Var.f27864r) {
                                        z15 = true;
                                    } else {
                                        aj0Var.setVisibility(0);
                                        if (ej0Var.f27866w) {
                                            ej0Var.setLayerType(2, null);
                                        }
                                        aj0Var.setTranslationY(aj0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        ej0Var.f27865s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                                        ej0Var.f27865s.setDuration(400L);
                                        ej0Var.f27865s.setStartDelay(20L);
                                        ej0Var.f27865s.setInterpolator(ej0Var.F);
                                        z15 = true;
                                        ej0Var.f27865s.addListener(new org.telegram.ui.Components.dj0(ej0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        ej0Var.f27865s.start();
                                    }
                                    ej0Var.c(z15);
                                    return;
                                }
                                return;
                            default:
                                rc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = rc0Var.A0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                        }
                    }
                });
            }
        } else {
            z11 = false;
        }
        int i17 = org.telegram.ui.ActionBar.y6.f23686ui;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i17), false, getResourceProvider());
        this.d = w0Var;
        w0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp2 = AndroidUtilities.dp(40.0f);
        int i18 = org.telegram.ui.ActionBar.y6.f23724wi;
        int themedColor4 = getThemedColor(i18);
        int i19 = org.telegram.ui.ActionBar.y6.xi;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(dp2, themedColor4, getThemedColor(i19));
        org.telegram.ui.Components.kb1.b(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d;
        ag.v0 v0Var = ag.z0.f1400a;
        w0Var2.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.f7.R(this.d, i02, org.telegram.ui.ActionBar.f7.N(i18), org.telegram.ui.ActionBar.f7.N(i19), getResourceProvider());
        this.d.setIcon(R.drawable.msg_map_type);
        this.S.addView(this.d, org.telegram.ui.Components.kb1.h(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f45648b;

            {
                this.f45648b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z15;
                int i172 = r2;
                rc0 rc0Var = this.f45648b;
                switch (i172) {
                    case 0:
                        rc0Var.z0(false);
                        rc0Var.T.H(null, rc0Var.f42950w0, true);
                        rc0Var.C0 = true;
                        rc0Var.y0();
                        return;
                    case 1:
                        rc0Var.d.U(null, null);
                        return;
                    case 2:
                        int i182 = rc0Var.F0;
                        Activity parentActivity = rc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (rc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
                                int i192 = R.raw.permission_request_location;
                                int i20 = org.telegram.ui.ActionBar.y6.L5;
                                alertDialog$Builder.m(i192, 72, rc0Var.getThemedColor(i20), null);
                                alertDialog$Builder.n(i20, rc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                e2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new yb0(rc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                rc0Var.showDialog(e2Var);
                                return;
                            }
                            return;
                        } else if (rc0Var.e0() || i182 == 3) {
                            if ((rc0Var.A0 != null && i182 != 3) || rc0Var.f42954y0 != null) {
                                if (rc0Var.f42948v0 != null && (iMap = rc0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude()), rc0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (rc0Var.f42948v0 != null && rc0Var.I != null) {
                                ImageView imageView = rc0Var.f42921a;
                                int i21 = org.telegram.ui.ActionBar.y6.f23704vi;
                                org.telegram.ui.ActionBar.f7.t(imageView, i21, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                rc0Var.f42921a.setTag(Integer.valueOf(i21));
                                rc0Var.T.L(null);
                                rc0Var.B0 = false;
                                rc0Var.z0(false);
                                rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude())));
                                if (rc0Var.C0 && i182 != 8) {
                                    Location location3 = rc0Var.f42948v0;
                                    if (location3 != null) {
                                        rc0Var.T.H(null, location3, true);
                                    }
                                    rc0Var.C0 = false;
                                    rc0Var.y0();
                                }
                            }
                            if (rc0Var.m0 != null) {
                                rc0Var.X.setVisibility(0);
                                oc0 oc0Var = rc0Var.f42951x;
                                IMapsProvider.IMarker iMarker = rc0Var.m0;
                                HashMap hashMap = oc0Var.f42061a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    oc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                rc0Var.m0 = null;
                                rc0Var.f42938n0 = null;
                                rc0Var.f42939o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        rc0Var.f42933i0 = -1L;
                        rc0Var.B0 = true;
                        if (rc0Var.k0()) {
                            rc0Var.f42934j0 = true;
                            rc0Var.A0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42948v0 != null && rc0Var.e0() && rc0Var.I != null) {
                            fi.v3 v3Var = rc0Var.f42953y;
                            if (v3Var != null) {
                                v3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0);
                            if (rc0Var.G) {
                                rc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42925c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.O = null;
                                }
                                rc0Var.G = true;
                                rc0Var.n0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new kb0(2, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.O;
                            if (iCircle2 == null) {
                                rc0Var.f0(500);
                            } else {
                                rc0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42928e0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42928e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = rc0Var.getParentActivity();
                            yb0 yb0Var = new yb0(rc0Var, 3);
                            org.telegram.ui.Components.voip.k1 k1Var = new org.telegram.ui.Components.voip.k1(25, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27859a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27862f = false;
                            frameLayout.h = null;
                            frameLayout.f27863n = new Rect();
                            new Paint();
                            frameLayout.f27866w = true;
                            frameLayout.F = org.telegram.ui.Components.ds.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = zb0Var;
                            frameLayout.f27868y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            org.telegram.ui.ActionBar.f7.y(frameLayout, mutate2, org.telegram.ui.ActionBar.y6.f23428h5, null, PorterDuff.Mode.MULTIPLY);
                            mutate2.getPadding(rect2);
                            int i22 = rect2.left;
                            frameLayout.f27867x = i22;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i22, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i22, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, org.telegram.ui.Components.kb1.i(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = yb0Var;
                            org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.G = nd0Var;
                            nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            nd0Var.setItemCount(5);
                            org.telegram.ui.Components.nd0 nd0Var2 = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.H = nd0Var2;
                            nd0Var2.setItemCount(5);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(frameLayout, parentActivity2);
                            frameLayout.P = bj0Var;
                            bj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            bj0Var.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity2);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, null, 1, 20.0f);
                            frameLayout3.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ei.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            bj0Var.addView(linearLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView2 = new TextView(parentActivity2);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 0));
                            nd0Var.setMinValue(0);
                            nd0Var.setMaxValue(10);
                            nd0Var.setWrapSelectorWheel(false);
                            nd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(frameLayout, 1);
                            nd0Var.setOnValueChangedListener(zi0Var);
                            nd0Var2.setMinValue(0);
                            nd0Var2.setMaxValue(10);
                            nd0Var2.setWrapSelectorWheel(false);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(nd0Var2, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var2.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 2));
                            nd0Var2.setOnValueChangedListener(zi0Var);
                            nd0Var.setValue(0);
                            nd0Var2.setValue(6);
                            bj0Var.addView(frameLayout4, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                            frameLayout4.addView((View) textView3, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ga(23, frameLayout, k1Var));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, null);
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            frameLayout2.addView(bj0Var, org.telegram.ui.Components.kb1.i(-1, -2, 51));
                            rc0Var.R = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                            org.telegram.ui.Components.ej0 ej0Var = rc0Var.R;
                            ej0Var.f27864r = false;
                            AnimatorSet animatorSet = ej0Var.f27865s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ej0Var.f27865s = null;
                            }
                            org.telegram.ui.Components.aj0 aj0Var = ej0Var.v;
                            aj0Var.measure(View.MeasureSpec.makeMeasureSpec((ej0Var.f27867x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ej0Var.f27864r) {
                                z15 = true;
                            } else {
                                aj0Var.setVisibility(0);
                                if (ej0Var.f27866w) {
                                    ej0Var.setLayerType(2, null);
                                }
                                aj0Var.setTranslationY(aj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ej0Var.f27865s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                                ej0Var.f27865s.setDuration(400L);
                                ej0Var.f27865s.setStartDelay(20L);
                                ej0Var.f27865s.setInterpolator(ej0Var.F);
                                z15 = true;
                                ej0Var.f27865s.addListener(new org.telegram.ui.Components.dj0(ej0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ej0Var.f27865s.start();
                            }
                            ej0Var.c(z15);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.A0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        this.d.setDelegate(new yb0(this, 0));
        this.f42921a = new ImageView(context);
        org.telegram.ui.Cells.y i03 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        org.telegram.ui.Components.kb1.b(this.f42921a);
        this.f42921a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42921a.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.f7.R(this.f42921a, i03, org.telegram.ui.ActionBar.f7.N(i18), org.telegram.ui.ActionBar.f7.N(i19), getResourceProvider());
        this.f42921a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f42921a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f42921a;
        int i20 = org.telegram.ui.ActionBar.y6.f23704vi;
        org.telegram.ui.ActionBar.f7.t(imageView2, i20, getResourceProvider(), mode);
        this.f42921a.setTag(Integer.valueOf(i20));
        this.f42921a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams h = org.telegram.ui.Components.kb1.h(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        h.bottomMargin = (layoutParams2.height - rect.top) + h.bottomMargin;
        this.S.addView(this.f42921a, h);
        this.f42921a.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f45648b;

            {
                this.f45648b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z15;
                int i172 = r2;
                rc0 rc0Var = this.f45648b;
                switch (i172) {
                    case 0:
                        rc0Var.z0(false);
                        rc0Var.T.H(null, rc0Var.f42950w0, true);
                        rc0Var.C0 = true;
                        rc0Var.y0();
                        return;
                    case 1:
                        rc0Var.d.U(null, null);
                        return;
                    case 2:
                        int i182 = rc0Var.F0;
                        Activity parentActivity = rc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (rc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
                                int i192 = R.raw.permission_request_location;
                                int i202 = org.telegram.ui.ActionBar.y6.L5;
                                alertDialog$Builder.m(i192, 72, rc0Var.getThemedColor(i202), null);
                                alertDialog$Builder.n(i202, rc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                e2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new yb0(rc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                rc0Var.showDialog(e2Var);
                                return;
                            }
                            return;
                        } else if (rc0Var.e0() || i182 == 3) {
                            if ((rc0Var.A0 != null && i182 != 3) || rc0Var.f42954y0 != null) {
                                if (rc0Var.f42948v0 != null && (iMap = rc0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude()), rc0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (rc0Var.f42948v0 != null && rc0Var.I != null) {
                                ImageView imageView3 = rc0Var.f42921a;
                                int i21 = org.telegram.ui.ActionBar.y6.f23704vi;
                                org.telegram.ui.ActionBar.f7.t(imageView3, i21, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                rc0Var.f42921a.setTag(Integer.valueOf(i21));
                                rc0Var.T.L(null);
                                rc0Var.B0 = false;
                                rc0Var.z0(false);
                                rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude())));
                                if (rc0Var.C0 && i182 != 8) {
                                    Location location3 = rc0Var.f42948v0;
                                    if (location3 != null) {
                                        rc0Var.T.H(null, location3, true);
                                    }
                                    rc0Var.C0 = false;
                                    rc0Var.y0();
                                }
                            }
                            if (rc0Var.m0 != null) {
                                rc0Var.X.setVisibility(0);
                                oc0 oc0Var = rc0Var.f42951x;
                                IMapsProvider.IMarker iMarker = rc0Var.m0;
                                HashMap hashMap = oc0Var.f42061a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    oc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                rc0Var.m0 = null;
                                rc0Var.f42938n0 = null;
                                rc0Var.f42939o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        rc0Var.f42933i0 = -1L;
                        rc0Var.B0 = true;
                        if (rc0Var.k0()) {
                            rc0Var.f42934j0 = true;
                            rc0Var.A0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42948v0 != null && rc0Var.e0() && rc0Var.I != null) {
                            fi.v3 v3Var = rc0Var.f42953y;
                            if (v3Var != null) {
                                v3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0);
                            if (rc0Var.G) {
                                rc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42925c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.O = null;
                                }
                                rc0Var.G = true;
                                rc0Var.n0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new kb0(2, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.O;
                            if (iCircle2 == null) {
                                rc0Var.f0(500);
                            } else {
                                rc0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42928e0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42928e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = rc0Var.getParentActivity();
                            yb0 yb0Var = new yb0(rc0Var, 3);
                            org.telegram.ui.Components.voip.k1 k1Var = new org.telegram.ui.Components.voip.k1(25, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27859a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27862f = false;
                            frameLayout.h = null;
                            frameLayout.f27863n = new Rect();
                            new Paint();
                            frameLayout.f27866w = true;
                            frameLayout.F = org.telegram.ui.Components.ds.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = zb0Var;
                            frameLayout.f27868y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            org.telegram.ui.ActionBar.f7.y(frameLayout, mutate2, org.telegram.ui.ActionBar.y6.f23428h5, null, PorterDuff.Mode.MULTIPLY);
                            mutate2.getPadding(rect2);
                            int i22 = rect2.left;
                            frameLayout.f27867x = i22;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i22, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i22, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, org.telegram.ui.Components.kb1.i(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = yb0Var;
                            org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.G = nd0Var;
                            nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            nd0Var.setItemCount(5);
                            org.telegram.ui.Components.nd0 nd0Var2 = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.H = nd0Var2;
                            nd0Var2.setItemCount(5);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(frameLayout, parentActivity2);
                            frameLayout.P = bj0Var;
                            bj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            bj0Var.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity2);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, null, 1, 20.0f);
                            frameLayout3.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ei.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            bj0Var.addView(linearLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView2 = new TextView(parentActivity2);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 0));
                            nd0Var.setMinValue(0);
                            nd0Var.setMaxValue(10);
                            nd0Var.setWrapSelectorWheel(false);
                            nd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(frameLayout, 1);
                            nd0Var.setOnValueChangedListener(zi0Var);
                            nd0Var2.setMinValue(0);
                            nd0Var2.setMaxValue(10);
                            nd0Var2.setWrapSelectorWheel(false);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(nd0Var2, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var2.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 2));
                            nd0Var2.setOnValueChangedListener(zi0Var);
                            nd0Var.setValue(0);
                            nd0Var2.setValue(6);
                            bj0Var.addView(frameLayout4, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                            frameLayout4.addView((View) textView3, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ga(23, frameLayout, k1Var));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, null);
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            frameLayout2.addView(bj0Var, org.telegram.ui.Components.kb1.i(-1, -2, 51));
                            rc0Var.R = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                            org.telegram.ui.Components.ej0 ej0Var = rc0Var.R;
                            ej0Var.f27864r = false;
                            AnimatorSet animatorSet = ej0Var.f27865s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ej0Var.f27865s = null;
                            }
                            org.telegram.ui.Components.aj0 aj0Var = ej0Var.v;
                            aj0Var.measure(View.MeasureSpec.makeMeasureSpec((ej0Var.f27867x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ej0Var.f27864r) {
                                z15 = true;
                            } else {
                                aj0Var.setVisibility(0);
                                if (ej0Var.f27866w) {
                                    ej0Var.setLayerType(2, null);
                                }
                                aj0Var.setTranslationY(aj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ej0Var.f27865s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                                ej0Var.f27865s.setDuration(400L);
                                ej0Var.f27865s.setStartDelay(20L);
                                ej0Var.f27865s.setInterpolator(ej0Var.F);
                                z15 = true;
                                ej0Var.f27865s.addListener(new org.telegram.ui.Components.dj0(ej0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ej0Var.f27865s.start();
                            }
                            ej0Var.c(z15);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.A0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.f42923b = textView;
        textView.setGravity(17);
        this.f42923b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42923b.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(this.f42923b, org.telegram.ui.ActionBar.y6.Oh, this.resourceProvider);
        this.f42923b.setTypeface(AndroidUtilities.bold());
        this.f42923b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f42923b.setText(LocaleController.getString(R.string.LocationsShowAll));
        org.telegram.ui.ActionBar.f7.R(this.f42923b, org.telegram.ui.ActionBar.y6.a0(getThemedColor(i18), getThemedColor(i19), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)), org.telegram.ui.ActionBar.f7.N(i18), org.telegram.ui.ActionBar.f7.N(i19), getResourceProvider());
        FrameLayout.LayoutParams h10 = org.telegram.ui.Components.kb1.h(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        h10.bottomMargin = (layoutParams2.height - rect.top) + h10.bottomMargin;
        this.S.addView(this.f42923b, h10);
        org.telegram.ui.Components.kb1.b(this.f42923b);
        this.f42923b.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f45648b;

            {
                this.f45648b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z15;
                int i172 = r2;
                rc0 rc0Var = this.f45648b;
                switch (i172) {
                    case 0:
                        rc0Var.z0(false);
                        rc0Var.T.H(null, rc0Var.f42950w0, true);
                        rc0Var.C0 = true;
                        rc0Var.y0();
                        return;
                    case 1:
                        rc0Var.d.U(null, null);
                        return;
                    case 2:
                        int i182 = rc0Var.F0;
                        Activity parentActivity = rc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (rc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
                                int i192 = R.raw.permission_request_location;
                                int i202 = org.telegram.ui.ActionBar.y6.L5;
                                alertDialog$Builder.m(i192, 72, rc0Var.getThemedColor(i202), null);
                                alertDialog$Builder.n(i202, rc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                e2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new yb0(rc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                rc0Var.showDialog(e2Var);
                                return;
                            }
                            return;
                        } else if (rc0Var.e0() || i182 == 3) {
                            if ((rc0Var.A0 != null && i182 != 3) || rc0Var.f42954y0 != null) {
                                if (rc0Var.f42948v0 != null && (iMap = rc0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude()), rc0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (rc0Var.f42948v0 != null && rc0Var.I != null) {
                                ImageView imageView3 = rc0Var.f42921a;
                                int i21 = org.telegram.ui.ActionBar.y6.f23704vi;
                                org.telegram.ui.ActionBar.f7.t(imageView3, i21, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                rc0Var.f42921a.setTag(Integer.valueOf(i21));
                                rc0Var.T.L(null);
                                rc0Var.B0 = false;
                                rc0Var.z0(false);
                                rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude())));
                                if (rc0Var.C0 && i182 != 8) {
                                    Location location3 = rc0Var.f42948v0;
                                    if (location3 != null) {
                                        rc0Var.T.H(null, location3, true);
                                    }
                                    rc0Var.C0 = false;
                                    rc0Var.y0();
                                }
                            }
                            if (rc0Var.m0 != null) {
                                rc0Var.X.setVisibility(0);
                                oc0 oc0Var = rc0Var.f42951x;
                                IMapsProvider.IMarker iMarker = rc0Var.m0;
                                HashMap hashMap = oc0Var.f42061a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    oc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                rc0Var.m0 = null;
                                rc0Var.f42938n0 = null;
                                rc0Var.f42939o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        rc0Var.f42933i0 = -1L;
                        rc0Var.B0 = true;
                        if (rc0Var.k0()) {
                            rc0Var.f42934j0 = true;
                            rc0Var.A0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42948v0 != null && rc0Var.e0() && rc0Var.I != null) {
                            fi.v3 v3Var = rc0Var.f42953y;
                            if (v3Var != null) {
                                v3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0);
                            if (rc0Var.G) {
                                rc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42925c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.O = null;
                                }
                                rc0Var.G = true;
                                rc0Var.n0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new kb0(2, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.O;
                            if (iCircle2 == null) {
                                rc0Var.f0(500);
                            } else {
                                rc0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42928e0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42928e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = rc0Var.getParentActivity();
                            yb0 yb0Var = new yb0(rc0Var, 3);
                            org.telegram.ui.Components.voip.k1 k1Var = new org.telegram.ui.Components.voip.k1(25, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27859a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27862f = false;
                            frameLayout.h = null;
                            frameLayout.f27863n = new Rect();
                            new Paint();
                            frameLayout.f27866w = true;
                            frameLayout.F = org.telegram.ui.Components.ds.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = zb0Var;
                            frameLayout.f27868y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            org.telegram.ui.ActionBar.f7.y(frameLayout, mutate2, org.telegram.ui.ActionBar.y6.f23428h5, null, PorterDuff.Mode.MULTIPLY);
                            mutate2.getPadding(rect2);
                            int i22 = rect2.left;
                            frameLayout.f27867x = i22;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i22, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i22, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, org.telegram.ui.Components.kb1.i(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = yb0Var;
                            org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.G = nd0Var;
                            nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            nd0Var.setItemCount(5);
                            org.telegram.ui.Components.nd0 nd0Var2 = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.H = nd0Var2;
                            nd0Var2.setItemCount(5);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(frameLayout, parentActivity2);
                            frameLayout.P = bj0Var;
                            bj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            bj0Var.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.f23465j5, null, 1, 20.0f);
                            frameLayout3.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ei.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            bj0Var.addView(linearLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView22 = new TextView(parentActivity2);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 0));
                            nd0Var.setMinValue(0);
                            nd0Var.setMaxValue(10);
                            nd0Var.setWrapSelectorWheel(false);
                            nd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(frameLayout, 1);
                            nd0Var.setOnValueChangedListener(zi0Var);
                            nd0Var2.setMinValue(0);
                            nd0Var2.setMaxValue(10);
                            nd0Var2.setWrapSelectorWheel(false);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(nd0Var2, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var2.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 2));
                            nd0Var2.setOnValueChangedListener(zi0Var);
                            nd0Var.setValue(0);
                            nd0Var2.setValue(6);
                            bj0Var.addView(frameLayout4, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                            frameLayout4.addView((View) textView3, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ga(23, frameLayout, k1Var));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.q5, null);
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            frameLayout2.addView(bj0Var, org.telegram.ui.Components.kb1.i(-1, -2, 51));
                            rc0Var.R = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                            org.telegram.ui.Components.ej0 ej0Var = rc0Var.R;
                            ej0Var.f27864r = false;
                            AnimatorSet animatorSet = ej0Var.f27865s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ej0Var.f27865s = null;
                            }
                            org.telegram.ui.Components.aj0 aj0Var = ej0Var.v;
                            aj0Var.measure(View.MeasureSpec.makeMeasureSpec((ej0Var.f27867x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ej0Var.f27864r) {
                                z15 = true;
                            } else {
                                aj0Var.setVisibility(0);
                                if (ej0Var.f27866w) {
                                    ej0Var.setLayerType(2, null);
                                }
                                aj0Var.setTranslationY(aj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ej0Var.f27865s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                                ej0Var.f27865s.setDuration(400L);
                                ej0Var.f27865s.setStartDelay(20L);
                                ej0Var.f27865s.setInterpolator(ej0Var.F);
                                z15 = true;
                                ej0Var.f27865s.addListener(new org.telegram.ui.Components.dj0(ej0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ej0Var.f27865s.start();
                            }
                            ej0Var.c(z15);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.A0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        A0(false, false);
        this.f42925c = new ImageView(context);
        org.telegram.ui.Cells.y i04 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        org.telegram.ui.Components.kb1.b(this.f42925c);
        this.f42925c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42925c.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.f7.t(this.f42925c, i17, getResourceProvider(), mode);
        org.telegram.ui.ActionBar.f7.R(this.f42925c, i04, org.telegram.ui.ActionBar.f7.N(i18), org.telegram.ui.ActionBar.f7.N(i19), getResourceProvider());
        this.f42925c.setScaleType(scaleType);
        this.f42925c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.S.addView(this.f42925c, org.telegram.ui.Components.kb1.h(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.f42925c.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f45648b;

            {
                this.f45648b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z15;
                int i172 = r2;
                rc0 rc0Var = this.f45648b;
                switch (i172) {
                    case 0:
                        rc0Var.z0(false);
                        rc0Var.T.H(null, rc0Var.f42950w0, true);
                        rc0Var.C0 = true;
                        rc0Var.y0();
                        return;
                    case 1:
                        rc0Var.d.U(null, null);
                        return;
                    case 2:
                        int i182 = rc0Var.F0;
                        Activity parentActivity = rc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (rc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
                                int i192 = R.raw.permission_request_location;
                                int i202 = org.telegram.ui.ActionBar.y6.L5;
                                alertDialog$Builder.m(i192, 72, rc0Var.getThemedColor(i202), null);
                                alertDialog$Builder.n(i202, rc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                e2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new yb0(rc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                rc0Var.showDialog(e2Var);
                                return;
                            }
                            return;
                        } else if (rc0Var.e0() || i182 == 3) {
                            if ((rc0Var.A0 != null && i182 != 3) || rc0Var.f42954y0 != null) {
                                if (rc0Var.f42948v0 != null && (iMap = rc0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude()), rc0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (rc0Var.f42948v0 != null && rc0Var.I != null) {
                                ImageView imageView3 = rc0Var.f42921a;
                                int i21 = org.telegram.ui.ActionBar.y6.f23704vi;
                                org.telegram.ui.ActionBar.f7.t(imageView3, i21, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                rc0Var.f42921a.setTag(Integer.valueOf(i21));
                                rc0Var.T.L(null);
                                rc0Var.B0 = false;
                                rc0Var.z0(false);
                                rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.f42948v0.getLatitude(), rc0Var.f42948v0.getLongitude())));
                                if (rc0Var.C0 && i182 != 8) {
                                    Location location3 = rc0Var.f42948v0;
                                    if (location3 != null) {
                                        rc0Var.T.H(null, location3, true);
                                    }
                                    rc0Var.C0 = false;
                                    rc0Var.y0();
                                }
                            }
                            if (rc0Var.m0 != null) {
                                rc0Var.X.setVisibility(0);
                                oc0 oc0Var = rc0Var.f42951x;
                                IMapsProvider.IMarker iMarker = rc0Var.m0;
                                HashMap hashMap = oc0Var.f42061a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    oc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                rc0Var.m0 = null;
                                rc0Var.f42938n0 = null;
                                rc0Var.f42939o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        rc0Var.f42933i0 = -1L;
                        rc0Var.B0 = true;
                        if (rc0Var.k0()) {
                            rc0Var.f42934j0 = true;
                            rc0Var.A0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42948v0 != null && rc0Var.e0() && rc0Var.I != null) {
                            fi.v3 v3Var = rc0Var.f42953y;
                            if (v3Var != null) {
                                v3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0);
                            if (rc0Var.G) {
                                rc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42925c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.O = null;
                                }
                                rc0Var.G = true;
                                rc0Var.n0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new kb0(2, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.O;
                            if (iCircle2 == null) {
                                rc0Var.f0(500);
                            } else {
                                rc0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42928e0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42928e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = rc0Var.getParentActivity();
                            yb0 yb0Var = new yb0(rc0Var, 3);
                            org.telegram.ui.Components.voip.k1 k1Var = new org.telegram.ui.Components.voip.k1(25, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27859a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27862f = false;
                            frameLayout.h = null;
                            frameLayout.f27863n = new Rect();
                            new Paint();
                            frameLayout.f27866w = true;
                            frameLayout.F = org.telegram.ui.Components.ds.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = zb0Var;
                            frameLayout.f27868y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            org.telegram.ui.ActionBar.f7.y(frameLayout, mutate2, org.telegram.ui.ActionBar.y6.f23428h5, null, PorterDuff.Mode.MULTIPLY);
                            mutate2.getPadding(rect2);
                            int i22 = rect2.left;
                            frameLayout.f27867x = i22;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i22, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i22, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, org.telegram.ui.Components.kb1.i(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = yb0Var;
                            org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.G = nd0Var;
                            nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            nd0Var.setItemCount(5);
                            org.telegram.ui.Components.nd0 nd0Var2 = new org.telegram.ui.Components.nd0(parentActivity2, null);
                            frameLayout.H = nd0Var2;
                            nd0Var2.setItemCount(5);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(frameLayout, parentActivity2);
                            frameLayout.P = bj0Var;
                            bj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            bj0Var.addView(frameLayout3, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.f23465j5, null, 1, 20.0f);
                            frameLayout3.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ei.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            bj0Var.addView(linearLayout, org.telegram.ui.Components.kb1.r(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView22 = new TextView(parentActivity2);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 0));
                            nd0Var.setMinValue(0);
                            nd0Var.setMaxValue(10);
                            nd0Var.setWrapSelectorWheel(false);
                            nd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(frameLayout, 1);
                            nd0Var.setOnValueChangedListener(zi0Var);
                            nd0Var2.setMinValue(0);
                            nd0Var2.setMaxValue(10);
                            nd0Var2.setWrapSelectorWheel(false);
                            nd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(nd0Var2, org.telegram.ui.Components.kb1.p(0.5f, 0, 270));
                            nd0Var2.setFormatter(new org.telegram.ui.Components.zi0(frameLayout, 2));
                            nd0Var2.setOnValueChangedListener(zi0Var);
                            nd0Var.setValue(0);
                            nd0Var2.setValue(6);
                            bj0Var.addView(frameLayout4, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                            frameLayout4.addView((View) textView3, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ga(23, frameLayout, k1Var));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.q5, null);
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, org.telegram.ui.Components.kb1.g(48.0f, -1));
                            frameLayout2.addView(bj0Var, org.telegram.ui.Components.kb1.i(-1, -2, 51));
                            rc0Var.R = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                            org.telegram.ui.Components.ej0 ej0Var = rc0Var.R;
                            ej0Var.f27864r = false;
                            AnimatorSet animatorSet = ej0Var.f27865s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ej0Var.f27865s = null;
                            }
                            org.telegram.ui.Components.aj0 aj0Var = ej0Var.v;
                            aj0Var.measure(View.MeasureSpec.makeMeasureSpec((ej0Var.f27867x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ej0Var.f27864r) {
                                z15 = true;
                            } else {
                                aj0Var.setVisibility(0);
                                if (ej0Var.f27866w) {
                                    ej0Var.setLayerType(2, null);
                                }
                                aj0Var.setTranslationY(aj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ej0Var.f27865s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                                ej0Var.f27865s.setDuration(400L);
                                ej0Var.f27865s.setStartDelay(20L);
                                ej0Var.f27865s.setInterpolator(ej0Var.F);
                                z15 = true;
                                ej0Var.f27865s.addListener(new org.telegram.ui.Components.dj0(ej0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ej0Var.f27865s.start();
                            }
                            ej0Var.c(z15);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.A0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        if (DialogObject.isChatDialog(this.f42928e0)) {
            chat = getMessagesController().getChat(Long.valueOf(-this.f42928e0));
        } else {
            chat = null;
        }
        MessageObject messageObject3 = this.A0;
        if (messageObject3 != null && messageObject3.isLiveLocation() && !this.A0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42928e0);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.f42925c.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.f42928e0) && this.A0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f42925c.setVisibility(4);
                    this.f42925c.setAlpha(0.0f);
                    this.f42925c.setScaleX(0.4f);
                    this.f42925c.setScaleY(0.4f);
                }
                this.f42925c.setImageResource(R.drawable.msg_location_alert);
            }
        } else {
            this.f42925c.setVisibility(8);
            this.f42925c.setImageResource(R.drawable.msg_location_alert);
        }
        fi.v3 v3Var = new fi.v3(context, 1);
        this.f42953y = v3Var;
        v3Var.setLayerType(2, null);
        fi.v3 v3Var2 = this.f42953y;
        v3Var2.d = 4000L;
        v3Var2.l(1.0f, -25.0f);
        this.f42953y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.S.addView(this.f42953y, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42929f = linearLayout;
        linearLayout.setOrientation(1);
        this.f42929f.setGravity(1);
        this.f42929f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f42929f.setVisibility(8);
        pc0Var.addView(this.f42929f, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f42929f.setOnTouchListener(new ei.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.f7.t(this.h, org.telegram.ui.ActionBar.y6.W5, getResourceProvider(), mode);
        this.f42929f.addView(this.h, org.telegram.ui.Components.kb1.r(-2, -2));
        TextView textView2 = new TextView(context);
        this.f42937n = textView2;
        int i21 = org.telegram.ui.ActionBar.y6.X5;
        org.telegram.ui.ActionBar.f7.V(textView2, i21, getResourceProvider());
        this.f42937n.setGravity(17);
        this.f42937n.setTypeface(AndroidUtilities.bold());
        this.f42937n.setTextSize(1, 17.0f);
        this.f42937n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView e = org.telegram.messenger.wh.e(this.f42929f, this.f42937n, org.telegram.ui.Components.kb1.x(-2, -2, 17, 0, 11, 0, 0), context);
        this.f42942r = e;
        org.telegram.ui.ActionBar.f7.V(e, i21, getResourceProvider());
        this.f42942r.setGravity(17);
        this.f42942r.setTextSize(1, 15.0f);
        this.f42942r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f42929f.addView(this.f42942r, org.telegram.ui.Components.kb1.x(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.U = nm0Var;
        long j10 = this.f42928e0;
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        boolean z15 = this.E;
        if (i14 == 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        fc0 fc0Var2 = new fc0(this, context, this.F0, j10, resourceProvider, z15, z12);
        this.T = fc0Var2;
        nm0Var.setAdapter(fc0Var2);
        org.telegram.ui.Components.nm0 nm0Var2 = this.U;
        s4.c0 c0Var = new s4.c0(1, false);
        this.Y = c0Var;
        nm0Var2.setLayoutManager(c0Var);
        if (this.L0 != null) {
            this.K0 = new org.telegram.ui.Cells.z3(context, this.resourceProvider);
            hc0 hc0Var = new hc0(this, context, new org.telegram.ui.Components.tv0(this), this, new gc0(this), getResourceProvider());
            this.J0 = hc0Var;
            org.telegram.ui.ActionBar.f7.i(i12, hc0Var, getResourceProvider());
            this.J0.addView(this.K0, org.telegram.ui.Components.kb1.i(-1, 32, 55));
            this.T.f14237h0 = this.J0;
            this.U.setOverScrollMode(2);
            s4.l lVar = new s4.l();
            z13 = false;
            lVar.f47798m = false;
            lVar.C = false;
            lVar.o(org.telegram.ui.Components.ds.h);
            lVar.n(350L);
            this.U.setItemAnimator(lVar);
        } else {
            z13 = false;
        }
        this.T.O(this.f42926c0, z13);
        this.T.getClass();
        this.U.setVerticalScrollBarEnabled(z13);
        pc0Var.addView(this.U, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        MessageObject messageObject4 = this.A0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            fc0 fc0Var3 = this.T;
            fc0Var3.Q = this.A0.messageOwner.media.address;
            fc0Var3.Q();
        }
        this.U.setOnScrollListener(new ic0(this));
        ((s4.l) this.U.getItemAnimator()).C = false;
        this.U.setOnItemLongClickListener(new org.telegram.ui.Components.voip.k1(23, this, context));
        this.U.setOnItemClickListener(new h(this, 17));
        fc0 fc0Var4 = this.T;
        long j11 = this.f42928e0;
        yb0 yb0Var = new yb0(this, 5);
        fc0Var4.H = j11;
        fc0Var4.f14014y = yb0Var;
        fc0Var4.P(this.G0);
        pc0Var.addView(this.S, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.K = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.K.setOnDispatchTouchEventInterceptor(new yb0(this, 6));
        this.K.setOnInterceptTouchEventInterceptor(new yb0(this, 7));
        this.K.setOnLayoutListener(new zb0(this, 5));
        new Thread(new ac0(this, this.K, 1)).start();
        MessageObject messageObject5 = this.A0;
        if (messageObject5 == null && this.f42954y0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f42928e0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.S.addView(frameLayout, org.telegram.ui.Components.kb1.i(62, 76, 49));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                y9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                y9Var.f(chat, new org.telegram.ui.Components.j9(chat));
                frameLayout.addView(y9Var, org.telegram.ui.Components.kb1.h(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.X = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.X == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.S.addView(imageView4, org.telegram.ui.Components.kb1.i(28, 48, 49));
                this.X = imageView4;
            }
            org.telegram.ui.Components.nm0 nm0Var3 = new org.telegram.ui.Components.nm0(context, null);
            this.V = nm0Var3;
            nm0Var3.setVisibility(8);
            i11 = 0;
            this.V.setLayoutManager(new s4.c0(1, false));
            org.telegram.ui.ActionBar.u6 resourceProvider2 = getResourceProvider();
            if (i10 == 8) {
                z14 = true;
            } else {
                z14 = false;
            }
            kc0 kc0Var2 = new kc0(this, context, resourceProvider2, z14);
            this.W = kc0Var2;
            yb0 yb0Var2 = new yb0(this, 8);
            kc0Var2.H = 0L;
            kc0Var2.f14014y = yb0Var2;
            pc0Var.addView(this.V, org.telegram.ui.Components.kb1.i(-1, -1, 51));
            this.V.setOnScrollListener(new i3(this, 19));
            this.V.setOnItemClickListener(new di.x4(18, this, l4));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f42954y0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f42954y0;
                if (tL_channelLocation2 != null) {
                    this.T.X = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.A0;
                    if (messageObject6 != null) {
                        fc0 fc0Var5 = this.T;
                        fc0Var5.W = messageObject6;
                        fc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.A0;
        if (messageObject7 != null && i10 == 6) {
            fc0 fc0Var6 = this.T;
            fc0Var6.W = messageObject7;
            fc0Var6.l();
        }
        for (int i22 = i11; i22 < 2; i22++) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.F;
            undoViewArr[i22] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i22].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.S.addView(undoViewArr[i22], org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        di.h3 h3Var = new di.h3(this, context, rect);
        this.v = h3Var;
        h3Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.S.addView(this.v, layoutParams2);
        if (this.A0 == null && this.f42954y0 == null && this.f42955z0 != null) {
            this.B0 = true;
            ImageView imageView5 = this.f42921a;
            int i23 = org.telegram.ui.ActionBar.y6.f23686ui;
            org.telegram.ui.ActionBar.f7.t(imageView5, i23, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f42921a.setTag(Integer.valueOf(i23));
        }
        pc0Var.addView(this.actionBar);
        C0();
        return this.fragmentView;
    }

    public final void d0() {
        int i10;
        int themedColor;
        org.telegram.ui.ActionBar.w0 w0Var = this.d;
        if (w0Var != null) {
            w0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23686ui));
            this.d.H(getThemedColor(org.telegram.ui.ActionBar.y6.G8));
            this.d.O(getThemedColor(org.telegram.ui.ActionBar.y6.F8), true);
            this.d.O(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false);
        }
        if (this.f42944s != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5)) != this.Q0) {
            this.Q0 = themedColor;
            this.f42944s.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        di.h3 h3Var = this.v;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        if (this.I != null) {
            if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6)) < 0.721f) {
                i10 = R.raw.mapstyle_night;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                if (!this.f42922a0) {
                    this.f42922a0 = true;
                    this.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                    IMapsProvider.ICircle iCircle = this.O;
                    if (iCircle != null) {
                        iCircle.setStrokeColor(-1);
                        this.O.setFillColor(553648127);
                    }
                }
            } else if (this.f42922a0) {
                this.f42922a0 = false;
                this.I.setMapStyle(null);
                IMapsProvider.ICircle iCircle2 = this.O;
                if (iCircle2 != null) {
                    iCircle2.setStrokeColor(-16777216);
                    this.O.setFillColor(536870912);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        fc0 fc0Var;
        long dialogId;
        fc0 fc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.f42926c0 = false;
            fc0 fc0Var3 = this.T;
            if (fc0Var3 != null) {
                fc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.f42926c0 = true;
            fc0 fc0Var4 = this.T;
            if (fc0Var4 != null) {
                fc0Var4.O(true, false);
            }
        } else if (i10 == NotificationCenter.liveLocationsChanged) {
            fc0 fc0Var5 = this.T;
            if (fc0Var5 != null) {
                fc0Var5.l();
            }
            D0();
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f42928e0 && this.A0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    if (messageObject.isLiveLocation()) {
                        c0(messageObject.messageOwner);
                        z10 = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.f42925c.setImageResource(R.drawable.msg_location_alert);
                        IMapsProvider.ICircle iCircle = this.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            this.O = null;
                        }
                    }
                }
                if (z10 && (fc0Var2 = this.T) != null) {
                    fc0Var2.N(this.f42931g0);
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f42928e0 && this.A0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                    if (messageObject2.isLiveLocation()) {
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.from_id != null) {
                            dialogId = MessageObject.getFromChatId(message);
                        } else {
                            dialogId = MessageObject.getDialogId(message);
                        }
                        lc0 lc0Var = (lc0) this.f42932h0.f(dialogId);
                        if (lc0Var != null) {
                            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                            if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                                TLRPC.Message message2 = messageObject2.messageOwner;
                                lc0Var.f41075b = message2;
                                TLRPC.GeoPoint geoPoint = message2.media.geo;
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                                lc0Var.e.setPosition(latLng);
                                if (this.f42933i0 == lc0Var.f41074a) {
                                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var.e.getPosition()));
                                }
                                IMapsProvider.IMarker iMarker = lc0Var.f41077f;
                                if (iMarker != null) {
                                    iMarker.getPosition();
                                    lc0Var.f41077f.setPosition(latLng);
                                    int i14 = messageObject2.messageOwner.media.heading;
                                    if (i14 != 0) {
                                        lc0Var.f41077f.setRotation(i14);
                                        if (!lc0Var.f41078g) {
                                            lc0Var.f41077f.setIcon(R.drawable.map_pin_cone2);
                                            lc0Var.f41078g = true;
                                        }
                                    } else if (lc0Var.f41078g) {
                                        lc0Var.f41077f.setRotation(0);
                                        lc0Var.f41077f.setIcon(R.drawable.map_pin_circle);
                                        lc0Var.f41078g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (fc0Var = this.T) != null) {
                    fc0Var.l();
                    org.telegram.ui.Components.ej0 ej0Var = this.R;
                    if (ej0Var != null) {
                        ej0Var.c(true);
                    }
                }
                if (z11) {
                    D0();
                }
            }
        }
    }

    public final boolean e0() {
        if (i0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i10 = R.raw.permission_request_location;
                    int i11 = org.telegram.ui.ActionBar.y6.L5;
                    alertDialog$Builder.m(i10, 72, getThemedColor(i11), null);
                    alertDialog$Builder.n(i11, getResourceProvider());
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new yb0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f22369a);
                    return false;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return true;
            }
        }
        return true;
    }

    public final void f0(int i10) {
        if (this.I == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.f42948v0.getLatitude(), this.f42948v0.getLongitude()));
        onCreateCircleOptions.radius(i10);
        if (o0()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.O = this.I.addCircle(onCreateCircleOptions);
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        if (r0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    public final Bitmap g0(int i10) {
        Bitmap[] bitmapArr = this.P0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.y4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(11, this);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.F;
            if (i10 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(undoViewArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fi));
            i10++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23428h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.f42949w;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23465j5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ii));
        ImageView imageView = this.f42921a;
        int i11 = org.telegram.ui.ActionBar.y6.f23724wi;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        ImageView imageView2 = this.f42921a;
        int i12 = org.telegram.ui.ActionBar.y6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23686ui));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42925c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42925c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23647si));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23666ti));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 393216, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23553ni));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 393216, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23608qi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 393248, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23533mi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 393248, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23591pi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 196608, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 8, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.U, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.X5));
        return arrayList;
    }

    public final Bitmap h0(lc0 lc0Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                TLRPC.User user = lc0Var.f41076c;
                if (user != null) {
                    j9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = lc0Var.d;
                    if (chat != null) {
                        j9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                j9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                j9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = lc0Var.h;
                if (imageReceiver != null && imageReceiver.hasImageLoaded()) {
                    bitmap = lc0Var.h.getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float dp = AndroidUtilities.dp(50.0f) / bitmap.getWidth();
                    matrix.postTranslate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                    matrix.postScale(dp, dp);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap2 = createBitmap;
                FileLog.e(th);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean i0() {
        return this instanceof en;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilder;
        if (this.f42930f0) {
            iLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
        } else {
            iLatLngBoundsBuilder = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (iLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    iLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                c0(message);
                if (this.f42925c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f42925c.setVisibility(0);
                    this.H = true;
                    this.f42925c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new k50(this, 2)).start();
                }
            }
        }
        if (iLatLngBoundsBuilder != null) {
            if (this.f42930f0) {
                this.U.w0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f42930f0 = false;
            this.T.N(this.f42931g0);
            if (this.A0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = iLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng q02 = q0(center, 100.0d, 100.0d);
                    iLatLngBoundsBuilder.include(q0(center, -100.0d, -100.0d));
                    iLatLngBoundsBuilder.include(q02);
                    IMapsProvider.ILatLngBounds build = iLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.J = newCameraUpdateLatLngBounds;
                            this.I.moveCamera(newCameraUpdateLatLngBounds);
                            this.J = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean k0() {
        int i10;
        boolean z10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.I != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i10 = getConnectionsManager().getCurrentTime();
            } else {
                i10 = 0;
            }
            ArrayList arrayList2 = this.f42931g0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                lc0 lc0Var = (lc0) arrayList2.get(i12);
                IMapsProvider.IMarker iMarker = lc0Var.e;
                if (iMarker != null && (message = lc0Var.f41075b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            if (this.f42932h0.f(getUserConfig().getClientUserId()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f42948v0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f42948v0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i13 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    double d12 = -1.7976931348623157E308d;
                    while (i13 < size2) {
                        IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i13);
                        onCreateLatLngBoundsBuilder.include(latLng);
                        int i14 = size2;
                        double d13 = latLng.latitude;
                        if (d13 < d10) {
                            d10 = d13;
                        }
                        if (d13 > d) {
                            d = d13;
                        }
                        double d14 = latLng.longitude;
                        if (d14 < d11) {
                            d11 = d14;
                        }
                        if (d14 > d12) {
                            d12 = d14;
                        }
                        i13++;
                        size2 = i14;
                    }
                    IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d10 + d) / 2.0d, (d11 + d12) / 2.0d);
                    double radians = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
                    if (Math.toRadians(d - d10) * 6366198.0d < 30.0d || radians < 30.0d) {
                        onCreateLatLngBoundsBuilder.include(q0(latLng2, 15.0d, 15.0d));
                        onCreateLatLngBoundsBuilder.include(q0(latLng2, -15.0d, -15.0d));
                    }
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }
        }
        return false;
    }

    public final void l0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        if (this.U != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i12 = this.F0;
                if (i12 == 6) {
                    this.G0 = org.telegram.messenger.t.C(66.0f, measuredHeight, currentActionBarHeight);
                } else if (i12 == 2) {
                    this.G0 = org.telegram.messenger.t.C(73.0f, measuredHeight, currentActionBarHeight);
                } else {
                    this.G0 = org.telegram.messenger.t.C(66.0f, measuredHeight, currentActionBarHeight);
                }
                hc0 hc0Var = this.J0;
                if (hc0Var != null && hc0Var.j0(8) > 0) {
                    this.G0 -= AndroidUtilities.dp(200.0f);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.U.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.G0;
                this.S.setLayoutParams(layoutParams3);
                org.telegram.ui.Components.nm0 nm0Var = this.V;
                if (nm0Var != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) nm0Var.getLayoutParams();
                    layoutParams4.topMargin = currentActionBarHeight;
                    this.V.setLayoutParams(layoutParams4);
                }
                this.T.P(this.G0);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = AndroidUtilities.dp(10.0f) + this.G0;
                    IMapsProvider.IMap iMap = this.I;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.K.getView().setLayoutParams(layoutParams5);
                }
                oc0 oc0Var = this.f42951x;
                if (oc0Var != null && (layoutParams = (FrameLayout.LayoutParams) oc0Var.getLayoutParams()) != null) {
                    layoutParams.height = AndroidUtilities.dp(10.0f) + this.G0;
                    this.f42951x.setLayoutParams(layoutParams);
                }
                this.T.l();
                if (z10) {
                    if (i12 == 3) {
                        i11 = 73;
                    } else if (i12 != 1 && i12 != 2) {
                        i11 = 0;
                    } else {
                        i11 = 66;
                    }
                    this.Y.h1(0, -AndroidUtilities.dp(i11));
                    B0(false);
                    this.U.post(new org.telegram.ui.Components.h2(this, i11, 19));
                    return;
                }
                B0(false);
            }
        }
    }

    public final boolean m0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.A0.getDialogId());
        if (arrayList != null && arrayList.isEmpty()) {
            j0(arrayList);
        } else {
            arrayList = null;
        }
        if (DialogObject.isChatDialog(this.f42928e0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f42928e0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.A0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new di.j6(this, dialogId, 6));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView n0() {
        UndoView[] undoViewArr = this.F;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.S.removeView(undoViewArr[0]);
            this.S.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean o0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.y6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ej0 ej0Var = this.R;
        if (ej0Var != null) {
            if (z10) {
                ej0Var.a();
                return false;
            }
        } else {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
                if (z10) {
                    r0();
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addWeakObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.A0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            getNotificationCenter().addWeakObserver(this, NotificationCenter.didReceiveNewMessages);
            getNotificationCenter().addWeakObserver(this, NotificationCenter.replaceMessagesObjects);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        fc0 fc0Var = this.T;
        if (fc0Var != null) {
            fc0Var.F();
        }
        kc0 kc0Var = this.W;
        if (kc0Var != null) {
            kc0Var.F();
        }
        zb0 zb0Var = this.I0;
        if (zb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zb0Var);
            this.I0 = null;
        }
        ArrayList arrayList = this.f42931g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            lc0 lc0Var = (lc0) arrayList.get(i10);
            ImageReceiver imageReceiver = lc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                lc0Var.h = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f42946t0) {
            iMapView.onLowMemory();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f42946t0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f42947u0 = false;
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f42946t0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f42947u0 = true;
        IMapsProvider.IMap iMap = this.I;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l0(true);
        if (i0()) {
            this.f42940p0 = false;
        } else if (this.f42940p0 && (parentActivity = getParentActivity()) != null) {
            this.f42940p0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        zb0 zb0Var = this.I0;
        if (zb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zb0Var);
            AndroidUtilities.runOnUIThread(this.I0, 5000L);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.ActionBar.w0 w0Var = this.f42949w;
            if (w0Var != null && w0Var.getSearchField() != null) {
                this.f42949w.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23465j5));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            try {
                if (this.K.getView().getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.K.getView().getParent()).removeView(this.K.getView());
                }
            } catch (Exception unused) {
            }
            k0 k0Var = this.S;
            if (k0Var != null) {
                k0Var.addView(this.K.getView(), 0, org.telegram.ui.Components.kb1.i(-1, AndroidUtilities.dp(10.0f) + this.G0, 51));
                oc0 oc0Var = this.f42951x;
                if (oc0Var != null) {
                    try {
                        if (oc0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f42951x.getParent()).removeView(this.f42951x);
                        }
                    } catch (Exception unused2) {
                    }
                    this.S.addView(this.f42951x, 1, org.telegram.ui.Components.kb1.i(-1, AndroidUtilities.dp(10.0f) + this.G0, 51));
                }
                B0(false);
                p0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.K.getView(), 0, org.telegram.ui.Components.kb1.i(-1, -1, 51));
            }
        }
    }

    public final void p0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f42925c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.H && (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
            if (DialogObject.isUserDialog(this.f42928e0)) {
                this.f42953y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f42928e0)))));
            } else {
                this.f42953y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
            }
            this.f42953y.u();
        }
    }

    public final boolean r0() {
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
            GLSurfaceView glSurfaceView = this.K.getGlSurfaceView();
            glSurfaceView.queueEvent(new kb0(1, this, glSurfaceView));
            return true;
        }
        return false;
    }

    public final void s0(lc0 lc0Var) {
        double d;
        double d10;
        String str;
        TLRPC.Message message;
        if (lc0Var != null && (message = lc0Var.f41075b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d10 = geoPoint._long;
        } else {
            MessageObject messageObject = this.A0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.f42954y0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.f42948v0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f42948v0.getLatitude()), Double.valueOf(this.f42948v0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void t0(final boolean z10) {
        final TLRPC.User user;
        if (this.E0 != null && !i0() && getParentActivity() != null && this.f42948v0 != null && e0()) {
            if (DialogObject.isUserDialog(this.f42928e0)) {
                user = getMessagesController().getUser(Long.valueOf(this.f42928e0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.g5.D(getParentActivity(), z10, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    rc0.V(rc0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void u0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f42948v0 = new Location(location);
        lc0 lc0Var = (lc0) this.f42932h0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42928e0);
        if (lc0Var != null && sharingLocationInfo != null && lc0Var.f41075b.f22049id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            lc0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = lc0Var.f41077f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f42933i0 == lc0Var.f41074a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var.e.getPosition()));
            }
        }
        if (this.A0 == null && this.f42954y0 == null && this.I != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            fc0 fc0Var = this.T;
            if (fc0Var != null) {
                if (!this.C0 && (i10 = this.F0) != 4 && i10 != 8) {
                    fc0Var.H(null, this.f42948v0, true);
                }
                this.T.M(this.f42948v0);
            }
            if (!this.B0) {
                this.f42950w0 = new Location(location);
                if (this.D0) {
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.D0 = true;
                    this.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.I.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.T.M(this.f42948v0);
        }
        org.telegram.ui.Components.ej0 ej0Var = this.R;
        if (ej0Var != null) {
            ej0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.O;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f42948v0.getLatitude(), this.f42948v0.getLongitude()));
        }
        D0();
    }

    public final void v0(MessageObject messageObject) {
        this.A0 = messageObject;
        this.f42928e0 = messageObject.getDialogId();
    }

    public final void w0(lc0 lc0Var) {
        if (lc0Var.h == null) {
            TLRPC.User user = lc0Var.f41076c;
            TLRPC.Chat chat = lc0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            if (user != null) {
                j9Var.m(this.currentAccount, user);
            } else {
                j9Var.k(this.currentAccount, chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setCurrentAccount(this.currentAccount);
            imageReceiver.setDelegate(new org.telegram.ui.Components.voip.k1(24, this, lc0Var));
            imageReceiver.onAttachedToWindow();
            if (user == null) {
                user = chat;
            }
            imageReceiver.setForUserOrChat(user, j9Var);
            lc0Var.h = imageReceiver;
        }
    }

    public final void x0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f42948v0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f42948v0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f42948v0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.E0.d(tL_messageMediaGeoLive, this.F0, true, 0, 0L);
        if (i11 > 0) {
            this.R.L = true;
            this.f42925c.setImageResource(R.drawable.msg_location_alert2);
            org.telegram.ui.Components.ej0 ej0Var = this.R;
            if (ej0Var != null) {
                ej0Var.a();
            }
            n0().k(0L, 24, Integer.valueOf(i11), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void y0() {
        if (this.T.h() != 0 && this.Y.L0() == 0) {
            View childAt = this.U.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                this.U.w0(0, top, null);
            }
        }
    }

    public final void z0(boolean z10) {
        Integer num;
        float f7;
        org.telegram.ui.Components.ql qlVar;
        Location location;
        Location location2;
        if (this.F0 == 3) {
            z10 = true;
        }
        if (z10 && (qlVar = this.e) != null && qlVar.getTag() == null && ((location = this.f42948v0) == null || (location2 = this.f42950w0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.ql qlVar2 = this.e;
        if (qlVar2 != null) {
            if (!z10 || qlVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    org.telegram.ui.Components.ql qlVar3 = this.e;
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    qlVar3.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    org.telegram.ui.Components.ql qlVar4 = this.e;
                    Property property = View.TRANSLATION_X;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(qlVar4, property, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.ds.f27531g);
                    animatorSet.start();
                }
            }
        }
    }
}
