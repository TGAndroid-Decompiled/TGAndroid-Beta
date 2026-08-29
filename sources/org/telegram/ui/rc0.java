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
import android.os.Build;
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
public class rc0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean A0;
    public final UndoView[] B;
    public mc0 B0;
    public boolean C;
    public final int C0;
    public boolean D;
    public int D0;
    public IMapsProvider.IMap E;
    public jc0 E0;
    public IMapsProvider.ICameraUpdate F;
    public zb0 F0;
    public IMapsProvider.IMapView G;
    public hc0 G0;
    public IMapsProvider.ICameraUpdate H;
    public org.telegram.ui.Cells.s3 H0;
    public boolean I;
    public TL_stories.MediaArea I0;
    public float J;
    public boolean J0;
    public IMapsProvider.ICircle K;
    public boolean K0;
    public double L;
    public Boolean L0;
    public boolean M;
    public final Bitmap[] M0;
    public org.telegram.ui.Components.ai0 N;
    public n0 O;
    public fc0 P;
    public org.telegram.ui.Components.jl0 Q;
    public org.telegram.ui.Components.jl0 R;
    public kc0 S;
    public View T;
    public f2.j0 U;
    public org.telegram.ui.ActionBar.w0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public ImageView f42032a;
    public long f42033a0;
    public TextView f42034b;
    public boolean f42035b0;
    public ImageView f42036c;
    public final ArrayList f42037c0;
    public org.telegram.ui.ActionBar.w0 d;
    public final a0.h f42038d0;
    public org.telegram.ui.Components.zk f42039e;
    public long f42040e0;
    public LinearLayout f42041f;
    public boolean f42042f0;
    public final ArrayList f42043g0;
    public ImageView h;
    public AnimatorSet f42044h0;
    public IMapsProvider.IMarker f42045i0;
    public qc0 f42046j0;
    public FrameLayout f42047k0;
    public boolean f42048l0;
    public boolean m0;
    public TextView f42049n;
    public boolean f42050n0;
    public boolean f42051o0;
    public boolean f42052p0;
    public boolean f42053q0;
    public TextView f42054r;
    public boolean f42055r0;
    public Drawable f42056s;
    public Location f42057s0;
    public Location f42058t0;
    public int f42059u0;
    public lh.z2 v;
    public TLRPC.TL_channelLocation f42060v0;
    public org.telegram.ui.ActionBar.w0 f42061w;
    public TLRPC.TL_channelLocation f42062w0;
    public oc0 f42063x;
    public MessageObject f42064x0;
    public nh.t3 f42065y;
    public boolean f42066y0;
    public boolean f42067z0;

    public rc0(int i10) {
        super(null);
        this.B = new UndoView[2];
        this.X = true;
        this.Y = false;
        this.Z = true;
        this.f42035b0 = true;
        this.f42037c0 = new ArrayList();
        this.f42038d0 = new a0.h();
        this.f42040e0 = -1L;
        this.f42043g0 = new ArrayList();
        this.f42048l0 = true;
        this.m0 = true;
        this.D0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.K0 = true;
        this.M0 = new Bitmap[7];
        this.C0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(rc0 rc0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = rc0Var.C0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = rc0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (rc0Var.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
                alertDialog$Builder.m(R.raw.permission_request_location, 72, rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new xb0(rc0Var, 1));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                rc0Var.showDialog(alertDialog$Builder.f22714a);
            }
        } else if (rc0Var.d0() || i10 == 3) {
            if ((rc0Var.f42064x0 != null && i10 != 3) || rc0Var.f42060v0 != null) {
                if (rc0Var.f42057s0 != null && (iMap = rc0Var.E) != null) {
                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.f42057s0.getLatitude(), rc0Var.f42057s0.getLongitude()), rc0Var.E.getMaxZoomLevel() - 4.0f));
                }
            } else if (rc0Var.f42057s0 != null && rc0Var.E != null) {
                ImageView imageView = rc0Var.f42032a;
                int i11 = org.telegram.ui.ActionBar.g6.vi;
                imageView.setColorFilter(new PorterDuffColorFilter(rc0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                rc0Var.f42032a.setTag(Integer.valueOf(i11));
                rc0Var.P.L(null);
                rc0Var.f42066y0 = false;
                rc0Var.y0(false);
                rc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.f42057s0.getLatitude(), rc0Var.f42057s0.getLongitude())));
                if (rc0Var.f42067z0 && i10 != 8) {
                    Location location = rc0Var.f42057s0;
                    if (location != null) {
                        rc0Var.P.H(null, location, true);
                    }
                    rc0Var.f42067z0 = false;
                    rc0Var.x0();
                }
            }
            if (rc0Var.f42045i0 != null) {
                rc0Var.T.setVisibility(0);
                oc0 oc0Var = rc0Var.f42063x;
                IMapsProvider.IMarker iMarker = rc0Var.f42045i0;
                HashMap hashMap = oc0Var.f41089a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    oc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                rc0Var.f42045i0 = null;
                rc0Var.f42046j0 = null;
                rc0Var.f42047k0 = null;
            }
        }
    }

    public static void V(rc0 rc0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = rc0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.f22475id = sharingLocationInfo.mid;
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
        rc0Var.w0(i10, user, 0);
    }

    public static void W(rc0 rc0Var) {
        zb0 zb0Var;
        rc0Var.getLocationController().markLiveLoactionsAsRead(rc0Var.f42033a0);
        if (!rc0Var.isPaused && (zb0Var = rc0Var.F0) != null) {
            AndroidUtilities.runOnUIThread(zb0Var, 5000L);
        }
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z10) {
        int i10;
        int i11;
        int i12;
        FrameLayout.LayoutParams layoutParams;
        float f9;
        f2.n1 K = this.Q.K(0);
        if (K != null) {
            i10 = (int) K.f6432a.getY();
            i11 = Math.min(i10, 0) + this.D0;
        } else {
            i10 = -this.O.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.O.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.G.getView().getVisibility() == 0) {
                    this.G.getView().setVisibility(4);
                    this.O.setVisibility(4);
                    oc0 oc0Var = this.f42063x;
                    if (oc0Var != null) {
                        oc0Var.setVisibility(4);
                    }
                }
            } else if (this.G.getView().getVisibility() == 4) {
                this.G.getView().setVisibility(0);
                this.O.setVisibility(0);
                oc0 oc0Var2 = this.f42063x;
                if (oc0Var2 != null) {
                    oc0Var2.setVisibility(0);
                }
            }
            this.O.setTranslationY(Math.min(0, i10));
            int i13 = -i10;
            int i14 = i13 / 2;
            this.G.getView().setTranslationY(Math.max(0, i14));
            oc0 oc0Var3 = this.f42063x;
            if (oc0Var3 != null) {
                oc0Var3.setTranslationY(Math.max(0, i14));
            }
            int measuredHeight = this.D0 - this.d.getMeasuredHeight();
            int i15 = this.C0;
            if (i15 != 0 && i15 != 1) {
                i12 = 10;
            } else {
                i12 = 30;
            }
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + i12), i13);
            this.d.setTranslationY(min);
            this.f42036c.setTranslationY(min);
            nh.t3 t3Var = this.f42065y;
            if (t3Var != null) {
                t3Var.setTranslationY(min);
            }
            org.telegram.ui.Components.zk zkVar = this.f42039e;
            if (zkVar != null) {
                zkVar.f35362c = min;
                zkVar.setTranslationY(min + zkVar.f35361b);
            }
            View view = this.T;
            if (view != null) {
                if (view.getTag() == null) {
                    f9 = 48.0f;
                } else {
                    f9 = 69.0f;
                }
                int dp = (i11 / 2) + (i13 - AndroidUtilities.dp(f9));
                this.f42059u0 = dp;
                view.setTranslationY(dp);
            }
            if (!z10) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.D0) {
                        layoutParams2.height = AndroidUtilities.dp(10.0f) + this.D0;
                        IMapsProvider.IMap iMap = this.E;
                        if (iMap != null) {
                            iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                        }
                        this.G.getView().setLayoutParams(layoutParams2);
                    }
                }
                oc0 oc0Var4 = this.f42063x;
                if (oc0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) oc0Var4.getLayoutParams()) != null) {
                    if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.D0) {
                        layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                        this.f42063x.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void B0() {
        if (this.f42050n0) {
            if (this.f42052p0) {
                this.R.setEmptyView(null);
                this.f42041f.setVisibility(8);
                this.R.setVisibility(8);
                return;
            }
            this.R.setEmptyView(this.f42041f);
            return;
        }
        this.f42041f.setVisibility(8);
    }

    public final void C0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f42034b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f42042f0) {
            z0(false, true);
            j0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f42037c0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((lc0) arrayList.get(i13)).f40165b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f42038d0.f(getUserConfig().getClientUserId()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42057s0 != null && !z10) {
            i12++;
        }
        if (i12 >= 2) {
            z11 = true;
        }
        z0(z11, true);
    }

    public final lc0 c0(TLRPC.Message message) {
        lc0 lc0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.f42038d0;
        lc0 lc0Var2 = (lc0) hVar.f(fromChatId);
        if (lc0Var2 == null) {
            ?? obj = new Object();
            obj.f40165b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f40166c = getMessagesController().getUser(Long.valueOf(obj.f40165b.from_id.user_id));
                obj.f40164a = obj.f40165b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    obj.f40166c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    obj.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                obj.f40164a = dialogId;
            }
            v0(obj);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(obj);
                lc0Var = obj;
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    obj.f40167e = this.E.addMarker(position);
                    if (!UserObject.isUserSelf(obj.f40166c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.E.addMarker(flat);
                        obj.f40168f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            obj.f40168f.setIcon(R.drawable.map_pin_cone2);
                            obj.f40169g = true;
                        } else {
                            addMarker.setRotation(0);
                            obj.f40168f.setIcon(R.drawable.map_pin_circle);
                            obj.f40169g = false;
                        }
                    }
                    this.f42037c0.add(obj);
                    hVar.k(obj, obj.f40164a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42033a0);
                    int i11 = (obj.f40164a > getUserConfig().getClientUserId() ? 1 : (obj.f40164a == getUserConfig().getClientUserId() ? 0 : -1));
                    lc0Var = obj;
                    lc0Var = obj;
                    if (i11 == 0 && sharingLocationInfo != null) {
                        int i12 = obj.f40165b.f22413id;
                        lc0Var = obj;
                        if (i12 == sharingLocationInfo.mid) {
                            Location location = this.f42057s0;
                            lc0Var = obj;
                            if (location != null) {
                                obj.f40167e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f42057s0.getLongitude()));
                                lc0Var = obj;
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                lc0Var = obj;
            }
        } else {
            lc0Var2.f40165b = message;
            lc0Var2.f40167e.setPosition(latLng);
            int i13 = (this.f42040e0 > lc0Var2.f40164a ? 1 : (this.f42040e0 == lc0Var2.f40164a ? 0 : -1));
            lc0Var = lc0Var2;
            if (i13 == 0) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var2.f40167e.getPosition()));
                lc0Var = lc0Var2;
            }
        }
        org.telegram.ui.Components.ai0 ai0Var = this.N;
        if (ai0Var != null) {
            ai0Var.c(true);
        }
        C0();
        return lc0Var;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        TLRPC.Chat chat;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.f42051o0 = false;
        this.f42050n0 = false;
        this.f42052p0 = false;
        fc0 fc0Var = this.P;
        if (fc0Var != null) {
            fc0Var.F();
        }
        kc0 kc0Var = this.S;
        if (kc0Var != null) {
            kc0Var.F();
        }
        if (this.f42060v0 != null) {
            Location location = new Location("network");
            this.f42058t0 = location;
            location.setLatitude(this.f42060v0.geo_point.lat);
            this.f42058t0.setLongitude(this.f42060v0.geo_point._long);
        } else if (this.f42064x0 != null) {
            Location location2 = new Location("network");
            this.f42058t0 = location2;
            location2.setLatitude(this.f42064x0.messageOwner.media.geo.lat);
            this.f42058t0.setLongitude(this.f42064x0.messageOwner.media.geo._long);
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f23133h5;
        lVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.f23169j5;
        lVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.C(getThemedColor(i13), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ec0(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.f42060v0;
        int i14 = this.C0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.f42064x0;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                    org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.V = c3;
                    c3.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
                } else {
                    String str = this.f42064x0.messageOwner.media.title;
                    if (str != null && str.length() > 0) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                    }
                    if (i14 != 3) {
                        org.telegram.ui.ActionBar.w0 c6 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                        this.V = c6;
                        c6.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                        if (!getLocationController().isSharingLocation(this.f42033a0) && this.K0) {
                            this.V.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.V.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f42063x = new oc0(this, context);
                    org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c10.F();
                    c10.D = new bb(this, 11);
                    this.f42061w = c10;
                    c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f42061w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f42061w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
                }
            }
        }
        pc0 pc0Var = new pc0(this, context);
        this.fragmentView = pc0Var;
        pc0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f42056s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f42056s.getPadding(rect);
        if (i14 != 0 && i14 != 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        n0 n0Var = new n0(this, context, 11);
        this.O = n0Var;
        n0Var.setBackgroundDrawable(new cf.f(n0()));
        MessageObject messageObject2 = this.f42064x0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.zk zkVar = new org.telegram.ui.Components.zk(context, 1);
            this.f42039e = zkVar;
            zkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            i7.h6.a(this.f42039e);
            this.f42039e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.f42039e.setOutlineProvider(jf.q0.f11669b);
            this.f42039e.setBackgroundDrawable(i02);
            this.f42039e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.vi));
            this.f42039e.setTextSize(1, 14.0f);
            this.f42039e.setTypeface(AndroidUtilities.bold());
            this.f42039e.setGravity(17);
            this.f42039e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.O.addView(this.f42039e, i7.f6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.f42039e.setText(LocaleController.getString(R.string.OpenInMaps));
                this.f42039e.setOnClickListener(new View.OnClickListener(this) {
                    public final rc0 f43928b;

                    {
                        this.f43928b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        rc0 rc0Var = this.f43928b;
                        switch (i15) {
                            case 0:
                                rc0Var.y0(false);
                                rc0Var.P.H(null, rc0Var.f42058t0, true);
                                rc0Var.f42067z0 = true;
                                rc0Var.x0();
                                return;
                            case 1:
                                rc0Var.d.M(null, null);
                                return;
                            case 2:
                                rc0.U(rc0Var);
                                return;
                            case 3:
                                rc0Var.f42040e0 = -1L;
                                rc0Var.f42066y0 = true;
                                if (rc0Var.j0()) {
                                    rc0Var.f42042f0 = true;
                                    rc0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (rc0Var.getParentActivity() != null && rc0Var.f42057s0 != null && rc0Var.d0() && rc0Var.E != null) {
                                    nh.t3 t3Var = rc0Var.f42065y;
                                    if (t3Var != null) {
                                        t3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0);
                                    if (rc0Var.C) {
                                        rc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        rc0Var.f42036c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = rc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            rc0Var.K = null;
                                        }
                                        rc0Var.C = true;
                                        rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new x60(18, rc0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                    if (iCircle2 == null) {
                                        rc0Var.e0(500);
                                    } else {
                                        rc0Var.L = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(rc0Var.f42033a0)) {
                                        user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42033a0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = rc0Var.getParentActivity();
                                    xb0 xb0Var = new xb0(rc0Var, 3);
                                    xr xrVar = new xr(23, rc0Var, user);
                                    zb0 zb0Var = new zb0(rc0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f26774a = null;
                                    frameLayout.d = -1;
                                    frameLayout.f26777e = false;
                                    frameLayout.f26778f = false;
                                    frameLayout.h = null;
                                    frameLayout.f26779n = new Rect();
                                    new Paint();
                                    frameLayout.f26782w = true;
                                    frameLayout.B = org.telegram.ui.Components.jr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.M = zb0Var;
                                    frameLayout.f26784y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f26783x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, i7.f6.e(-1, -2, 80));
                                    frameLayout.K = LocaleController.getUseImperialSystemType();
                                    frameLayout.I = user;
                                    frameLayout.E = xb0Var;
                                    org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                    frameLayout.C = qc0Var;
                                    qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    qc0Var.setItemCount(5);
                                    org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                    frameLayout.D = qc0Var2;
                                    qc0Var2.setItemCount(5);
                                    qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(frameLayout, parentActivity);
                                    frameLayout.L = xh0Var;
                                    xh0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    xh0Var.addView(frameLayout3, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new mh.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.G = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.F = textView3;
                                    linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                    qc0Var.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 0));
                                    qc0Var.setMinValue(0);
                                    qc0Var.setMaxValue(10);
                                    qc0Var.setWrapSelectorWheel(false);
                                    qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(frameLayout, 1);
                                    qc0Var.setOnValueChangedListener(vh0Var);
                                    qc0Var2.setMinValue(0);
                                    qc0Var2.setMaxValue(10);
                                    qc0Var2.setWrapSelectorWheel(false);
                                    qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                    qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 2));
                                    qc0Var2.setOnValueChangedListener(vh0Var);
                                    qc0Var.setValue(0);
                                    qc0Var2.setValue(6);
                                    xh0Var.addView(frameLayout4, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                    frameLayout4.addView((View) textView3, i7.f6.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.t2(29, frameLayout, xrVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23294q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, i7.f6.c(48.0f, -1));
                                    frameLayout2.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                    rc0Var.N = frameLayout;
                                    ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, i7.f6.c(-1.0f, -1));
                                    org.telegram.ui.Components.ai0 ai0Var = rc0Var.N;
                                    ai0Var.f26780r = false;
                                    AnimatorSet animatorSet = ai0Var.f26781s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        ai0Var.f26781s = null;
                                    }
                                    org.telegram.ui.Components.wh0 wh0Var = ai0Var.v;
                                    wh0Var.measure(View.MeasureSpec.makeMeasureSpec((ai0Var.f26783x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (ai0Var.f26780r) {
                                        z14 = true;
                                    } else {
                                        wh0Var.setVisibility(0);
                                        if (ai0Var.f26782w) {
                                            ai0Var.setLayerType(2, null);
                                        }
                                        wh0Var.setTranslationY(wh0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        ai0Var.f26781s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, 0.0f));
                                        ai0Var.f26781s.setDuration(400L);
                                        ai0Var.f26781s.setStartDelay(20L);
                                        ai0Var.f26781s.setInterpolator(ai0Var.B);
                                        z14 = true;
                                        ai0Var.f26781s.addListener(new org.telegram.ui.Components.zh0(ai0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        ai0Var.f26781s.start();
                                    }
                                    ai0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                rc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = rc0Var.f42064x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                        }
                    }
                });
                this.f42039e.setTranslationX(0.0f);
            } else {
                this.f42039e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                this.f42039e.setOnClickListener(new View.OnClickListener(this) {
                    public final rc0 f43928b;

                    {
                        this.f43928b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        rc0 rc0Var = this.f43928b;
                        switch (i15) {
                            case 0:
                                rc0Var.y0(false);
                                rc0Var.P.H(null, rc0Var.f42058t0, true);
                                rc0Var.f42067z0 = true;
                                rc0Var.x0();
                                return;
                            case 1:
                                rc0Var.d.M(null, null);
                                return;
                            case 2:
                                rc0.U(rc0Var);
                                return;
                            case 3:
                                rc0Var.f42040e0 = -1L;
                                rc0Var.f42066y0 = true;
                                if (rc0Var.j0()) {
                                    rc0Var.f42042f0 = true;
                                    rc0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (rc0Var.getParentActivity() != null && rc0Var.f42057s0 != null && rc0Var.d0() && rc0Var.E != null) {
                                    nh.t3 t3Var = rc0Var.f42065y;
                                    if (t3Var != null) {
                                        t3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0);
                                    if (rc0Var.C) {
                                        rc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        rc0Var.f42036c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = rc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            rc0Var.K = null;
                                        }
                                        rc0Var.C = true;
                                        rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new x60(18, rc0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                    if (iCircle2 == null) {
                                        rc0Var.e0(500);
                                    } else {
                                        rc0Var.L = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(rc0Var.f42033a0)) {
                                        user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42033a0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = rc0Var.getParentActivity();
                                    xb0 xb0Var = new xb0(rc0Var, 3);
                                    xr xrVar = new xr(23, rc0Var, user);
                                    zb0 zb0Var = new zb0(rc0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f26774a = null;
                                    frameLayout.d = -1;
                                    frameLayout.f26777e = false;
                                    frameLayout.f26778f = false;
                                    frameLayout.h = null;
                                    frameLayout.f26779n = new Rect();
                                    new Paint();
                                    frameLayout.f26782w = true;
                                    frameLayout.B = org.telegram.ui.Components.jr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.M = zb0Var;
                                    frameLayout.f26784y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f26783x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, i7.f6.e(-1, -2, 80));
                                    frameLayout.K = LocaleController.getUseImperialSystemType();
                                    frameLayout.I = user;
                                    frameLayout.E = xb0Var;
                                    org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                    frameLayout.C = qc0Var;
                                    qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    qc0Var.setItemCount(5);
                                    org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                    frameLayout.D = qc0Var2;
                                    qc0Var2.setItemCount(5);
                                    qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(frameLayout, parentActivity);
                                    frameLayout.L = xh0Var;
                                    xh0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    xh0Var.addView(frameLayout3, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new mh.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.G = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.F = textView3;
                                    linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                    qc0Var.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 0));
                                    qc0Var.setMinValue(0);
                                    qc0Var.setMaxValue(10);
                                    qc0Var.setWrapSelectorWheel(false);
                                    qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(frameLayout, 1);
                                    qc0Var.setOnValueChangedListener(vh0Var);
                                    qc0Var2.setMinValue(0);
                                    qc0Var2.setMaxValue(10);
                                    qc0Var2.setWrapSelectorWheel(false);
                                    qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                    qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 2));
                                    qc0Var2.setOnValueChangedListener(vh0Var);
                                    qc0Var.setValue(0);
                                    qc0Var2.setValue(6);
                                    xh0Var.addView(frameLayout4, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                    frameLayout4.addView((View) textView3, i7.f6.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.t2(29, frameLayout, xrVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23294q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, i7.f6.c(48.0f, -1));
                                    frameLayout2.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                    rc0Var.N = frameLayout;
                                    ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, i7.f6.c(-1.0f, -1));
                                    org.telegram.ui.Components.ai0 ai0Var = rc0Var.N;
                                    ai0Var.f26780r = false;
                                    AnimatorSet animatorSet = ai0Var.f26781s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        ai0Var.f26781s = null;
                                    }
                                    org.telegram.ui.Components.wh0 wh0Var = ai0Var.v;
                                    wh0Var.measure(View.MeasureSpec.makeMeasureSpec((ai0Var.f26783x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (ai0Var.f26780r) {
                                        z14 = true;
                                    } else {
                                        wh0Var.setVisibility(0);
                                        if (ai0Var.f26782w) {
                                            ai0Var.setLayerType(2, null);
                                        }
                                        wh0Var.setTranslationY(wh0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        ai0Var.f26781s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, 0.0f));
                                        ai0Var.f26781s.setDuration(400L);
                                        ai0Var.f26781s.setStartDelay(20L);
                                        ai0Var.f26781s.setInterpolator(ai0Var.B);
                                        z14 = true;
                                        ai0Var.f26781s.addListener(new org.telegram.ui.Components.zh0(ai0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        ai0Var.f26781s.start();
                                    }
                                    ai0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                rc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = rc0Var.f42064x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                        }
                    }
                });
            }
        }
        int i15 = org.telegram.ui.ActionBar.g6.ui;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i15), false, getResourceProvider());
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
        int i16 = org.telegram.ui.ActionBar.g6.wi;
        int themedColor4 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.g6.xi;
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(dp2, themedColor4, getThemedColor(i17));
        i7.h6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d;
        eg.k1 k1Var = jf.q0.f11668a;
        w0Var2.setOutlineProvider(k1Var);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.O.addView(this.d, i7.f6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f43928b;

            {
                this.f43928b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                rc0 rc0Var = this.f43928b;
                switch (i152) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.f42058t0, true);
                        rc0Var.f42067z0 = true;
                        rc0Var.x0();
                        return;
                    case 1:
                        rc0Var.d.M(null, null);
                        return;
                    case 2:
                        rc0.U(rc0Var);
                        return;
                    case 3:
                        rc0Var.f42040e0 = -1L;
                        rc0Var.f42066y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f42042f0 = true;
                            rc0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42057s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.f42065y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42036c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new x60(18, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.K;
                            if (iCircle2 == null) {
                                rc0Var.e0(500);
                            } else {
                                rc0Var.L = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42033a0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42033a0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = rc0Var.getParentActivity();
                            xb0 xb0Var = new xb0(rc0Var, 3);
                            xr xrVar = new xr(23, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f26774a = null;
                            frameLayout.d = -1;
                            frameLayout.f26777e = false;
                            frameLayout.f26778f = false;
                            frameLayout.h = null;
                            frameLayout.f26779n = new Rect();
                            new Paint();
                            frameLayout.f26782w = true;
                            frameLayout.B = org.telegram.ui.Components.jr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.M = zb0Var;
                            frameLayout.f26784y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f26783x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, i7.f6.e(-1, -2, 80));
                            frameLayout.K = LocaleController.getUseImperialSystemType();
                            frameLayout.I = user;
                            frameLayout.E = xb0Var;
                            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.C = qc0Var;
                            qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            qc0Var.setItemCount(5);
                            org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.D = qc0Var2;
                            qc0Var2.setItemCount(5);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(frameLayout, parentActivity);
                            frameLayout.L = xh0Var;
                            xh0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            xh0Var.addView(frameLayout3, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new mh.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.G = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.F = textView3;
                            linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                            qc0Var.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 0));
                            qc0Var.setMinValue(0);
                            qc0Var.setMaxValue(10);
                            qc0Var.setWrapSelectorWheel(false);
                            qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(frameLayout, 1);
                            qc0Var.setOnValueChangedListener(vh0Var);
                            qc0Var2.setMinValue(0);
                            qc0Var2.setMaxValue(10);
                            qc0Var2.setWrapSelectorWheel(false);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                            qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 2));
                            qc0Var2.setOnValueChangedListener(vh0Var);
                            qc0Var.setValue(0);
                            qc0Var2.setValue(6);
                            xh0Var.addView(frameLayout4, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, i7.f6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.t2(29, frameLayout, xrVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23294q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, i7.f6.c(48.0f, -1));
                            frameLayout2.addView(xh0Var, i7.f6.e(-1, -2, 51));
                            rc0Var.N = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, i7.f6.c(-1.0f, -1));
                            org.telegram.ui.Components.ai0 ai0Var = rc0Var.N;
                            ai0Var.f26780r = false;
                            AnimatorSet animatorSet = ai0Var.f26781s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ai0Var.f26781s = null;
                            }
                            org.telegram.ui.Components.wh0 wh0Var = ai0Var.v;
                            wh0Var.measure(View.MeasureSpec.makeMeasureSpec((ai0Var.f26783x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ai0Var.f26780r) {
                                z14 = true;
                            } else {
                                wh0Var.setVisibility(0);
                                if (ai0Var.f26782w) {
                                    ai0Var.setLayerType(2, null);
                                }
                                wh0Var.setTranslationY(wh0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ai0Var.f26781s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, 0.0f));
                                ai0Var.f26781s.setDuration(400L);
                                ai0Var.f26781s.setStartDelay(20L);
                                ai0Var.f26781s.setInterpolator(ai0Var.B);
                                z14 = true;
                                ai0Var.f26781s.addListener(new org.telegram.ui.Components.zh0(ai0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ai0Var.f26781s.start();
                            }
                            ai0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.f42064x0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        });
        this.d.setDelegate(new xb0(this, 0));
        this.f42032a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        i7.h6.a(this.f42032a);
        this.f42032a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42032a.setOutlineProvider(k1Var);
        this.f42032a.setBackground(h03);
        this.f42032a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f42032a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f42032a;
        int i18 = org.telegram.ui.ActionBar.g6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        this.f42032a.setTag(Integer.valueOf(i18));
        this.f42032a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = i7.f6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams2.height - rect.top) + d.bottomMargin;
        this.O.addView(this.f42032a, d);
        this.f42032a.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f43928b;

            {
                this.f43928b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                rc0 rc0Var = this.f43928b;
                switch (i152) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.f42058t0, true);
                        rc0Var.f42067z0 = true;
                        rc0Var.x0();
                        return;
                    case 1:
                        rc0Var.d.M(null, null);
                        return;
                    case 2:
                        rc0.U(rc0Var);
                        return;
                    case 3:
                        rc0Var.f42040e0 = -1L;
                        rc0Var.f42066y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f42042f0 = true;
                            rc0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42057s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.f42065y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42036c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new x60(18, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.K;
                            if (iCircle2 == null) {
                                rc0Var.e0(500);
                            } else {
                                rc0Var.L = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42033a0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42033a0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = rc0Var.getParentActivity();
                            xb0 xb0Var = new xb0(rc0Var, 3);
                            xr xrVar = new xr(23, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f26774a = null;
                            frameLayout.d = -1;
                            frameLayout.f26777e = false;
                            frameLayout.f26778f = false;
                            frameLayout.h = null;
                            frameLayout.f26779n = new Rect();
                            new Paint();
                            frameLayout.f26782w = true;
                            frameLayout.B = org.telegram.ui.Components.jr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.M = zb0Var;
                            frameLayout.f26784y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f26783x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, i7.f6.e(-1, -2, 80));
                            frameLayout.K = LocaleController.getUseImperialSystemType();
                            frameLayout.I = user;
                            frameLayout.E = xb0Var;
                            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.C = qc0Var;
                            qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            qc0Var.setItemCount(5);
                            org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.D = qc0Var2;
                            qc0Var2.setItemCount(5);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(frameLayout, parentActivity);
                            frameLayout.L = xh0Var;
                            xh0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            xh0Var.addView(frameLayout3, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new mh.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.G = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.F = textView3;
                            linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                            qc0Var.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 0));
                            qc0Var.setMinValue(0);
                            qc0Var.setMaxValue(10);
                            qc0Var.setWrapSelectorWheel(false);
                            qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(frameLayout, 1);
                            qc0Var.setOnValueChangedListener(vh0Var);
                            qc0Var2.setMinValue(0);
                            qc0Var2.setMaxValue(10);
                            qc0Var2.setWrapSelectorWheel(false);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                            qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 2));
                            qc0Var2.setOnValueChangedListener(vh0Var);
                            qc0Var.setValue(0);
                            qc0Var2.setValue(6);
                            xh0Var.addView(frameLayout4, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, i7.f6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.t2(29, frameLayout, xrVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23294q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, i7.f6.c(48.0f, -1));
                            frameLayout2.addView(xh0Var, i7.f6.e(-1, -2, 51));
                            rc0Var.N = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, i7.f6.c(-1.0f, -1));
                            org.telegram.ui.Components.ai0 ai0Var = rc0Var.N;
                            ai0Var.f26780r = false;
                            AnimatorSet animatorSet = ai0Var.f26781s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ai0Var.f26781s = null;
                            }
                            org.telegram.ui.Components.wh0 wh0Var = ai0Var.v;
                            wh0Var.measure(View.MeasureSpec.makeMeasureSpec((ai0Var.f26783x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ai0Var.f26780r) {
                                z14 = true;
                            } else {
                                wh0Var.setVisibility(0);
                                if (ai0Var.f26782w) {
                                    ai0Var.setLayerType(2, null);
                                }
                                wh0Var.setTranslationY(wh0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ai0Var.f26781s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, 0.0f));
                                ai0Var.f26781s.setDuration(400L);
                                ai0Var.f26781s.setStartDelay(20L);
                                ai0Var.f26781s.setInterpolator(ai0Var.B);
                                z14 = true;
                                ai0Var.f26781s.addListener(new org.telegram.ui.Components.zh0(ai0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ai0Var.f26781s.start();
                            }
                            ai0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.f42064x0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.f42034b = textView;
        textView.setGravity(17);
        this.f42034b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42034b.setTextSize(1, 15.0f);
        this.f42034b.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourceProvider));
        this.f42034b.setTypeface(AndroidUtilities.bold());
        this.f42034b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f42034b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.f42034b.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i16), getThemedColor(i17), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams d10 = i7.f6.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams2.height - rect.top) + d10.bottomMargin;
        this.O.addView(this.f42034b, d10);
        i7.h6.a(this.f42034b);
        this.f42034b.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f43928b;

            {
                this.f43928b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                rc0 rc0Var = this.f43928b;
                switch (i152) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.f42058t0, true);
                        rc0Var.f42067z0 = true;
                        rc0Var.x0();
                        return;
                    case 1:
                        rc0Var.d.M(null, null);
                        return;
                    case 2:
                        rc0.U(rc0Var);
                        return;
                    case 3:
                        rc0Var.f42040e0 = -1L;
                        rc0Var.f42066y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f42042f0 = true;
                            rc0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42057s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.f42065y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42036c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new x60(18, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.K;
                            if (iCircle2 == null) {
                                rc0Var.e0(500);
                            } else {
                                rc0Var.L = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42033a0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42033a0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = rc0Var.getParentActivity();
                            xb0 xb0Var = new xb0(rc0Var, 3);
                            xr xrVar = new xr(23, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f26774a = null;
                            frameLayout.d = -1;
                            frameLayout.f26777e = false;
                            frameLayout.f26778f = false;
                            frameLayout.h = null;
                            frameLayout.f26779n = new Rect();
                            new Paint();
                            frameLayout.f26782w = true;
                            frameLayout.B = org.telegram.ui.Components.jr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.M = zb0Var;
                            frameLayout.f26784y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f26783x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, i7.f6.e(-1, -2, 80));
                            frameLayout.K = LocaleController.getUseImperialSystemType();
                            frameLayout.I = user;
                            frameLayout.E = xb0Var;
                            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.C = qc0Var;
                            qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            qc0Var.setItemCount(5);
                            org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.D = qc0Var2;
                            qc0Var2.setItemCount(5);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(frameLayout, parentActivity);
                            frameLayout.L = xh0Var;
                            xh0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            xh0Var.addView(frameLayout3, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.x3.t(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new mh.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.G = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.F = textView3;
                            linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                            qc0Var.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 0));
                            qc0Var.setMinValue(0);
                            qc0Var.setMaxValue(10);
                            qc0Var.setWrapSelectorWheel(false);
                            qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(frameLayout, 1);
                            qc0Var.setOnValueChangedListener(vh0Var);
                            qc0Var2.setMinValue(0);
                            qc0Var2.setMaxValue(10);
                            qc0Var2.setWrapSelectorWheel(false);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                            qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 2));
                            qc0Var2.setOnValueChangedListener(vh0Var);
                            qc0Var.setValue(0);
                            qc0Var2.setValue(6);
                            xh0Var.addView(frameLayout4, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, i7.f6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.t2(29, frameLayout, xrVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23294q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, i7.f6.c(48.0f, -1));
                            frameLayout2.addView(xh0Var, i7.f6.e(-1, -2, 51));
                            rc0Var.N = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, i7.f6.c(-1.0f, -1));
                            org.telegram.ui.Components.ai0 ai0Var = rc0Var.N;
                            ai0Var.f26780r = false;
                            AnimatorSet animatorSet = ai0Var.f26781s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ai0Var.f26781s = null;
                            }
                            org.telegram.ui.Components.wh0 wh0Var = ai0Var.v;
                            wh0Var.measure(View.MeasureSpec.makeMeasureSpec((ai0Var.f26783x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ai0Var.f26780r) {
                                z14 = true;
                            } else {
                                wh0Var.setVisibility(0);
                                if (ai0Var.f26782w) {
                                    ai0Var.setLayerType(2, null);
                                }
                                wh0Var.setTranslationY(wh0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ai0Var.f26781s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, 0.0f));
                                ai0Var.f26781s.setDuration(400L);
                                ai0Var.f26781s.setStartDelay(20L);
                                ai0Var.f26781s.setInterpolator(ai0Var.B);
                                z14 = true;
                                ai0Var.f26781s.addListener(new org.telegram.ui.Components.zh0(ai0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ai0Var.f26781s.start();
                            }
                            ai0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.f42064x0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        });
        z0(false, false);
        this.f42036c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        i7.h6.a(this.f42036c);
        this.f42036c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42036c.setOutlineProvider(k1Var);
        this.f42036c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        this.f42036c.setBackgroundDrawable(h04);
        this.f42036c.setScaleType(scaleType);
        this.f42036c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.O.addView(this.f42036c, i7.f6.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.f42036c.setOnClickListener(new View.OnClickListener(this) {
            public final rc0 f43928b;

            {
                this.f43928b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                rc0 rc0Var = this.f43928b;
                switch (i152) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.f42058t0, true);
                        rc0Var.f42067z0 = true;
                        rc0Var.x0();
                        return;
                    case 1:
                        rc0Var.d.M(null, null);
                        return;
                    case 2:
                        rc0.U(rc0Var);
                        return;
                    case 3:
                        rc0Var.f42040e0 = -1L;
                        rc0Var.f42066y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f42042f0 = true;
                            rc0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.f42057s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.f42065y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.f42036c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, 1), new x60(18, rc0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = rc0Var.K;
                            if (iCircle2 == null) {
                                rc0Var.e0(500);
                            } else {
                                rc0Var.L = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(rc0Var.f42033a0)) {
                                user = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42033a0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = rc0Var.getParentActivity();
                            xb0 xb0Var = new xb0(rc0Var, 3);
                            xr xrVar = new xr(23, rc0Var, user);
                            zb0 zb0Var = new zb0(rc0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f26774a = null;
                            frameLayout.d = -1;
                            frameLayout.f26777e = false;
                            frameLayout.f26778f = false;
                            frameLayout.h = null;
                            frameLayout.f26779n = new Rect();
                            new Paint();
                            frameLayout.f26782w = true;
                            frameLayout.B = org.telegram.ui.Components.jr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.M = zb0Var;
                            frameLayout.f26784y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f26783x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, i7.f6.e(-1, -2, 80));
                            frameLayout.K = LocaleController.getUseImperialSystemType();
                            frameLayout.I = user;
                            frameLayout.E = xb0Var;
                            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.C = qc0Var;
                            qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            qc0Var.setItemCount(5);
                            org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                            frameLayout.D = qc0Var2;
                            qc0Var2.setItemCount(5);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(frameLayout, parentActivity);
                            frameLayout.L = xh0Var;
                            xh0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            xh0Var.addView(frameLayout3, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.x3.t(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new mh.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.G = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.F = textView3;
                            linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                            qc0Var.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 0));
                            qc0Var.setMinValue(0);
                            qc0Var.setMaxValue(10);
                            qc0Var.setWrapSelectorWheel(false);
                            qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(frameLayout, 1);
                            qc0Var.setOnValueChangedListener(vh0Var);
                            qc0Var2.setMinValue(0);
                            qc0Var2.setMaxValue(10);
                            qc0Var2.setWrapSelectorWheel(false);
                            qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                            qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(frameLayout, 2));
                            qc0Var2.setOnValueChangedListener(vh0Var);
                            qc0Var.setValue(0);
                            qc0Var2.setValue(6);
                            xh0Var.addView(frameLayout4, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, i7.f6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.t2(29, frameLayout, xrVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23294q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, i7.f6.c(48.0f, -1));
                            frameLayout2.addView(xh0Var, i7.f6.e(-1, -2, 51));
                            rc0Var.N = frameLayout;
                            ((FrameLayout) rc0Var.fragmentView).addView((View) frameLayout, i7.f6.c(-1.0f, -1));
                            org.telegram.ui.Components.ai0 ai0Var = rc0Var.N;
                            ai0Var.f26780r = false;
                            AnimatorSet animatorSet = ai0Var.f26781s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ai0Var.f26781s = null;
                            }
                            org.telegram.ui.Components.wh0 wh0Var = ai0Var.v;
                            wh0Var.measure(View.MeasureSpec.makeMeasureSpec((ai0Var.f26783x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ai0Var.f26780r) {
                                z14 = true;
                            } else {
                                wh0Var.setVisibility(0);
                                if (ai0Var.f26782w) {
                                    ai0Var.setLayerType(2, null);
                                }
                                wh0Var.setTranslationY(wh0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ai0Var.f26781s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, 0.0f));
                                ai0Var.f26781s.setDuration(400L);
                                ai0Var.f26781s.setStartDelay(20L);
                                ai0Var.f26781s.setInterpolator(ai0Var.B);
                                z14 = true;
                                ai0Var.f26781s.addListener(new org.telegram.ui.Components.zh0(ai0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ai0Var.f26781s.start();
                            }
                            ai0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.f42064x0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        });
        if (DialogObject.isChatDialog(this.f42033a0)) {
            chat = getMessagesController().getChat(Long.valueOf(-this.f42033a0));
        } else {
            chat = null;
        }
        MessageObject messageObject3 = this.f42064x0;
        if (messageObject3 != null && messageObject3.isLiveLocation() && !this.f42064x0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42033a0);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.f42036c.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.f42033a0) && this.f42064x0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f42036c.setVisibility(4);
                    this.f42036c.setAlpha(0.0f);
                    this.f42036c.setScaleX(0.4f);
                    this.f42036c.setScaleY(0.4f);
                }
                this.f42036c.setImageResource(R.drawable.msg_location_alert);
            }
        } else {
            this.f42036c.setVisibility(8);
            this.f42036c.setImageResource(R.drawable.msg_location_alert);
        }
        nh.t3 t3Var = new nh.t3(context, 1);
        this.f42065y = t3Var;
        t3Var.setLayerType(2, null);
        nh.t3 t3Var2 = this.f42065y;
        t3Var2.d = 4000L;
        t3Var2.m(1.0f, -25.0f);
        this.f42065y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.O.addView(this.f42065y, i7.f6.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42041f = linearLayout;
        linearLayout.setOrientation(1);
        this.f42041f.setGravity(1);
        this.f42041f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f42041f.setVisibility(8);
        pc0Var.addView(this.f42041f, i7.f6.c(-1.0f, -1));
        this.f42041f.setOnTouchListener(new mh.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.W5), mode));
        this.f42041f.addView(this.h, i7.f6.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.f42049n = textView2;
        int i19 = org.telegram.ui.ActionBar.g6.X5;
        textView2.setTextColor(getThemedColor(i19));
        this.f42049n.setGravity(17);
        this.f42049n.setTypeface(AndroidUtilities.bold());
        this.f42049n.setTextSize(1, 17.0f);
        this.f42049n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i20 = th.i(this.f42041f, this.f42049n, i7.f6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f42054r = i20;
        i20.setTextColor(getThemedColor(i19));
        this.f42054r.setGravity(17);
        this.f42054r.setTextSize(1, 15.0f);
        this.f42054r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f42041f.addView(this.f42054r, i7.f6.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.Q = jl0Var;
        long j10 = this.f42033a0;
        org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
        boolean z14 = this.A;
        if (i14 == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        fc0 fc0Var2 = new fc0(this, context, this.C0, j10, resourceProvider, z14, z11);
        this.P = fc0Var2;
        jl0Var.setAdapter(fc0Var2);
        org.telegram.ui.Components.jl0 jl0Var2 = this.Q;
        f2.j0 j0Var = new f2.j0(1, false);
        this.U = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        if (this.I0 != null) {
            this.H0 = new org.telegram.ui.Cells.s3(context, this.resourceProvider);
            hc0 hc0Var = new hc0(this, context, new org.telegram.ui.Components.iu0(this), this, new gc0(this), getResourceProvider());
            this.G0 = hc0Var;
            hc0Var.setBackgroundColor(getThemedColor(i12));
            this.G0.addView(this.H0, i7.f6.e(-1, 32, 55));
            this.P.f47257d0 = this.G0;
            this.Q.setOverScrollMode(2);
            f2.l lVar3 = new f2.l();
            z12 = false;
            lVar3.f6463m = false;
            lVar3.C = false;
            lVar3.o(org.telegram.ui.Components.jr.h);
            lVar3.n(350L);
            this.Q.setItemAnimator(lVar3);
        } else {
            z12 = false;
        }
        this.P.O(this.Y, z12);
        this.P.getClass();
        this.Q.setVerticalScrollBarEnabled(z12);
        pc0Var.addView(this.Q, i7.f6.e(-1, -1, 51));
        MessageObject messageObject4 = this.f42064x0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            fc0 fc0Var3 = this.P;
            fc0Var3.M = this.f42064x0.messageOwner.media.address;
            fc0Var3.Q();
        }
        this.Q.setOnScrollListener(new ic0(this));
        ((f2.l) this.Q.getItemAnimator()).C = false;
        this.Q.setOnItemLongClickListener(new xr(21, this, context));
        this.Q.setOnItemClickListener(new j(this, 16));
        fc0 fc0Var4 = this.P;
        long j11 = this.f42033a0;
        xb0 xb0Var = new xb0(this, 5);
        fc0Var4.D = j11;
        fc0Var4.f47183y = xb0Var;
        fc0Var4.P(this.D0);
        pc0Var.addView(this.O, i7.f6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.G.setOnDispatchTouchEventInterceptor(new xb0(this, 6));
        this.G.setOnInterceptTouchEventInterceptor(new xb0(this, 7));
        this.G.setOnLayoutListener(new zb0(this, 5));
        new Thread(new ac0(this, this.G, 1)).start();
        MessageObject messageObject5 = this.f42064x0;
        if (messageObject5 == null && this.f42060v0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f42033a0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.O.addView(frameLayout, i7.f6.e(62, 76, 49));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                t9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                t9Var.e(chat, new org.telegram.ui.Components.e9(chat));
                frameLayout.addView(t9Var, i7.f6.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.T = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.T == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.O.addView(imageView4, i7.f6.e(28, 48, 49));
                this.T = imageView4;
            }
            org.telegram.ui.Components.jl0 jl0Var3 = new org.telegram.ui.Components.jl0(context, null);
            this.R = jl0Var3;
            jl0Var3.setVisibility(8);
            i11 = 0;
            this.R.setLayoutManager(new f2.j0(1, false));
            org.telegram.ui.ActionBar.c6 resourceProvider2 = getResourceProvider();
            if (i10 == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            kc0 kc0Var2 = new kc0(this, context, resourceProvider2, z13);
            this.S = kc0Var2;
            xb0 xb0Var2 = new xb0(this, 8);
            kc0Var2.D = 0L;
            kc0Var2.f47183y = xb0Var2;
            pc0Var.addView(this.R, i7.f6.e(-1, -1, 51));
            this.R.setOnScrollListener(new m3(this, 18));
            this.R.setOnItemClickListener(new eg.w0(19, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f42060v0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f42060v0;
                if (tL_channelLocation2 != null) {
                    this.P.T = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.f42064x0;
                    if (messageObject6 != null) {
                        fc0 fc0Var5 = this.P;
                        fc0Var5.S = messageObject6;
                        fc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.f42064x0;
        if (messageObject7 != null && i10 == 6) {
            fc0 fc0Var6 = this.P;
            fc0Var6.S = messageObject7;
            fc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.B;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.O.addView(undoViewArr[i11], i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        lh.z2 z2Var = new lh.z2(this, context, rect);
        this.v = z2Var;
        z2Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.O.addView(this.v, layoutParams2);
        if (this.f42064x0 == null && this.f42060v0 == null && this.f42062w0 != null) {
            this.f42066y0 = true;
            ImageView imageView5 = this.f42032a;
            int i21 = org.telegram.ui.ActionBar.g6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i21), PorterDuff.Mode.MULTIPLY));
            this.f42032a.setTag(Integer.valueOf(i21));
        }
        pc0Var.addView(this.actionBar);
        B0();
        return this.fragmentView;
    }

    public final boolean d0() {
        if (h0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new xb0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f22714a);
                    return false;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return true;
            }
        }
        return true;
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
            this.Y = false;
            fc0 fc0Var3 = this.P;
            if (fc0Var3 != null) {
                fc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.Y = true;
            fc0 fc0Var4 = this.P;
            if (fc0Var4 != null) {
                fc0Var4.O(true, false);
            }
        } else if (i10 == NotificationCenter.liveLocationsChanged) {
            fc0 fc0Var5 = this.P;
            if (fc0Var5 != null) {
                fc0Var5.l();
            }
            C0();
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f42033a0 && this.f42064x0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    if (messageObject.isLiveLocation()) {
                        c0(messageObject.messageOwner);
                        z10 = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.f42036c.setImageResource(R.drawable.msg_location_alert);
                        IMapsProvider.ICircle iCircle = this.K;
                        if (iCircle != null) {
                            iCircle.remove();
                            this.K = null;
                        }
                    }
                }
                if (z10 && (fc0Var2 = this.P) != null) {
                    fc0Var2.N(this.f42037c0);
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f42033a0 && this.f42064x0 != null) {
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
                        lc0 lc0Var = (lc0) this.f42038d0.f(dialogId);
                        if (lc0Var != null) {
                            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                            if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                                TLRPC.Message message2 = messageObject2.messageOwner;
                                lc0Var.f40165b = message2;
                                TLRPC.GeoPoint geoPoint = message2.media.geo;
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                                lc0Var.f40167e.setPosition(latLng);
                                if (this.f42040e0 == lc0Var.f40164a) {
                                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var.f40167e.getPosition()));
                                }
                                IMapsProvider.IMarker iMarker = lc0Var.f40168f;
                                if (iMarker != null) {
                                    iMarker.getPosition();
                                    lc0Var.f40168f.setPosition(latLng);
                                    int i14 = messageObject2.messageOwner.media.heading;
                                    if (i14 != 0) {
                                        lc0Var.f40168f.setRotation(i14);
                                        if (!lc0Var.f40169g) {
                                            lc0Var.f40168f.setIcon(R.drawable.map_pin_cone2);
                                            lc0Var.f40169g = true;
                                        }
                                    } else if (lc0Var.f40169g) {
                                        lc0Var.f40168f.setRotation(0);
                                        lc0Var.f40168f.setIcon(R.drawable.map_pin_circle);
                                        lc0Var.f40169g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (fc0Var = this.P) != null) {
                    fc0Var.l();
                    org.telegram.ui.Components.ai0 ai0Var = this.N;
                    if (ai0Var != null) {
                        ai0Var.c(true);
                    }
                }
                if (z11) {
                    C0();
                }
            }
        }
    }

    public final void e0(int i10) {
        if (this.E == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.f42057s0.getLatitude(), this.f42057s0.getLongitude()));
        onCreateCircleOptions.radius(i10);
        if (n0()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.K = this.E.addCircle(onCreateCircleOptions);
    }

    public final Bitmap f0(int i10) {
        Bitmap[] bitmapArr = this.M0;
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
            paint.setColor(org.telegram.ui.Cells.s4.a(i10));
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
    public final boolean finishFragment(boolean z10) {
        if (q0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    public final Bitmap g0(lc0 lc0Var) {
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
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                TLRPC.User user = lc0Var.f40166c;
                if (user != null) {
                    e9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = lc0Var.d;
                    if (chat != null) {
                        e9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                e9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                e9Var.draw(canvas);
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

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 21);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.B;
            if (i10 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.g6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.g6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.g6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.g6.f23133h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, fVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.g6.f23169j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.f42061w;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, fVar, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, fVar, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, fVar, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.f42049n;
        int i17 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42054r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ImageView imageView2 = this.f42032a;
        int i18 = org.telegram.ui.ActionBar.g6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.f42032a;
        int i19 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.f42032a;
        int i20 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.f42032a;
        int i21 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42036c, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42036c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42036c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42039e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42039e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42039e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23305r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.pi));
        int i22 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 131072, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 196608, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23240n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 32, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 8, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof cn;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilder;
        if (this.f42035b0) {
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
                if (this.f42036c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f42036c.setVisibility(0);
                    this.D = true;
                    this.f42036c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new e50(this, 2)).start();
                }
            }
        }
        if (iLatLngBoundsBuilder != null) {
            if (this.f42035b0) {
                this.Q.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f42035b0 = false;
            this.P.N(this.f42037c0);
            if (this.f42064x0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = iLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng p02 = p0(center, 100.0d, 100.0d);
                    iLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    iLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = iLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.F = newCameraUpdateLatLngBounds;
                            this.E.moveCamera(newCameraUpdateLatLngBounds);
                            this.F = null;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        int i10;
        boolean z10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.E != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i10 = getConnectionsManager().getCurrentTime();
            } else {
                i10 = 0;
            }
            ArrayList arrayList2 = this.f42037c0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                lc0 lc0Var = (lc0) arrayList2.get(i12);
                IMapsProvider.IMarker iMarker = lc0Var.f40167e;
                if (iMarker != null && (message = lc0Var.f40165b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            if (this.f42038d0.f(getUserConfig().getClientUserId()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f42057s0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f42057s0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    int i13 = 0;
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
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, 15.0d, 15.0d));
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, -15.0d, -15.0d));
                    }
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        if (this.Q != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i12 = this.C0;
                if (i12 == 6) {
                    this.D0 = org.telegram.messenger.x3.B(66.0f, measuredHeight, currentActionBarHeight);
                } else if (i12 == 2) {
                    this.D0 = org.telegram.messenger.x3.B(73.0f, measuredHeight, currentActionBarHeight);
                } else {
                    this.D0 = org.telegram.messenger.x3.B(66.0f, measuredHeight, currentActionBarHeight);
                }
                hc0 hc0Var = this.G0;
                if (hc0Var != null && hc0Var.c0(8) > 0) {
                    this.D0 -= AndroidUtilities.dp(200.0f);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.O.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.D0;
                this.O.setLayoutParams(layoutParams3);
                org.telegram.ui.Components.jl0 jl0Var = this.R;
                if (jl0Var != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) jl0Var.getLayoutParams();
                    layoutParams4.topMargin = currentActionBarHeight;
                    this.R.setLayoutParams(layoutParams4);
                }
                this.P.P(this.D0);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = AndroidUtilities.dp(10.0f) + this.D0;
                    IMapsProvider.IMap iMap = this.E;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.G.getView().setLayoutParams(layoutParams5);
                }
                oc0 oc0Var = this.f42063x;
                if (oc0Var != null && (layoutParams = (FrameLayout.LayoutParams) oc0Var.getLayoutParams()) != null) {
                    layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                    this.f42063x.setLayoutParams(layoutParams);
                }
                this.P.l();
                if (z10) {
                    if (i12 == 3) {
                        i11 = 73;
                    } else if (i12 != 1 && i12 != 2) {
                        i11 = 0;
                    } else {
                        i11 = 66;
                    }
                    this.U.h1(0, -AndroidUtilities.dp(i11));
                    A0(false);
                    this.Q.post(new org.telegram.ui.Components.i8(this, i11, 18));
                    return;
                }
                A0(false);
            }
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.f42064x0.getDialogId());
        if (arrayList != null && arrayList.isEmpty()) {
            i0(arrayList);
        } else {
            arrayList = null;
        }
        if (DialogObject.isChatDialog(this.f42033a0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f42033a0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.f42064x0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new lh.s5(this, dialogId, 6));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView m0() {
        UndoView[] undoViewArr = this.B;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.O.removeView(undoViewArr[0]);
            this.O.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean n0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.g6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f42036c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.D && (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
            if (DialogObject.isUserDialog(this.f42033a0)) {
                this.f42065y.t(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f42033a0)))));
            } else {
                this.f42065y.t(LocaleController.getString(R.string.ProximityTooltioGroup));
            }
            this.f42065y.v();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ai0 ai0Var = this.N;
        if (ai0Var != null) {
            if (z10) {
                ai0Var.a();
                return false;
            }
        } else {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.I) {
                if (z10) {
                    q0();
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.f42064x0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
            getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
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
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        fc0 fc0Var = this.P;
        if (fc0Var != null) {
            fc0Var.F();
        }
        kc0 kc0Var = this.S;
        if (kc0Var != null) {
            kc0Var.F();
        }
        zb0 zb0Var = this.F0;
        if (zb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zb0Var);
            this.F0 = null;
        }
        ArrayList arrayList = this.f42037c0;
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
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f42053q0) {
            iMapView.onLowMemory();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f42053q0) {
            try {
                iMapView.onPause();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f42055r0 = false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 30) {
            s0(false);
        }
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f42053q0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f42055r0 = true;
        IMapsProvider.IMap iMap = this.E;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        k0(true);
        if (h0()) {
            this.f42048l0 = false;
        } else if (this.f42048l0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f42048l0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        zb0 zb0Var = this.F0;
        if (zb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zb0Var);
            AndroidUtilities.runOnUIThread(this.F0, 5000L);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            try {
                if (this.G.getView().getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.G.getView().getParent()).removeView(this.G.getView());
                }
            } catch (Exception unused) {
            }
            n0 n0Var = this.O;
            if (n0Var != null) {
                n0Var.addView(this.G.getView(), 0, i7.f6.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
                oc0 oc0Var = this.f42063x;
                if (oc0Var != null) {
                    try {
                        if (oc0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f42063x.getParent()).removeView(this.f42063x);
                        }
                    } catch (Exception unused2) {
                    }
                    this.O.addView(this.f42063x, 1, i7.f6.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
                }
                A0(false);
                o0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.G.getView(), 0, i7.f6.e(-1, -1, 51));
            }
        }
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.I) {
            GLSurfaceView glSurfaceView = this.G.getGlSurfaceView();
            glSurfaceView.queueEvent(new x60(17, this, glSurfaceView));
            return true;
        }
        return false;
    }

    public final void r0(lc0 lc0Var) {
        double d;
        double d10;
        String str;
        TLRPC.Message message;
        if (lc0Var != null && (message = lc0Var.f40165b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d10 = geoPoint._long;
        } else {
            MessageObject messageObject = this.f42064x0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.f42060v0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.f42057s0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f42057s0.getLatitude()), Double.valueOf(this.f42057s0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public final void s0(final boolean z10) {
        final TLRPC.User user;
        Activity parentActivity;
        if (this.B0 != null && !h0() && getParentActivity() != null && this.f42057s0 != null && d0()) {
            if (this.m0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.m0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    org.telegram.ui.Components.c5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new vb0(this, z10, 1), null).o();
                    return;
                }
            }
            if (DialogObject.isUserDialog(this.f42033a0)) {
                user = getMessagesController().getUser(Long.valueOf(this.f42033a0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.c5.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    rc0.V(rc0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f42057s0 = new Location(location);
        lc0 lc0Var = (lc0) this.f42038d0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42033a0);
        if (lc0Var != null && sharingLocationInfo != null && lc0Var.f40165b.f22413id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            lc0Var.f40167e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = lc0Var.f40168f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f42040e0 == lc0Var.f40164a) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var.f40167e.getPosition()));
            }
        }
        if (this.f42064x0 == null && this.f42060v0 == null && this.E != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            fc0 fc0Var = this.P;
            if (fc0Var != null) {
                if (!this.f42067z0 && (i10 = this.C0) != 4 && i10 != 8) {
                    fc0Var.H(null, this.f42057s0, true);
                }
                this.P.M(this.f42057s0);
            }
            if (!this.f42066y0) {
                this.f42058t0 = new Location(location);
                if (this.A0) {
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.A0 = true;
                    this.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.E.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.P.M(this.f42057s0);
        }
        org.telegram.ui.Components.ai0 ai0Var = this.N;
        if (ai0Var != null) {
            ai0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.K;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f42057s0.getLatitude(), this.f42057s0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.f42064x0 = messageObject;
        this.f42033a0 = messageObject.getDialogId();
    }

    public final void v0(lc0 lc0Var) {
        if (lc0Var.h == null) {
            TLRPC.User user = lc0Var.f40166c;
            TLRPC.Chat chat = lc0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            if (user != null) {
                e9Var.m(this.currentAccount, user);
            } else {
                e9Var.k(this.currentAccount, chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setCurrentAccount(this.currentAccount);
            imageReceiver.setDelegate(new xr(22, this, lc0Var));
            imageReceiver.onAttachedToWindow();
            if (user == null) {
                user = chat;
            }
            imageReceiver.setForUserOrChat(user, e9Var);
            lc0Var.h = imageReceiver;
        }
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f42057s0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f42057s0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f42057s0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.B0.d(tL_messageMediaGeoLive, this.C0, true, 0, 0L);
        if (i11 > 0) {
            this.N.H = true;
            this.f42036c.setImageResource(R.drawable.msg_location_alert2);
            org.telegram.ui.Components.ai0 ai0Var = this.N;
            if (ai0Var != null) {
                ai0Var.a();
            }
            m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void x0() {
        if (this.P.h() != 0 && this.U.L0() == 0) {
            View childAt = this.Q.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                this.Q.v0(0, top, null);
            }
        }
    }

    public final void y0(boolean z10) {
        Integer num;
        float f9;
        org.telegram.ui.Components.zk zkVar;
        Location location;
        Location location2;
        if (this.C0 == 3) {
            z10 = true;
        }
        if (z10 && (zkVar = this.f42039e) != null && zkVar.getTag() == null && ((location = this.f42057s0) == null || (location2 = this.f42058t0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.zk zkVar2 = this.f42039e;
        if (zkVar2 != null) {
            if (!z10 || zkVar2.getTag() == null) {
                if (z10 || this.f42039e.getTag() != null) {
                    org.telegram.ui.Components.zk zkVar3 = this.f42039e;
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    zkVar3.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    org.telegram.ui.Components.zk zkVar4 = this.f42039e;
                    Property property = View.TRANSLATION_X;
                    if (z10) {
                        f9 = 0.0f;
                    } else {
                        f9 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zkVar4, property, f9));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.jr.f29801g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        float f9;
        float f10;
        Boolean bool = this.L0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.L0 = Boolean.valueOf(z10);
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.7f;
        if (!z11) {
            TextView textView = this.f42034b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f42034b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f42034b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f42034b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f42034b.setVisibility(0);
        ViewPropertyAnimator animate = this.f42034b.animate();
        if (z10) {
            f11 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f11);
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.7f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f9);
        if (z10) {
            f12 = 1.0f;
        }
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.jr.h).setDuration(420L).withEndAction(new vb0(this, z10, 0)).start();
    }
}
