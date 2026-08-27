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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

public class tc0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean A0;
    public final UndoView[] B;
    public oc0 B0;
    public boolean C;
    public final int C0;
    public boolean D;
    public int D0;
    public IMapsProvider.IMap E;
    public lc0 E0;
    public IMapsProvider.ICameraUpdate F;
    public cc0 F0;
    public IMapsProvider.IMapView G;
    public jc0 G0;
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
    public org.telegram.ui.Components.sh0 N;
    public n0 O;
    public hc0 P;
    public org.telegram.ui.Components.zk0 Q;
    public org.telegram.ui.Components.zk0 R;
    public mc0 S;
    public View T;
    public f2.k0 U;
    public org.telegram.ui.ActionBar.v0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    public ImageView f42855a;

    public long f42856a0;

    public TextView f42857b;

    public boolean f42858b0;

    public ImageView f42859c;

    public final ArrayList f42860c0;
    public org.telegram.ui.ActionBar.v0 d;

    public final a0.h f42861d0;

    public org.telegram.ui.Components.rk f42862e;

    public long f42863e0;

    public LinearLayout f42864f;

    public boolean f42865f0;

    public final ArrayList f42866g0;
    public ImageView h;

    public AnimatorSet f42867h0;

    public IMapsProvider.IMarker f42868i0;

    public sc0 f42869j0;

    public FrameLayout f42870k0;

    public boolean f42871l0;
    public boolean m0;

    public TextView f42872n;

    public boolean f42873n0;

    public boolean f42874o0;

    public boolean f42875p0;

    public boolean f42876q0;

    public TextView f42877r;

    public boolean f42878r0;

    public Drawable f42879s;

    public Location f42880s0;

    public Location f42881t0;

    public int f42882u0;
    public jh.a3 v;

    public TLRPC.TL_channelLocation f42883v0;

    public org.telegram.ui.ActionBar.v0 f42884w;

    public TLRPC.TL_channelLocation f42885w0;

    public qc0 f42886x;

    public MessageObject f42887x0;

    public lh.w3 f42888y;

    public boolean f42889y0;

    public boolean f42890z0;

    public tc0(int i10) {
        super(null);
        this.B = new UndoView[2];
        this.X = true;
        this.Y = false;
        this.Z = true;
        this.f42858b0 = true;
        this.f42860c0 = new ArrayList();
        this.f42861d0 = new a0.h();
        this.f42863e0 = -1L;
        this.f42866g0 = new ArrayList();
        this.f42871l0 = true;
        this.m0 = true;
        this.D0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.K0 = true;
        this.M0 = new Bitmap[7];
        this.C0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(tc0 tc0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = tc0Var.C0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = tc0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (tc0Var.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc0Var.getParentActivity());
            alertDialog$Builder.m(R.raw.permission_request_location, 72, tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new ac0(tc0Var, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            tc0Var.showDialog(alertDialog$Builder.f22702a);
            return;
        }
        if (tc0Var.d0() || i10 == 3) {
            if ((tc0Var.f42887x0 == null || i10 == 3) && tc0Var.f42883v0 == null) {
                if (tc0Var.f42880s0 != null && tc0Var.E != null) {
                    ImageView imageView = tc0Var.f42855a;
                    int i11 = org.telegram.ui.ActionBar.g6.vi;
                    imageView.setColorFilter(new PorterDuffColorFilter(tc0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                    tc0Var.f42855a.setTag(Integer.valueOf(i11));
                    tc0Var.P.L(null);
                    tc0Var.f42889y0 = false;
                    tc0Var.y0(false);
                    tc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(tc0Var.f42880s0.getLatitude(), tc0Var.f42880s0.getLongitude())));
                    if (tc0Var.f42890z0 && i10 != 8) {
                        Location location = tc0Var.f42880s0;
                        if (location != null) {
                            tc0Var.P.H(null, location, true);
                        }
                        tc0Var.f42890z0 = false;
                        tc0Var.x0();
                    }
                }
            } else if (tc0Var.f42880s0 != null && (iMap = tc0Var.E) != null) {
                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(tc0Var.f42880s0.getLatitude(), tc0Var.f42880s0.getLongitude()), tc0Var.E.getMaxZoomLevel() - 4.0f));
            }
            if (tc0Var.f42868i0 != null) {
                tc0Var.T.setVisibility(0);
                qc0 qc0Var = tc0Var.f42886x;
                IMapsProvider.IMarker iMarker = tc0Var.f42868i0;
                HashMap map = qc0Var.f41633a;
                View view = (View) map.get(iMarker);
                if (view != null) {
                    qc0Var.removeView(view);
                    map.remove(iMarker);
                }
                tc0Var.f42868i0 = null;
                tc0Var.f42869j0 = null;
                tc0Var.f42870k0 = null;
            }
        }
    }

    public static void V(tc0 tc0Var, boolean z10, TLRPC.User user, int i10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            tc0Var.w0(i10, user, 0);
            return;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = tc0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.f22463id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location lastKnownLocation = LocationController.getInstance(tc0Var.currentAccount).getLastKnownLocation();
            tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
            tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i11 = sharingLocationInfo.lastSentProximityMeters;
            int i12 = sharingLocationInfo.proximityMeters;
            if (i11 != i12) {
                inputMedia.proximity_notification_radius = i12;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = LocationController.getHeading(lastKnownLocation);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i13 = inputMedia2.flags;
            inputMedia2.flags = i13 | 4;
            int i14 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : sharingLocationInfo.period + i10;
            sharingLocationInfo.period = i14;
            inputMedia2.period = i14;
            sharingLocationInfo.stopTime = i10 != Integer.MAX_VALUE ? sharingLocationInfo.stopTime + i10 : Integer.MAX_VALUE;
            inputMedia2.flags = i13 | 6;
            MessageObject messageObject = sharingLocationInfo.messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i14;
                tc0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
            }
            tc0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
        }
    }

    public static void W(tc0 tc0Var) {
        cc0 cc0Var;
        tc0Var.getLocationController().markLiveLoactionsAsRead(tc0Var.f42856a0);
        if (tc0Var.isPaused || (cc0Var = tc0Var.F0) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(cc0Var, 5000L);
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z10) {
        int y10;
        int iMin;
        FrameLayout.LayoutParams layoutParams;
        f2.o1 o1VarK = this.Q.K(0);
        if (o1VarK != null) {
            y10 = (int) o1VarK.f5789a.getY();
            iMin = Math.min(y10, 0) + this.D0;
        } else {
            y10 = -this.O.getMeasuredHeight();
            iMin = 0;
        }
        if (((FrameLayout.LayoutParams) this.O.getLayoutParams()) != null) {
            if (iMin <= 0) {
                if (this.G.getView().getVisibility() == 0) {
                    this.G.getView().setVisibility(4);
                    this.O.setVisibility(4);
                    qc0 qc0Var = this.f42886x;
                    if (qc0Var != null) {
                        qc0Var.setVisibility(4);
                    }
                }
            } else if (this.G.getView().getVisibility() == 4) {
                this.G.getView().setVisibility(0);
                this.O.setVisibility(0);
                qc0 qc0Var2 = this.f42886x;
                if (qc0Var2 != null) {
                    qc0Var2.setVisibility(0);
                }
            }
            this.O.setTranslationY(Math.min(0, y10));
            int i10 = -y10;
            int i11 = i10 / 2;
            this.G.getView().setTranslationY(Math.max(0, i11));
            qc0 qc0Var3 = this.f42886x;
            if (qc0Var3 != null) {
                qc0Var3.setTranslationY(Math.max(0, i11));
            }
            int measuredHeight = this.D0 - this.d.getMeasuredHeight();
            int i12 = this.C0;
            float fMin = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i12 == 0 || i12 == 1) ? 30 : 10)), i10);
            this.d.setTranslationY(fMin);
            this.f42859c.setTranslationY(fMin);
            lh.w3 w3Var = this.f42888y;
            if (w3Var != null) {
                w3Var.setTranslationY(fMin);
            }
            org.telegram.ui.Components.rk rkVar = this.f42862e;
            if (rkVar != null) {
                rkVar.f32198c = fMin;
                rkVar.setTranslationY(fMin + rkVar.f32197b);
            }
            View view = this.T;
            if (view != null) {
                int iDp = (iMin / 2) + (i10 - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f));
                this.f42882u0 = iDp;
                view.setTranslationY(iDp);
            }
            if (z10) {
                return;
            }
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
            qc0 qc0Var4 = this.f42886x;
            if (qc0Var4 == null || (layoutParams = (FrameLayout.LayoutParams) qc0Var4.getLayoutParams()) == null) {
                return;
            }
            if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.D0) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                this.f42886x.setLayoutParams(layoutParams);
            }
        }
    }

    public final void B0() {
        if (!this.f42873n0) {
            this.f42864f.setVisibility(8);
        } else {
            if (!this.f42875p0) {
                this.R.setEmptyView(this.f42864f);
                return;
            }
            this.R.setEmptyView(null);
            this.f42864f.setVisibility(8);
            this.R.setVisibility(8);
        }
    }

    public final void C0() {
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.f42857b == null) {
            return;
        }
        if (this.f42865f0) {
            z0(false, true);
            j0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.f42860c0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((nc0) arrayList.get(i12)).f40730b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                i11++;
            }
        }
        boolean z10 = this.f42861d0.f(getUserConfig().getClientUserId()) != null;
        if (this.f42880s0 != null && !z10) {
            i11++;
        }
        z0(i11 >= 2, true);
    }

    public final nc0 c0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.f42861d0;
        nc0 nc0Var = (nc0) hVar.f(fromChatId);
        if (nc0Var == null) {
            nc0Var = new nc0();
            nc0Var.f40730b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                nc0Var.f40731c = getMessagesController().getUser(Long.valueOf(nc0Var.f40730b.from_id.user_id));
                nc0Var.f40729a = nc0Var.f40730b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    nc0Var.f40731c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    nc0Var.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                nc0Var.f40729a = dialogId;
            }
            v0(nc0Var);
            try {
                IMapsProvider.IMarkerOptions iMarkerOptionsPosition = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap bitmapG0 = g0(nc0Var);
                if (bitmapG0 != null) {
                    iMarkerOptionsPosition.icon(bitmapG0);
                    iMarkerOptionsPosition.anchor(0.5f, 0.907f);
                    nc0Var.f40732e = this.E.addMarker(iMarkerOptionsPosition);
                    if (!UserObject.isUserSelf(nc0Var.f40731c)) {
                        IMapsProvider.IMarkerOptions iMarkerOptionsFlat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        iMarkerOptionsFlat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker iMarkerAddMarker = this.E.addMarker(iMarkerOptionsFlat);
                        nc0Var.f40733f = iMarkerAddMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            iMarkerAddMarker.setRotation(i10);
                            nc0Var.f40733f.setIcon(R.drawable.map_pin_cone2);
                            nc0Var.f40734g = true;
                        } else {
                            iMarkerAddMarker.setRotation(0);
                            nc0Var.f40733f.setIcon(R.drawable.map_pin_circle);
                            nc0Var.f40734g = false;
                        }
                    }
                    this.f42860c0.add(nc0Var);
                    hVar.k(nc0Var, nc0Var.f40729a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42856a0);
                    if (nc0Var.f40729a == getUserConfig().getClientUserId() && sharingLocationInfo != null && nc0Var.f40730b.f22401id == sharingLocationInfo.mid && (location = this.f42880s0) != null) {
                        nc0Var.f40732e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f42880s0.getLongitude()));
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        } else {
            nc0Var.f40730b = message;
            nc0Var.f40732e.setPosition(latLng);
            if (this.f42863e0 == nc0Var.f40729a) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(nc0Var.f40732e.getPosition()));
            }
        }
        org.telegram.ui.Components.sh0 sh0Var = this.N;
        if (sh0Var != null) {
            sh0Var.c(true);
        }
        C0();
        return nc0Var;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i10;
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.f42874o0 = false;
        this.f42873n0 = false;
        this.f42875p0 = false;
        hc0 hc0Var = this.P;
        if (hc0Var != null) {
            hc0Var.F();
        }
        mc0 mc0Var = this.S;
        if (mc0Var != null) {
            mc0Var.F();
        }
        if (this.f42883v0 != null) {
            Location location = new Location("network");
            this.f42881t0 = location;
            location.setLatitude(this.f42883v0.geo_point.lat);
            this.f42881t0.setLongitude(this.f42883v0.geo_point._long);
        } else if (this.f42887x0 != null) {
            Location location2 = new Location("network");
            this.f42881t0 = location2;
            location2.setLatitude(this.f42887x0.messageOwner.media.geo.lat);
            this.f42881t0.setLongitude(this.f42887x0.messageOwner.media.geo._long);
        }
        this.Y = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f23124h5;
        kVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.f23161j5;
        kVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.D(getThemedColor(i13), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new gc0(this));
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.f42883v0;
        int i14 = this.C0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.f42887x0;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f42886x = new qc0(this, context);
                    org.telegram.ui.ActionBar.v0 v0VarC = zVarN.c(0, R.drawable.outline_header_search, getResourceProvider());
                    v0VarC.F();
                    v0VarC.D = new db(this, 11);
                    this.f42884w = v0VarC;
                    v0VarC.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f42884w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f42884w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                org.telegram.ui.ActionBar.v0 v0VarC2 = zVarN.c(0, R.drawable.ic_ab_other, getResourceProvider());
                this.V = v0VarC2;
                v0VarC2.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
            } else {
                String str = this.f42887x0.messageOwner.media.title;
                if (str == null || str.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                }
                if (i14 != 3) {
                    org.telegram.ui.ActionBar.v0 v0VarC3 = zVarN.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.V = v0VarC3;
                    v0VarC3.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.f42856a0) && this.K0) {
                        this.V.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                    }
                    this.V.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                }
            }
        }
        rc0 rc0Var = new rc0(this, context);
        this.fragmentView = rc0Var;
        rc0Var.setBackgroundColor(getThemedColor(i12));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f42879s = drawableMutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f42879s.getPadding(rect);
        FrameLayout.LayoutParams layoutParams = (i14 == 0 || i14 == 1) ? new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top) : new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        layoutParams.gravity = 83;
        n0 n0Var = new n0(this, context, 11);
        this.O = n0Var;
        n0Var.setBackgroundDrawable(new af.g(n0()));
        MessageObject messageObject2 = this.f42887x0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.rk rkVar = new org.telegram.ui.Components.rk(context, 1);
            this.f42862e = rkVar;
            rkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int iDp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.xi);
            org.telegram.ui.Cells.z zVarI0 = org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, themedColor2, themedColor3, themedColor3);
            h7.b6.a(this.f42862e);
            this.f42862e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.f42862e.setOutlineProvider(gf.r0.f7055b);
            this.f42862e.setBackgroundDrawable(zVarI0);
            this.f42862e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.vi));
            this.f42862e.setTextSize(1, 14.0f);
            this.f42862e.setTypeface(AndroidUtilities.bold());
            this.f42862e.setGravity(17);
            this.f42862e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.O.addView(this.f42862e, h7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.f42862e.setText(LocaleController.getString(R.string.OpenInMaps));
                final int i15 = 5;
                this.f42862e.setOnClickListener(new View.OnClickListener(this) {

                    public final tc0 f45128b;

                    {
                        this.f45128b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z11;
                        int i16 = i15;
                        tc0 tc0Var = this.f45128b;
                        int i17 = 1;
                        switch (i16) {
                            case 0:
                                tc0Var.y0(false);
                                tc0Var.P.H(null, tc0Var.f42881t0, true);
                                tc0Var.f42890z0 = true;
                                tc0Var.x0();
                                break;
                            case 1:
                                tc0Var.d.M(null, null);
                                break;
                            case 2:
                                tc0.U(tc0Var);
                                break;
                            case 3:
                                tc0Var.f42863e0 = -1L;
                                tc0Var.f42889y0 = true;
                                if (tc0Var.j0()) {
                                    tc0Var.f42865f0 = true;
                                    tc0Var.z0(false, true);
                                }
                                break;
                            case 4:
                                if (tc0Var.getParentActivity() != null && tc0Var.f42880s0 != null && tc0Var.d0() && tc0Var.E != null) {
                                    lh.w3 w3Var = tc0Var.f42888y;
                                    if (w3Var != null) {
                                        w3Var.e(true);
                                    }
                                    int i18 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0);
                                    if (tc0Var.C) {
                                        tc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        tc0Var.f42859c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = tc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            tc0Var.K = null;
                                        }
                                        tc0Var.C = true;
                                        tc0Var.m0().k(0L, 25, 0, null, new cc0(tc0Var, i17), new a30(21, tc0Var, sharingLocationInfo));
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = tc0Var.K;
                                        if (iCircle2 == null) {
                                            tc0Var.e0(500);
                                        } else {
                                            tc0Var.L = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(tc0Var.f42856a0) ? tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.f42856a0)) : null;
                                        Activity parentActivity = tc0Var.getParentActivity();
                                        ac0 ac0Var = new ac0(tc0Var, i18);
                                        zr zrVar = new zr(23, tc0Var, user);
                                        cc0 cc0Var = new cc0(tc0Var, 2);
                                        org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(parentActivity);
                                        sh0Var.f32441a = null;
                                        sh0Var.d = -1;
                                        sh0Var.f32444e = false;
                                        sh0Var.f32445f = false;
                                        sh0Var.h = null;
                                        sh0Var.f32446n = new Rect();
                                        new Paint();
                                        sh0Var.f32449w = true;
                                        sh0Var.B = org.telegram.ui.Components.er.h;
                                        sh0Var.setWillNotDraw(false);
                                        sh0Var.M = cc0Var;
                                        sh0Var.f32451y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable drawableMutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false), PorterDuff.Mode.MULTIPLY));
                                        drawableMutate2.getPadding(rect2);
                                        int i19 = rect2.left;
                                        sh0Var.f32450x = i19;
                                        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(sh0Var.getContext());
                                        sh0Var.v = oh0Var;
                                        oh0Var.setBackgroundDrawable(drawableMutate2);
                                        oh0Var.setPadding(i19, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i19, 0);
                                        oh0Var.setVisibility(4);
                                        sh0Var.addView(oh0Var, 0, h7.z5.e(-1, -2, 80));
                                        sh0Var.K = LocaleController.getUseImperialSystemType();
                                        sh0Var.I = user;
                                        sh0Var.E = ac0Var;
                                        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(parentActivity, null);
                                        sh0Var.C = fc0Var;
                                        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        fc0Var.setItemCount(5);
                                        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(parentActivity, null);
                                        sh0Var.D = fc0Var2;
                                        fc0Var2.setItemCount(5);
                                        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(sh0Var, parentActivity);
                                        sh0Var.L = ph0Var;
                                        ph0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        ph0Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new kh.e(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        ph0Var.addView(linearLayout, h7.z5.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        sh0Var.G = textView2;
                                        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                        sh0Var.F = qh0Var;
                                        linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                                        fc0Var.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 0));
                                        fc0Var.setMinValue(0);
                                        fc0Var.setMaxValue(10);
                                        fc0Var.setWrapSelectorWheel(false);
                                        fc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(sh0Var, 1);
                                        fc0Var.setOnValueChangedListener(nh0Var);
                                        fc0Var2.setMinValue(0);
                                        fc0Var2.setMaxValue(10);
                                        fc0Var2.setWrapSelectorWheel(false);
                                        fc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
                                        fc0Var2.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 2));
                                        fc0Var2.setOnValueChangedListener(nh0Var);
                                        fc0Var.setValue(0);
                                        fc0Var2.setValue(6);
                                        ph0Var.addView(frameLayout2, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                        qh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        qh0Var.setGravity(17);
                                        qh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                        qh0Var.setTextSize(1, 14.0f);
                                        qh0Var.setMaxLines(2);
                                        qh0Var.setTypeface(AndroidUtilities.bold());
                                        qh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                        frameLayout2.addView(qh0Var, h7.z5.c(48.0f, -1));
                                        qh0Var.setOnClickListener(new org.telegram.ui.Components.q2(29, sh0Var, zrVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23283q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, h7.z5.c(48.0f, -1));
                                        oh0Var.addView(ph0Var, h7.z5.e(-1, -2, 51));
                                        tc0Var.N = sh0Var;
                                        ((FrameLayout) tc0Var.fragmentView).addView(sh0Var, h7.z5.c(-1.0f, -1));
                                        org.telegram.ui.Components.sh0 sh0Var2 = tc0Var.N;
                                        sh0Var2.f32447r = false;
                                        AnimatorSet animatorSet = sh0Var2.f32448s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            sh0Var2.f32448s = null;
                                        }
                                        org.telegram.ui.Components.oh0 oh0Var2 = sh0Var2.v;
                                        oh0Var2.measure(View.MeasureSpec.makeMeasureSpec((sh0Var2.f32450x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                        if (sh0Var2.f32447r) {
                                            z11 = true;
                                        } else {
                                            oh0Var2.setVisibility(0);
                                            if (sh0Var2.f32449w) {
                                                sh0Var2.setLayerType(2, null);
                                            }
                                            oh0Var2.setTranslationY(oh0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            sh0Var2.f32448s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(oh0Var2, (Property<org.telegram.ui.Components.oh0, Float>) View.TRANSLATION_Y, 0.0f));
                                            sh0Var2.f32448s.setDuration(400L);
                                            sh0Var2.f32448s.setStartDelay(20L);
                                            sh0Var2.f32448s.setInterpolator(sh0Var2.B);
                                            z11 = true;
                                            sh0Var2.f32448s.addListener(new org.telegram.ui.Components.rh0(sh0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            sh0Var2.f32448s.start();
                                        }
                                        sh0Var2.c(z11);
                                    }
                                    break;
                                }
                                break;
                            default:
                                tc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                                break;
                        }
                    }
                });
                this.f42862e.setTranslationX(0.0f);
            } else {
                this.f42862e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                final int i16 = 0;
                this.f42862e.setOnClickListener(new View.OnClickListener(this) {

                    public final tc0 f45128b;

                    {
                        this.f45128b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        boolean z11;
                        int i17 = i16;
                        tc0 tc0Var = this.f45128b;
                        int i18 = 1;
                        switch (i17) {
                            case 0:
                                tc0Var.y0(false);
                                tc0Var.P.H(null, tc0Var.f42881t0, true);
                                tc0Var.f42890z0 = true;
                                tc0Var.x0();
                                break;
                            case 1:
                                tc0Var.d.M(null, null);
                                break;
                            case 2:
                                tc0.U(tc0Var);
                                break;
                            case 3:
                                tc0Var.f42863e0 = -1L;
                                tc0Var.f42889y0 = true;
                                if (tc0Var.j0()) {
                                    tc0Var.f42865f0 = true;
                                    tc0Var.z0(false, true);
                                }
                                break;
                            case 4:
                                if (tc0Var.getParentActivity() != null && tc0Var.f42880s0 != null && tc0Var.d0() && tc0Var.E != null) {
                                    lh.w3 w3Var = tc0Var.f42888y;
                                    if (w3Var != null) {
                                        w3Var.e(true);
                                    }
                                    int i19 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0);
                                    if (tc0Var.C) {
                                        tc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        tc0Var.f42859c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = tc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            tc0Var.K = null;
                                        }
                                        tc0Var.C = true;
                                        tc0Var.m0().k(0L, 25, 0, null, new cc0(tc0Var, i18), new a30(21, tc0Var, sharingLocationInfo));
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = tc0Var.K;
                                        if (iCircle2 == null) {
                                            tc0Var.e0(500);
                                        } else {
                                            tc0Var.L = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(tc0Var.f42856a0) ? tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.f42856a0)) : null;
                                        Activity parentActivity = tc0Var.getParentActivity();
                                        ac0 ac0Var = new ac0(tc0Var, i19);
                                        zr zrVar = new zr(23, tc0Var, user);
                                        cc0 cc0Var = new cc0(tc0Var, 2);
                                        org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(parentActivity);
                                        sh0Var.f32441a = null;
                                        sh0Var.d = -1;
                                        sh0Var.f32444e = false;
                                        sh0Var.f32445f = false;
                                        sh0Var.h = null;
                                        sh0Var.f32446n = new Rect();
                                        new Paint();
                                        sh0Var.f32449w = true;
                                        sh0Var.B = org.telegram.ui.Components.er.h;
                                        sh0Var.setWillNotDraw(false);
                                        sh0Var.M = cc0Var;
                                        sh0Var.f32451y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable drawableMutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false), PorterDuff.Mode.MULTIPLY));
                                        drawableMutate2.getPadding(rect2);
                                        int i110 = rect2.left;
                                        sh0Var.f32450x = i110;
                                        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(sh0Var.getContext());
                                        sh0Var.v = oh0Var;
                                        oh0Var.setBackgroundDrawable(drawableMutate2);
                                        oh0Var.setPadding(i110, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i110, 0);
                                        oh0Var.setVisibility(4);
                                        sh0Var.addView(oh0Var, 0, h7.z5.e(-1, -2, 80));
                                        sh0Var.K = LocaleController.getUseImperialSystemType();
                                        sh0Var.I = user;
                                        sh0Var.E = ac0Var;
                                        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(parentActivity, null);
                                        sh0Var.C = fc0Var;
                                        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        fc0Var.setItemCount(5);
                                        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(parentActivity, null);
                                        sh0Var.D = fc0Var2;
                                        fc0Var2.setItemCount(5);
                                        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(sh0Var, parentActivity);
                                        sh0Var.L = ph0Var;
                                        ph0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        ph0Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new kh.e(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        ph0Var.addView(linearLayout, h7.z5.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        sh0Var.G = textView2;
                                        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                        sh0Var.F = qh0Var;
                                        linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                                        fc0Var.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 0));
                                        fc0Var.setMinValue(0);
                                        fc0Var.setMaxValue(10);
                                        fc0Var.setWrapSelectorWheel(false);
                                        fc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(sh0Var, 1);
                                        fc0Var.setOnValueChangedListener(nh0Var);
                                        fc0Var2.setMinValue(0);
                                        fc0Var2.setMaxValue(10);
                                        fc0Var2.setWrapSelectorWheel(false);
                                        fc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
                                        fc0Var2.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 2));
                                        fc0Var2.setOnValueChangedListener(nh0Var);
                                        fc0Var.setValue(0);
                                        fc0Var2.setValue(6);
                                        ph0Var.addView(frameLayout2, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                        qh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        qh0Var.setGravity(17);
                                        qh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                        qh0Var.setTextSize(1, 14.0f);
                                        qh0Var.setMaxLines(2);
                                        qh0Var.setTypeface(AndroidUtilities.bold());
                                        qh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                        frameLayout2.addView(qh0Var, h7.z5.c(48.0f, -1));
                                        qh0Var.setOnClickListener(new org.telegram.ui.Components.q2(29, sh0Var, zrVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23283q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, h7.z5.c(48.0f, -1));
                                        oh0Var.addView(ph0Var, h7.z5.e(-1, -2, 51));
                                        tc0Var.N = sh0Var;
                                        ((FrameLayout) tc0Var.fragmentView).addView(sh0Var, h7.z5.c(-1.0f, -1));
                                        org.telegram.ui.Components.sh0 sh0Var2 = tc0Var.N;
                                        sh0Var2.f32447r = false;
                                        AnimatorSet animatorSet = sh0Var2.f32448s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            sh0Var2.f32448s = null;
                                        }
                                        org.telegram.ui.Components.oh0 oh0Var2 = sh0Var2.v;
                                        oh0Var2.measure(View.MeasureSpec.makeMeasureSpec((sh0Var2.f32450x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                        if (sh0Var2.f32447r) {
                                            z11 = true;
                                        } else {
                                            oh0Var2.setVisibility(0);
                                            if (sh0Var2.f32449w) {
                                                sh0Var2.setLayerType(2, null);
                                            }
                                            oh0Var2.setTranslationY(oh0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            sh0Var2.f32448s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(oh0Var2, (Property<org.telegram.ui.Components.oh0, Float>) View.TRANSLATION_Y, 0.0f));
                                            sh0Var2.f32448s.setDuration(400L);
                                            sh0Var2.f32448s.setStartDelay(20L);
                                            sh0Var2.f32448s.setInterpolator(sh0Var2.B);
                                            z11 = true;
                                            sh0Var2.f32448s.addListener(new org.telegram.ui.Components.rh0(sh0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            sh0Var2.f32448s.start();
                                        }
                                        sh0Var2.c(z11);
                                    }
                                    break;
                                }
                                break;
                            default:
                                tc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                                break;
                        }
                    }
                });
            }
        }
        int i17 = org.telegram.ui.ActionBar.g6.ui;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i17), false, getResourceProvider());
        this.d = v0Var;
        v0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int iDp2 = AndroidUtilities.dp(40.0f);
        int i18 = org.telegram.ui.ActionBar.g6.wi;
        int themedColor4 = getThemedColor(i18);
        int i19 = org.telegram.ui.ActionBar.g6.xi;
        org.telegram.ui.Cells.z zVarH0 = org.telegram.ui.ActionBar.g6.h0(iDp2, themedColor4, getThemedColor(i19));
        h7.b6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.d;
        cg.l1 l1Var = gf.r0.f7054a;
        v0Var2.setOutlineProvider(l1Var);
        this.d.setBackgroundDrawable(zVarH0);
        this.d.setIcon(R.drawable.msg_map_type);
        this.O.addView(this.d, h7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i20 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) {

            public final tc0 f45128b;

            {
                this.f45128b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z11;
                int i110 = i20;
                tc0 tc0Var = this.f45128b;
                int i111 = 1;
                switch (i110) {
                    case 0:
                        tc0Var.y0(false);
                        tc0Var.P.H(null, tc0Var.f42881t0, true);
                        tc0Var.f42890z0 = true;
                        tc0Var.x0();
                        break;
                    case 1:
                        tc0Var.d.M(null, null);
                        break;
                    case 2:
                        tc0.U(tc0Var);
                        break;
                    case 3:
                        tc0Var.f42863e0 = -1L;
                        tc0Var.f42889y0 = true;
                        if (tc0Var.j0()) {
                            tc0Var.f42865f0 = true;
                            tc0Var.z0(false, true);
                        }
                        break;
                    case 4:
                        if (tc0Var.getParentActivity() != null && tc0Var.f42880s0 != null && tc0Var.d0() && tc0Var.E != null) {
                            lh.w3 w3Var = tc0Var.f42888y;
                            if (w3Var != null) {
                                w3Var.e(true);
                            }
                            int i112 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0);
                            if (tc0Var.C) {
                                tc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                tc0Var.f42859c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = tc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    tc0Var.K = null;
                                }
                                tc0Var.C = true;
                                tc0Var.m0().k(0L, 25, 0, null, new cc0(tc0Var, i111), new a30(21, tc0Var, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = tc0Var.K;
                                if (iCircle2 == null) {
                                    tc0Var.e0(500);
                                } else {
                                    tc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(tc0Var.f42856a0) ? tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.f42856a0)) : null;
                                Activity parentActivity = tc0Var.getParentActivity();
                                ac0 ac0Var = new ac0(tc0Var, i112);
                                zr zrVar = new zr(23, tc0Var, user);
                                cc0 cc0Var = new cc0(tc0Var, 2);
                                org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(parentActivity);
                                sh0Var.f32441a = null;
                                sh0Var.d = -1;
                                sh0Var.f32444e = false;
                                sh0Var.f32445f = false;
                                sh0Var.h = null;
                                sh0Var.f32446n = new Rect();
                                new Paint();
                                sh0Var.f32449w = true;
                                sh0Var.B = org.telegram.ui.Components.er.h;
                                sh0Var.setWillNotDraw(false);
                                sh0Var.M = cc0Var;
                                sh0Var.f32451y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable drawableMutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false), PorterDuff.Mode.MULTIPLY));
                                drawableMutate2.getPadding(rect2);
                                int i113 = rect2.left;
                                sh0Var.f32450x = i113;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(sh0Var.getContext());
                                sh0Var.v = oh0Var;
                                oh0Var.setBackgroundDrawable(drawableMutate2);
                                oh0Var.setPadding(i113, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i113, 0);
                                oh0Var.setVisibility(4);
                                sh0Var.addView(oh0Var, 0, h7.z5.e(-1, -2, 80));
                                sh0Var.K = LocaleController.getUseImperialSystemType();
                                sh0Var.I = user;
                                sh0Var.E = ac0Var;
                                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.C = fc0Var;
                                fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                fc0Var.setItemCount(5);
                                org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.D = fc0Var2;
                                fc0Var2.setItemCount(5);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(sh0Var, parentActivity);
                                sh0Var.L = ph0Var;
                                ph0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ph0Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 20.0f);
                                frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new kh.e(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ph0Var.addView(linearLayout, h7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                sh0Var.G = textView2;
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                sh0Var.F = qh0Var;
                                linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                                fc0Var.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 0));
                                fc0Var.setMinValue(0);
                                fc0Var.setMaxValue(10);
                                fc0Var.setWrapSelectorWheel(false);
                                fc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(sh0Var, 1);
                                fc0Var.setOnValueChangedListener(nh0Var);
                                fc0Var2.setMinValue(0);
                                fc0Var2.setMaxValue(10);
                                fc0Var2.setWrapSelectorWheel(false);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
                                fc0Var2.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 2));
                                fc0Var2.setOnValueChangedListener(nh0Var);
                                fc0Var.setValue(0);
                                fc0Var2.setValue(6);
                                ph0Var.addView(frameLayout2, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                qh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                qh0Var.setGravity(17);
                                qh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                qh0Var.setTextSize(1, 14.0f);
                                qh0Var.setMaxLines(2);
                                qh0Var.setTypeface(AndroidUtilities.bold());
                                qh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(qh0Var, h7.z5.c(48.0f, -1));
                                qh0Var.setOnClickListener(new org.telegram.ui.Components.q2(29, sh0Var, zrVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23283q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, h7.z5.c(48.0f, -1));
                                oh0Var.addView(ph0Var, h7.z5.e(-1, -2, 51));
                                tc0Var.N = sh0Var;
                                ((FrameLayout) tc0Var.fragmentView).addView(sh0Var, h7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.sh0 sh0Var2 = tc0Var.N;
                                sh0Var2.f32447r = false;
                                AnimatorSet animatorSet = sh0Var2.f32448s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    sh0Var2.f32448s = null;
                                }
                                org.telegram.ui.Components.oh0 oh0Var2 = sh0Var2.v;
                                oh0Var2.measure(View.MeasureSpec.makeMeasureSpec((sh0Var2.f32450x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                if (sh0Var2.f32447r) {
                                    z11 = true;
                                } else {
                                    oh0Var2.setVisibility(0);
                                    if (sh0Var2.f32449w) {
                                        sh0Var2.setLayerType(2, null);
                                    }
                                    oh0Var2.setTranslationY(oh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    sh0Var2.f32448s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(oh0Var2, (Property<org.telegram.ui.Components.oh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    sh0Var2.f32448s.setDuration(400L);
                                    sh0Var2.f32448s.setStartDelay(20L);
                                    sh0Var2.f32448s.setInterpolator(sh0Var2.B);
                                    z11 = true;
                                    sh0Var2.f32448s.addListener(new org.telegram.ui.Components.rh0(sh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    sh0Var2.f32448s.start();
                                }
                                sh0Var2.c(z11);
                            }
                            break;
                        }
                        break;
                    default:
                        tc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        break;
                }
            }
        });
        this.d.setDelegate(new ac0(this, 0));
        this.f42855a = new ImageView(context);
        org.telegram.ui.Cells.z zVarH1 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        h7.b6.a(this.f42855a);
        this.f42855a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42855a.setOutlineProvider(l1Var);
        this.f42855a.setBackground(zVarH1);
        this.f42855a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f42855a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f42855a;
        int i21 = org.telegram.ui.ActionBar.g6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i21), mode));
        this.f42855a.setTag(Integer.valueOf(i21));
        this.f42855a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        layoutParamsD.bottomMargin = (layoutParams.height - rect.top) + layoutParamsD.bottomMargin;
        this.O.addView(this.f42855a, layoutParamsD);
        final int i22 = 2;
        this.f42855a.setOnClickListener(new View.OnClickListener(this) {

            public final tc0 f45128b;

            {
                this.f45128b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z11;
                int i110 = i22;
                tc0 tc0Var = this.f45128b;
                int i111 = 1;
                switch (i110) {
                    case 0:
                        tc0Var.y0(false);
                        tc0Var.P.H(null, tc0Var.f42881t0, true);
                        tc0Var.f42890z0 = true;
                        tc0Var.x0();
                        break;
                    case 1:
                        tc0Var.d.M(null, null);
                        break;
                    case 2:
                        tc0.U(tc0Var);
                        break;
                    case 3:
                        tc0Var.f42863e0 = -1L;
                        tc0Var.f42889y0 = true;
                        if (tc0Var.j0()) {
                            tc0Var.f42865f0 = true;
                            tc0Var.z0(false, true);
                        }
                        break;
                    case 4:
                        if (tc0Var.getParentActivity() != null && tc0Var.f42880s0 != null && tc0Var.d0() && tc0Var.E != null) {
                            lh.w3 w3Var = tc0Var.f42888y;
                            if (w3Var != null) {
                                w3Var.e(true);
                            }
                            int i112 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0);
                            if (tc0Var.C) {
                                tc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                tc0Var.f42859c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = tc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    tc0Var.K = null;
                                }
                                tc0Var.C = true;
                                tc0Var.m0().k(0L, 25, 0, null, new cc0(tc0Var, i111), new a30(21, tc0Var, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = tc0Var.K;
                                if (iCircle2 == null) {
                                    tc0Var.e0(500);
                                } else {
                                    tc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(tc0Var.f42856a0) ? tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.f42856a0)) : null;
                                Activity parentActivity = tc0Var.getParentActivity();
                                ac0 ac0Var = new ac0(tc0Var, i112);
                                zr zrVar = new zr(23, tc0Var, user);
                                cc0 cc0Var = new cc0(tc0Var, 2);
                                org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(parentActivity);
                                sh0Var.f32441a = null;
                                sh0Var.d = -1;
                                sh0Var.f32444e = false;
                                sh0Var.f32445f = false;
                                sh0Var.h = null;
                                sh0Var.f32446n = new Rect();
                                new Paint();
                                sh0Var.f32449w = true;
                                sh0Var.B = org.telegram.ui.Components.er.h;
                                sh0Var.setWillNotDraw(false);
                                sh0Var.M = cc0Var;
                                sh0Var.f32451y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable drawableMutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false), PorterDuff.Mode.MULTIPLY));
                                drawableMutate2.getPadding(rect2);
                                int i113 = rect2.left;
                                sh0Var.f32450x = i113;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(sh0Var.getContext());
                                sh0Var.v = oh0Var;
                                oh0Var.setBackgroundDrawable(drawableMutate2);
                                oh0Var.setPadding(i113, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i113, 0);
                                oh0Var.setVisibility(4);
                                sh0Var.addView(oh0Var, 0, h7.z5.e(-1, -2, 80));
                                sh0Var.K = LocaleController.getUseImperialSystemType();
                                sh0Var.I = user;
                                sh0Var.E = ac0Var;
                                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.C = fc0Var;
                                fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                fc0Var.setItemCount(5);
                                org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.D = fc0Var2;
                                fc0Var2.setItemCount(5);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(sh0Var, parentActivity);
                                sh0Var.L = ph0Var;
                                ph0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ph0Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 20.0f);
                                frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new kh.e(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ph0Var.addView(linearLayout, h7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                sh0Var.G = textView2;
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                sh0Var.F = qh0Var;
                                linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                                fc0Var.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 0));
                                fc0Var.setMinValue(0);
                                fc0Var.setMaxValue(10);
                                fc0Var.setWrapSelectorWheel(false);
                                fc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(sh0Var, 1);
                                fc0Var.setOnValueChangedListener(nh0Var);
                                fc0Var2.setMinValue(0);
                                fc0Var2.setMaxValue(10);
                                fc0Var2.setWrapSelectorWheel(false);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
                                fc0Var2.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 2));
                                fc0Var2.setOnValueChangedListener(nh0Var);
                                fc0Var.setValue(0);
                                fc0Var2.setValue(6);
                                ph0Var.addView(frameLayout2, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                qh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                qh0Var.setGravity(17);
                                qh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                qh0Var.setTextSize(1, 14.0f);
                                qh0Var.setMaxLines(2);
                                qh0Var.setTypeface(AndroidUtilities.bold());
                                qh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(qh0Var, h7.z5.c(48.0f, -1));
                                qh0Var.setOnClickListener(new org.telegram.ui.Components.q2(29, sh0Var, zrVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23283q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, h7.z5.c(48.0f, -1));
                                oh0Var.addView(ph0Var, h7.z5.e(-1, -2, 51));
                                tc0Var.N = sh0Var;
                                ((FrameLayout) tc0Var.fragmentView).addView(sh0Var, h7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.sh0 sh0Var2 = tc0Var.N;
                                sh0Var2.f32447r = false;
                                AnimatorSet animatorSet = sh0Var2.f32448s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    sh0Var2.f32448s = null;
                                }
                                org.telegram.ui.Components.oh0 oh0Var2 = sh0Var2.v;
                                oh0Var2.measure(View.MeasureSpec.makeMeasureSpec((sh0Var2.f32450x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                if (sh0Var2.f32447r) {
                                    z11 = true;
                                } else {
                                    oh0Var2.setVisibility(0);
                                    if (sh0Var2.f32449w) {
                                        sh0Var2.setLayerType(2, null);
                                    }
                                    oh0Var2.setTranslationY(oh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    sh0Var2.f32448s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(oh0Var2, (Property<org.telegram.ui.Components.oh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    sh0Var2.f32448s.setDuration(400L);
                                    sh0Var2.f32448s.setStartDelay(20L);
                                    sh0Var2.f32448s.setInterpolator(sh0Var2.B);
                                    z11 = true;
                                    sh0Var2.f32448s.addListener(new org.telegram.ui.Components.rh0(sh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    sh0Var2.f32448s.start();
                                }
                                sh0Var2.c(z11);
                            }
                            break;
                        }
                        break;
                    default:
                        tc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f42857b = textView;
        textView.setGravity(17);
        this.f42857b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42857b.setTextSize(1, 15.0f);
        this.f42857b.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourceProvider));
        this.f42857b.setTypeface(AndroidUtilities.bold());
        this.f42857b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f42857b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.f42857b.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i18), getThemedColor(i19), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams layoutParamsD2 = h7.z5.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        layoutParamsD2.bottomMargin = (layoutParams.height - rect.top) + layoutParamsD2.bottomMargin;
        this.O.addView(this.f42857b, layoutParamsD2);
        h7.b6.a(this.f42857b);
        final int i23 = 3;
        this.f42857b.setOnClickListener(new View.OnClickListener(this) {

            public final tc0 f45128b;

            {
                this.f45128b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z11;
                int i110 = i23;
                tc0 tc0Var = this.f45128b;
                int i111 = 1;
                switch (i110) {
                    case 0:
                        tc0Var.y0(false);
                        tc0Var.P.H(null, tc0Var.f42881t0, true);
                        tc0Var.f42890z0 = true;
                        tc0Var.x0();
                        break;
                    case 1:
                        tc0Var.d.M(null, null);
                        break;
                    case 2:
                        tc0.U(tc0Var);
                        break;
                    case 3:
                        tc0Var.f42863e0 = -1L;
                        tc0Var.f42889y0 = true;
                        if (tc0Var.j0()) {
                            tc0Var.f42865f0 = true;
                            tc0Var.z0(false, true);
                        }
                        break;
                    case 4:
                        if (tc0Var.getParentActivity() != null && tc0Var.f42880s0 != null && tc0Var.d0() && tc0Var.E != null) {
                            lh.w3 w3Var = tc0Var.f42888y;
                            if (w3Var != null) {
                                w3Var.e(true);
                            }
                            int i112 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0);
                            if (tc0Var.C) {
                                tc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                tc0Var.f42859c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = tc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    tc0Var.K = null;
                                }
                                tc0Var.C = true;
                                tc0Var.m0().k(0L, 25, 0, null, new cc0(tc0Var, i111), new a30(21, tc0Var, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = tc0Var.K;
                                if (iCircle2 == null) {
                                    tc0Var.e0(500);
                                } else {
                                    tc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(tc0Var.f42856a0) ? tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.f42856a0)) : null;
                                Activity parentActivity = tc0Var.getParentActivity();
                                ac0 ac0Var = new ac0(tc0Var, i112);
                                zr zrVar = new zr(23, tc0Var, user);
                                cc0 cc0Var = new cc0(tc0Var, 2);
                                org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(parentActivity);
                                sh0Var.f32441a = null;
                                sh0Var.d = -1;
                                sh0Var.f32444e = false;
                                sh0Var.f32445f = false;
                                sh0Var.h = null;
                                sh0Var.f32446n = new Rect();
                                new Paint();
                                sh0Var.f32449w = true;
                                sh0Var.B = org.telegram.ui.Components.er.h;
                                sh0Var.setWillNotDraw(false);
                                sh0Var.M = cc0Var;
                                sh0Var.f32451y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable drawableMutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false), PorterDuff.Mode.MULTIPLY));
                                drawableMutate2.getPadding(rect2);
                                int i113 = rect2.left;
                                sh0Var.f32450x = i113;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(sh0Var.getContext());
                                sh0Var.v = oh0Var;
                                oh0Var.setBackgroundDrawable(drawableMutate2);
                                oh0Var.setPadding(i113, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i113, 0);
                                oh0Var.setVisibility(4);
                                sh0Var.addView(oh0Var, 0, h7.z5.e(-1, -2, 80));
                                sh0Var.K = LocaleController.getUseImperialSystemType();
                                sh0Var.I = user;
                                sh0Var.E = ac0Var;
                                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.C = fc0Var;
                                fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                fc0Var.setItemCount(5);
                                org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.D = fc0Var2;
                                fc0Var2.setItemCount(5);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(sh0Var, parentActivity);
                                sh0Var.L = ph0Var;
                                ph0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ph0Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y1.s(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new kh.e(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ph0Var.addView(linearLayout, h7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                sh0Var.G = textView3;
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                sh0Var.F = qh0Var;
                                linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                                fc0Var.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 0));
                                fc0Var.setMinValue(0);
                                fc0Var.setMaxValue(10);
                                fc0Var.setWrapSelectorWheel(false);
                                fc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(sh0Var, 1);
                                fc0Var.setOnValueChangedListener(nh0Var);
                                fc0Var2.setMinValue(0);
                                fc0Var2.setMaxValue(10);
                                fc0Var2.setWrapSelectorWheel(false);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
                                fc0Var2.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 2));
                                fc0Var2.setOnValueChangedListener(nh0Var);
                                fc0Var.setValue(0);
                                fc0Var2.setValue(6);
                                ph0Var.addView(frameLayout2, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                qh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                qh0Var.setGravity(17);
                                qh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                qh0Var.setTextSize(1, 14.0f);
                                qh0Var.setMaxLines(2);
                                qh0Var.setTypeface(AndroidUtilities.bold());
                                qh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(qh0Var, h7.z5.c(48.0f, -1));
                                qh0Var.setOnClickListener(new org.telegram.ui.Components.q2(29, sh0Var, zrVar));
                                textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView3.setGravity(17);
                                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23283q5, false));
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout2.addView(textView3, h7.z5.c(48.0f, -1));
                                oh0Var.addView(ph0Var, h7.z5.e(-1, -2, 51));
                                tc0Var.N = sh0Var;
                                ((FrameLayout) tc0Var.fragmentView).addView(sh0Var, h7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.sh0 sh0Var2 = tc0Var.N;
                                sh0Var2.f32447r = false;
                                AnimatorSet animatorSet = sh0Var2.f32448s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    sh0Var2.f32448s = null;
                                }
                                org.telegram.ui.Components.oh0 oh0Var2 = sh0Var2.v;
                                oh0Var2.measure(View.MeasureSpec.makeMeasureSpec((sh0Var2.f32450x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                if (sh0Var2.f32447r) {
                                    z11 = true;
                                } else {
                                    oh0Var2.setVisibility(0);
                                    if (sh0Var2.f32449w) {
                                        sh0Var2.setLayerType(2, null);
                                    }
                                    oh0Var2.setTranslationY(oh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    sh0Var2.f32448s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(oh0Var2, (Property<org.telegram.ui.Components.oh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    sh0Var2.f32448s.setDuration(400L);
                                    sh0Var2.f32448s.setStartDelay(20L);
                                    sh0Var2.f32448s.setInterpolator(sh0Var2.B);
                                    z11 = true;
                                    sh0Var2.f32448s.addListener(new org.telegram.ui.Components.rh0(sh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    sh0Var2.f32448s.start();
                                }
                                sh0Var2.c(z11);
                            }
                            break;
                        }
                        break;
                    default:
                        tc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        break;
                }
            }
        });
        z0(false, false);
        this.f42859c = new ImageView(context);
        org.telegram.ui.Cells.z zVarH2 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        h7.b6.a(this.f42859c);
        this.f42859c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f42859c.setOutlineProvider(l1Var);
        this.f42859c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), mode));
        this.f42859c.setBackgroundDrawable(zVarH2);
        this.f42859c.setScaleType(scaleType);
        this.f42859c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.O.addView(this.f42859c, h7.z5.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        final int i24 = 4;
        this.f42859c.setOnClickListener(new View.OnClickListener(this) {

            public final tc0 f45128b;

            {
                this.f45128b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z11;
                int i110 = i24;
                tc0 tc0Var = this.f45128b;
                int i111 = 1;
                switch (i110) {
                    case 0:
                        tc0Var.y0(false);
                        tc0Var.P.H(null, tc0Var.f42881t0, true);
                        tc0Var.f42890z0 = true;
                        tc0Var.x0();
                        break;
                    case 1:
                        tc0Var.d.M(null, null);
                        break;
                    case 2:
                        tc0.U(tc0Var);
                        break;
                    case 3:
                        tc0Var.f42863e0 = -1L;
                        tc0Var.f42889y0 = true;
                        if (tc0Var.j0()) {
                            tc0Var.f42865f0 = true;
                            tc0Var.z0(false, true);
                        }
                        break;
                    case 4:
                        if (tc0Var.getParentActivity() != null && tc0Var.f42880s0 != null && tc0Var.d0() && tc0Var.E != null) {
                            lh.w3 w3Var = tc0Var.f42888y;
                            if (w3Var != null) {
                                w3Var.e(true);
                            }
                            int i112 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0);
                            if (tc0Var.C) {
                                tc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                tc0Var.f42859c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = tc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    tc0Var.K = null;
                                }
                                tc0Var.C = true;
                                tc0Var.m0().k(0L, 25, 0, null, new cc0(tc0Var, i111), new a30(21, tc0Var, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = tc0Var.K;
                                if (iCircle2 == null) {
                                    tc0Var.e0(500);
                                } else {
                                    tc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(tc0Var.f42856a0) ? tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.f42856a0)) : null;
                                Activity parentActivity = tc0Var.getParentActivity();
                                ac0 ac0Var = new ac0(tc0Var, i112);
                                zr zrVar = new zr(23, tc0Var, user);
                                cc0 cc0Var = new cc0(tc0Var, 2);
                                org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(parentActivity);
                                sh0Var.f32441a = null;
                                sh0Var.d = -1;
                                sh0Var.f32444e = false;
                                sh0Var.f32445f = false;
                                sh0Var.h = null;
                                sh0Var.f32446n = new Rect();
                                new Paint();
                                sh0Var.f32449w = true;
                                sh0Var.B = org.telegram.ui.Components.er.h;
                                sh0Var.setWillNotDraw(false);
                                sh0Var.M = cc0Var;
                                sh0Var.f32451y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable drawableMutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false), PorterDuff.Mode.MULTIPLY));
                                drawableMutate2.getPadding(rect2);
                                int i113 = rect2.left;
                                sh0Var.f32450x = i113;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(sh0Var.getContext());
                                sh0Var.v = oh0Var;
                                oh0Var.setBackgroundDrawable(drawableMutate2);
                                oh0Var.setPadding(i113, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i113, 0);
                                oh0Var.setVisibility(4);
                                sh0Var.addView(oh0Var, 0, h7.z5.e(-1, -2, 80));
                                sh0Var.K = LocaleController.getUseImperialSystemType();
                                sh0Var.I = user;
                                sh0Var.E = ac0Var;
                                org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.C = fc0Var;
                                fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                fc0Var.setItemCount(5);
                                org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(parentActivity, null);
                                sh0Var.D = fc0Var2;
                                fc0Var2.setItemCount(5);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(sh0Var, parentActivity);
                                sh0Var.L = ph0Var;
                                ph0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ph0Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y1.s(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new kh.e(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ph0Var.addView(linearLayout, h7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                sh0Var.G = textView3;
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                sh0Var.F = qh0Var;
                                linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
                                fc0Var.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 0));
                                fc0Var.setMinValue(0);
                                fc0Var.setMaxValue(10);
                                fc0Var.setWrapSelectorWheel(false);
                                fc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(sh0Var, 1);
                                fc0Var.setOnValueChangedListener(nh0Var);
                                fc0Var2.setMinValue(0);
                                fc0Var2.setMaxValue(10);
                                fc0Var2.setWrapSelectorWheel(false);
                                fc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
                                fc0Var2.setFormatter(new org.telegram.ui.Components.nh0(sh0Var, 2));
                                fc0Var2.setOnValueChangedListener(nh0Var);
                                fc0Var.setValue(0);
                                fc0Var2.setValue(6);
                                ph0Var.addView(frameLayout2, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                qh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                qh0Var.setGravity(17);
                                qh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                qh0Var.setTextSize(1, 14.0f);
                                qh0Var.setMaxLines(2);
                                qh0Var.setTypeface(AndroidUtilities.bold());
                                qh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(qh0Var, h7.z5.c(48.0f, -1));
                                qh0Var.setOnClickListener(new org.telegram.ui.Components.q2(29, sh0Var, zrVar));
                                textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView3.setGravity(17);
                                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23283q5, false));
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout2.addView(textView3, h7.z5.c(48.0f, -1));
                                oh0Var.addView(ph0Var, h7.z5.e(-1, -2, 51));
                                tc0Var.N = sh0Var;
                                ((FrameLayout) tc0Var.fragmentView).addView(sh0Var, h7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.sh0 sh0Var2 = tc0Var.N;
                                sh0Var2.f32447r = false;
                                AnimatorSet animatorSet = sh0Var2.f32448s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    sh0Var2.f32448s = null;
                                }
                                org.telegram.ui.Components.oh0 oh0Var2 = sh0Var2.v;
                                oh0Var2.measure(View.MeasureSpec.makeMeasureSpec((sh0Var2.f32450x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                if (sh0Var2.f32447r) {
                                    z11 = true;
                                } else {
                                    oh0Var2.setVisibility(0);
                                    if (sh0Var2.f32449w) {
                                        sh0Var2.setLayerType(2, null);
                                    }
                                    oh0Var2.setTranslationY(oh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    sh0Var2.f32448s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(oh0Var2, (Property<org.telegram.ui.Components.oh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    sh0Var2.f32448s.setDuration(400L);
                                    sh0Var2.f32448s.setStartDelay(20L);
                                    sh0Var2.f32448s.setInterpolator(sh0Var2.B);
                                    z11 = true;
                                    sh0Var2.f32448s.addListener(new org.telegram.ui.Components.rh0(sh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    sh0Var2.f32448s.start();
                                }
                                sh0Var2.c(z11);
                            }
                            break;
                        }
                        break;
                    default:
                        tc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        break;
                }
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.f42856a0) ? getMessagesController().getChat(Long.valueOf(-this.f42856a0)) : null;
        MessageObject messageObject3 = this.f42887x0;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.f42887x0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.f42859c.setVisibility(8);
            this.f42859c.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42856a0);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.f42856a0) && this.f42887x0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f42859c.setVisibility(4);
                    this.f42859c.setAlpha(0.0f);
                    this.f42859c.setScaleX(0.4f);
                    this.f42859c.setScaleY(0.4f);
                }
                this.f42859c.setImageResource(R.drawable.msg_location_alert);
            } else {
                this.f42859c.setImageResource(R.drawable.msg_location_alert2);
            }
        }
        lh.w3 w3Var = new lh.w3(context, 1);
        this.f42888y = w3Var;
        w3Var.setLayerType(2, null);
        lh.w3 w3Var2 = this.f42888y;
        w3Var2.d = 4000L;
        w3Var2.m(1.0f, -25.0f);
        this.f42888y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.O.addView(this.f42888y, h7.z5.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42864f = linearLayout;
        linearLayout.setOrientation(1);
        this.f42864f.setGravity(1);
        this.f42864f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f42864f.setVisibility(8);
        rc0Var.addView(this.f42864f, h7.z5.c(-1.0f, -1));
        this.f42864f.setOnTouchListener(new kh.e(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.W5), mode));
        this.f42864f.addView(this.h, h7.z5.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.f42872n = textView2;
        int i25 = org.telegram.ui.ActionBar.g6.X5;
        textView2.setTextColor(getThemedColor(i25));
        this.f42872n.setGravity(17);
        this.f42872n.setTypeface(AndroidUtilities.bold());
        this.f42872n.setTextSize(1, 17.0f);
        this.f42872n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView textViewI = org.telegram.ui.Cells.pa.i(this.f42864f, this.f42872n, h7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f42877r = textViewI;
        textViewI.setTextColor(getThemedColor(i25));
        this.f42877r.setGravity(17);
        this.f42877r.setTextSize(1, 15.0f);
        this.f42877r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f42864f.addView(this.f42877r, h7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.Q = zk0Var;
        hc0 hc0Var2 = new hc0(this, context, this.C0, this.f42856a0, getResourceProvider(), this.A, i14 == 8);
        this.P = hc0Var2;
        zk0Var.setAdapter(hc0Var2);
        org.telegram.ui.Components.zk0 zk0Var2 = this.Q;
        f2.k0 k0Var = new f2.k0(1, false);
        this.U = k0Var;
        zk0Var2.setLayoutManager(k0Var);
        if (this.I0 != null) {
            this.H0 = new org.telegram.ui.Cells.s3(context, this.resourceProvider);
            jc0 jc0Var = new jc0(this, context, new org.telegram.ui.Components.zt0(this), this, new ic0(this), getResourceProvider());
            this.G0 = jc0Var;
            jc0Var.setBackgroundColor(getThemedColor(i12));
            this.G0.addView(this.H0, h7.z5.e(-1, 32, 55));
            this.P.f45816d0 = this.G0;
            this.Q.setOverScrollMode(2);
            f2.l lVar = new f2.l();
            z10 = false;
            lVar.f5819m = false;
            lVar.C = false;
            lVar.o(org.telegram.ui.Components.er.h);
            lVar.n(350L);
            this.Q.setItemAnimator(lVar);
        } else {
            z10 = false;
        }
        this.P.O(this.Y, z10);
        this.P.getClass();
        this.Q.setVerticalScrollBarEnabled(z10);
        rc0Var.addView(this.Q, h7.z5.e(-1, -1, 51));
        MessageObject messageObject4 = this.f42887x0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            hc0 hc0Var3 = this.P;
            hc0Var3.M = this.f42887x0.messageOwner.media.address;
            hc0Var3.Q();
        }
        this.Q.setOnScrollListener(new kc0(this));
        ((f2.l) this.Q.getItemAnimator()).C = false;
        this.Q.setOnItemLongClickListener(new zr(21, this, context));
        this.Q.setOnItemClickListener(new i(this, 16));
        hc0 hc0Var4 = this.P;
        long j10 = this.f42856a0;
        ac0 ac0Var = new ac0(this, 5);
        hc0Var4.D = j10;
        hc0Var4.f45748y = ac0Var;
        hc0Var4.P(this.D0);
        rc0Var.addView(this.O, h7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView iMapViewOnCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = iMapViewOnCreateMapView;
        iMapViewOnCreateMapView.getView().setAlpha(0.0f);
        this.G.setOnDispatchTouchEventInterceptor(new ac0(this, 6));
        this.G.setOnInterceptTouchEventInterceptor(new ac0(this, 7));
        this.G.setOnLayoutListener(new cc0(this, 5));
        new Thread(new dc0(this, this.G, 1)).start();
        MessageObject messageObject5 = this.f42887x0;
        if (messageObject5 == null && this.f42883v0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f42856a0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.O.addView(frameLayout, h7.z5.e(62, 76, 49));
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                n9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                n9Var.e(chat, new org.telegram.ui.Components.y8(chat));
                frameLayout.addView(n9Var, h7.z5.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.T = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.T == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.O.addView(imageView4, h7.z5.e(28, 48, 49));
                this.T = imageView4;
            }
            org.telegram.ui.Components.zk0 zk0Var3 = new org.telegram.ui.Components.zk0(context, null);
            this.R = zk0Var3;
            zk0Var3.setVisibility(8);
            i11 = 0;
            this.R.setLayoutManager(new f2.k0(1, false));
            mc0 mc0Var2 = new mc0(this, context, getResourceProvider(), i10 == 8);
            this.S = mc0Var2;
            ac0 ac0Var2 = new ac0(this, 8);
            mc0Var2.D = 0L;
            mc0Var2.f45748y = ac0Var2;
            rc0Var.addView(this.R, h7.z5.e(-1, -1, 51));
            this.R.setOnScrollListener(new m3(this, 18));
            this.R.setOnItemClickListener(new cg.x0(20, this, zVarN));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f42883v0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f42883v0;
                if (tL_channelLocation2 != null) {
                    this.P.T = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.f42887x0;
                    if (messageObject6 != null) {
                        hc0 hc0Var5 = this.P;
                        hc0Var5.S = messageObject6;
                        hc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.f42887x0;
        if (messageObject7 != null && i10 == 6) {
            hc0 hc0Var6 = this.P;
            hc0Var6.S = messageObject7;
            hc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.B;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.O.addView(undoViewArr[i11], h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        jh.a3 a3Var = new jh.a3(this, context, rect);
        this.v = a3Var;
        a3Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.O.addView(this.v, layoutParams);
        if (this.f42887x0 == null && this.f42883v0 == null && this.f42885w0 != null) {
            this.f42889y0 = true;
            ImageView imageView5 = this.f42855a;
            int i26 = org.telegram.ui.ActionBar.g6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i26), PorterDuff.Mode.MULTIPLY));
            this.f42855a.setTag(Integer.valueOf(i26));
        }
        rc0Var.addView(this.actionBar);
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
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new ac0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f22702a);
                    return false;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return true;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        hc0 hc0Var;
        hc0 hc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.Y = false;
            hc0 hc0Var3 = this.P;
            if (hc0Var3 != null) {
                hc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.locationPermissionDenied) {
            this.Y = true;
            hc0 hc0Var4 = this.P;
            if (hc0Var4 != null) {
                hc0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.liveLocationsChanged) {
            hc0 hc0Var5 = this.P;
            if (hc0Var5 != null) {
                hc0Var5.l();
            }
            C0();
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.f42856a0 || this.f42887x0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i12);
                if (messageObject.isLiveLocation()) {
                    c0(messageObject.messageOwner);
                    z10 = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.f42859c.setImageResource(R.drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.K;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.K = null;
                    }
                }
            }
            if (!z10 || (hc0Var2 = this.P) == null) {
                return;
            }
            hc0Var2.N(this.f42860c0);
            return;
        }
        if (i10 == NotificationCenter.replaceMessagesObjects) {
            long jLongValue = ((Long) objArr[0]).longValue();
            if (jLongValue != this.f42856a0 || this.f42887x0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                if (messageObject2.isLiveLocation()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    nc0 nc0Var = (nc0) this.f42861d0.f(message.from_id != null ? MessageObject.getFromChatId(message) : MessageObject.getDialogId(message));
                    if (nc0Var != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(jLongValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            nc0Var.f40730b = message2;
                            TLRPC.GeoPoint geoPoint = message2.media.geo;
                            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                            nc0Var.f40732e.setPosition(latLng);
                            if (this.f42863e0 == nc0Var.f40729a) {
                                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(nc0Var.f40732e.getPosition()));
                            }
                            IMapsProvider.IMarker iMarker = nc0Var.f40733f;
                            if (iMarker != null) {
                                iMarker.getPosition();
                                nc0Var.f40733f.setPosition(latLng);
                                int i14 = messageObject2.messageOwner.media.heading;
                                if (i14 != 0) {
                                    nc0Var.f40733f.setRotation(i14);
                                    if (!nc0Var.f40734g) {
                                        nc0Var.f40733f.setIcon(R.drawable.map_pin_cone2);
                                        nc0Var.f40734g = true;
                                    }
                                } else if (nc0Var.f40734g) {
                                    nc0Var.f40733f.setRotation(0);
                                    nc0Var.f40733f.setIcon(R.drawable.map_pin_circle);
                                    nc0Var.f40734g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (hc0Var = this.P) != null) {
                hc0Var.l();
                org.telegram.ui.Components.sh0 sh0Var = this.N;
                if (sh0Var != null) {
                    sh0Var.c(true);
                }
            }
            if (z11) {
                C0();
            }
        }
    }

    public final void e0(int i10) {
        if (this.E == null) {
            return;
        }
        List<IMapsProvider.PatternItem> listAsList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions iCircleOptionsOnCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        iCircleOptionsOnCreateCircleOptions.center(new IMapsProvider.LatLng(this.f42880s0.getLatitude(), this.f42880s0.getLongitude()));
        iCircleOptionsOnCreateCircleOptions.radius(i10);
        if (n0()) {
            iCircleOptionsOnCreateCircleOptions.strokeColor(-1771658281);
            iCircleOptionsOnCreateCircleOptions.fillColor(476488663);
        } else {
            iCircleOptionsOnCreateCircleOptions.strokeColor(-1774024971);
            iCircleOptionsOnCreateCircleOptions.fillColor(474121973);
        }
        iCircleOptionsOnCreateCircleOptions.strokePattern(listAsList);
        iCircleOptionsOnCreateCircleOptions.strokeWidth(2);
        this.K = this.E.addCircle(iCircleOptionsOnCreateCircleOptions);
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
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.r4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = bitmapCreateBitmap;
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
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

    public final Bitmap g0(nc0 nc0Var) {
        Bitmap bitmap = null;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                TLRPC.User user = nc0Var.f40731c;
                if (user != null) {
                    y8Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = nc0Var.d;
                    if (chat != null) {
                        y8Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                y8Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                y8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = nc0Var.h;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : nc0Var.h.getBitmap();
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float fDp = AndroidUtilities.dp(50.0f) / bitmap2.getWidth();
                    matrix.postTranslate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                    matrix.postScale(fDp, fDp);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return bitmapCreateBitmap;
                } catch (Exception unused) {
                    return bitmapCreateBitmap;
                }
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateBitmap;
                FileLog.e(th);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 21);
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
        int i14 = org.telegram.ui.ActionBar.g6.f23124h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.g6.f23161j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        org.telegram.ui.ActionBar.v0 v0Var = this.f42884w;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var != null ? v0Var.getSearchField() : null, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.f42872n;
        int i17 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42877r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ImageView imageView2 = this.f42855a;
        int i18 = org.telegram.ui.ActionBar.g6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.f42855a;
        int i19 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.f42855a;
        int i20 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.f42855a;
        int i21 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42859c, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42859c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42859c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42862e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42862e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42862e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23295r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.pi));
        int i22 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 131072, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 196608, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23233n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 32, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 8, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof an;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder = this.f42858b0 ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                c0(message);
                if (this.f42859c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f42859c.setVisibility(0);
                    this.D = true;
                    this.f42859c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new f50(this, 2)).start();
                }
            }
        }
        if (iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder != null) {
            if (this.f42858b0) {
                this.Q.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f42858b0 = false;
            this.P.N(this.f42860c0);
            if (this.f42887x0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng latLngP0 = p0(center, 100.0d, 100.0d);
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLngP0);
                    IMapsProvider.ILatLngBounds iLatLngBoundsBuild = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate iCameraUpdateNewCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuild, AndroidUtilities.dp(113.0f));
                            this.F = iCameraUpdateNewCameraUpdateLatLngBounds;
                            this.E.moveCamera(iCameraUpdateNewCameraUpdateLatLngBounds);
                            this.F = null;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.E != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.f42860c0;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                nc0 nc0Var = (nc0) arrayList2.get(i11);
                IMapsProvider.IMarker iMarker = nc0Var.f40732e;
                if (iMarker != null && (message = nc0Var.f40730b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            boolean z10 = this.f42861d0.f(getUserConfig().getClientUserId()) != null;
            Location location = this.f42880s0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f42880s0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    int i12 = 0;
                    double d12 = -1.7976931348623157E308d;
                    while (i12 < size2) {
                        IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i12);
                        iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLng);
                        int i13 = size2;
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
                        i12++;
                        size2 = i13;
                    }
                    IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d10 + d) / 2.0d, (d11 + d12) / 2.0d);
                    double radians = Math.toRadians(d - d10) * 6366198.0d;
                    double radians2 = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(p0(latLng2, 15.0d, 15.0d));
                        iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(p0(latLng2, -15.0d, -15.0d));
                    }
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z10) {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i11 = this.C0;
            if (i11 != 6 && i11 == 2) {
                this.D0 = org.telegram.messenger.y1.B(73.0f, measuredHeight, currentActionBarHeight);
            } else {
                this.D0 = org.telegram.messenger.y1.B(66.0f, measuredHeight, currentActionBarHeight);
            }
            jc0 jc0Var = this.G0;
            if (jc0Var != null && jc0Var.c0(8) > 0) {
                this.D0 -= AndroidUtilities.dp(200.0f);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            this.Q.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.D0;
            this.O.setLayoutParams(layoutParams3);
            org.telegram.ui.Components.zk0 zk0Var = this.R;
            if (zk0Var != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) zk0Var.getLayoutParams();
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
            qc0 qc0Var = this.f42886x;
            if (qc0Var != null && (layoutParams = (FrameLayout.LayoutParams) qc0Var.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                this.f42886x.setLayoutParams(layoutParams);
            }
            this.P.l();
            if (!z10) {
                A0(false);
                return;
            }
            if (i11 == 3) {
                i10 = 73;
            } else {
                i10 = (i11 == 1 || i11 == 2) ? 66 : 0;
            }
            this.U.h1(0, -AndroidUtilities.dp(i10));
            A0(false);
            this.Q.post(new org.telegram.ui.Components.xl(this, i10, 15));
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.f42887x0.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            i0(arrayList);
        }
        if (DialogObject.isChatDialog(this.f42856a0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f42856a0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.f42887x0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new jh.r5(this, dialogId, 6));
        return arrayList != null;
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
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.g6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)) < 0.721f;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f42859c;
        if (imageView == null || imageView.getVisibility() != 0 || this.D || (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
        if (DialogObject.isUserDialog(this.f42856a0)) {
            this.f42888y.t(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f42856a0)))));
        } else {
            this.f42888y.t(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.f42888y.v();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.sh0 sh0Var = this.N;
        if (sh0Var == null) {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView == null || iMapView.getGlSurfaceView() == null || this.I) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                q0();
            }
        } else if (z10) {
            sh0Var.a();
            return false;
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
        MessageObject messageObject = this.f42887x0;
        if (messageObject == null || !messageObject.isLiveLocation()) {
            return true;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        hc0 hc0Var = this.P;
        if (hc0Var != null) {
            hc0Var.F();
        }
        mc0 mc0Var = this.S;
        if (mc0Var != null) {
            mc0Var.F();
        }
        cc0 cc0Var = this.F0;
        if (cc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
            this.F0 = null;
        }
        ArrayList arrayList = this.f42860c0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            nc0 nc0Var = (nc0) arrayList.get(i10);
            ImageReceiver imageReceiver = nc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                nc0Var.h = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView == null || !this.f42876q0) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f42876q0) {
            try {
                iMapView.onPause();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f42878r0 = false;
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
        if (iMapView != null && this.f42876q0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.f42878r0 = true;
        IMapsProvider.IMap iMap = this.E;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        k0(true);
        if (h0()) {
            this.f42871l0 = false;
        } else if (this.f42871l0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f42871l0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        cc0 cc0Var = this.F0;
        if (cc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
            AndroidUtilities.runOnUIThread(this.F0, 5000L);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (this.G.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.G.getView().getParent()).removeView(this.G.getView());
            }
        } catch (Exception unused) {
        }
        n0 n0Var = this.O;
        if (n0Var == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.G.getView(), 0, h7.z5.e(-1, -1, 51));
                return;
            }
            return;
        }
        n0Var.addView(this.G.getView(), 0, h7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
        qc0 qc0Var = this.f42886x;
        if (qc0Var != null) {
            try {
                if (qc0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.f42886x.getParent()).removeView(this.f42886x);
                }
            } catch (Exception unused2) {
            }
            this.O.addView(this.f42886x, 1, h7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
        }
        A0(false);
        o0();
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.I) {
            return false;
        }
        GLSurfaceView glSurfaceView = this.G.getGlSurfaceView();
        glSurfaceView.queueEvent(new a30(20, this, glSurfaceView));
        return true;
    }

    public final void r0(nc0 nc0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (nc0Var == null || (message = nc0Var.f40730b) == null) {
            MessageObject messageObject = this.f42887x0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                d = geoPoint.lat;
                d10 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.f42883v0.geo_point;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d10 = geoPoint3._long;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.f42880s0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f42880s0.getLatitude()), Double.valueOf(this.f42880s0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s0(final boolean z10) {
        Activity parentActivity;
        if (this.B0 == null || h0() || getParentActivity() == null || this.f42880s0 == null || !d0()) {
            return;
        }
        if (this.m0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.m0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - ((long) globalMainSettings.getInt("backgroundloc", 0))) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                org.telegram.ui.Components.y4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new yb0(this, z10, 1), null).o();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.f42856a0) ? getMessagesController().getUser(Long.valueOf(this.f42856a0)) : null;
        showDialog(org.telegram.ui.Components.y4.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() {
            @Override
            public final void run(int i10) {
                tc0.V(this.f36775a, z10, user, i10);
            }
        }, null));
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f42880s0 = new Location(location);
        nc0 nc0Var = (nc0) this.f42861d0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f42856a0);
        if (nc0Var != null && sharingLocationInfo != null && nc0Var.f40730b.f22401id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            nc0Var.f40732e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = nc0Var.f40733f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f42863e0 == nc0Var.f40729a) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(nc0Var.f40732e.getPosition()));
            }
        }
        if (this.f42887x0 == null && this.f42883v0 == null && this.E != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            hc0 hc0Var = this.P;
            if (hc0Var != null) {
                if (!this.f42890z0 && (i10 = this.C0) != 4 && i10 != 8) {
                    hc0Var.H(null, this.f42880s0, true);
                }
                this.P.M(this.f42880s0);
            }
            if (!this.f42889y0) {
                this.f42881t0 = new Location(location);
                if (this.A0) {
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.A0 = true;
                    this.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.E.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.P.M(this.f42880s0);
        }
        org.telegram.ui.Components.sh0 sh0Var = this.N;
        if (sh0Var != null) {
            sh0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.K;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f42880s0.getLatitude(), this.f42880s0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.f42887x0 = messageObject;
        this.f42856a0 = messageObject.getDialogId();
    }

    public final void v0(nc0 nc0Var) {
        if (nc0Var.h != null) {
            return;
        }
        TLRPC.User user = nc0Var.f40731c;
        TLRPC.Chat chat = nc0Var.d;
        if (user == null && chat == null) {
            return;
        }
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        if (user != null) {
            y8Var.m(this.currentAccount, user);
        } else {
            y8Var.k(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new zr(22, this, nc0Var));
        imageReceiver.onAttachedToWindow();
        TLObject tLObject = user;
        if (user == null) {
            tLObject = chat;
        }
        imageReceiver.setForUserOrChat(tLObject, y8Var);
        nc0Var.h = imageReceiver;
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f42880s0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f42880s0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f42880s0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.B0.d(tL_messageMediaGeoLive, this.C0, true, 0, 0L);
        if (i11 <= 0) {
            finishFragment();
            return;
        }
        this.N.H = true;
        this.f42859c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.sh0 sh0Var = this.N;
        if (sh0Var != null) {
            sh0Var.a();
        }
        m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
    }

    public final void x0() {
        if (this.P.h() != 0 && this.U.L0() == 0) {
            View childAt = this.Q.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.Q.v0(0, top, null);
        }
    }

    public final void y0(boolean z10) {
        org.telegram.ui.Components.rk rkVar;
        Location location;
        Location location2;
        if (this.C0 == 3) {
            z10 = true;
        }
        if (z10 && (rkVar = this.f42862e) != null && rkVar.getTag() == null && ((location = this.f42880s0) == null || (location2 = this.f42881t0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.rk rkVar2 = this.f42862e;
        if (rkVar2 != null) {
            if (!z10 || rkVar2.getTag() == null) {
                if (z10 || this.f42862e.getTag() != null) {
                    this.f42862e.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.f42862e, (Property<org.telegram.ui.Components.rk, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.er.f28123g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        Boolean bool = this.L0;
        if (bool == null || bool.booleanValue() != z10) {
            this.L0 = Boolean.valueOf(z10);
            if (z11) {
                this.f42857b.setVisibility(0);
                this.f42857b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.er.h).setDuration(420L).withEndAction(new yb0(this, z10, 0)).start();
            } else {
                this.f42857b.setVisibility(z10 ? 0 : 8);
                this.f42857b.setAlpha(z10 ? 1.0f : 0.0f);
                this.f42857b.setScaleX(z10 ? 1.0f : 0.7f);
                this.f42857b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }
}
