package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class xb0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final UndoView[] D;
    public boolean D0;
    public boolean E;
    public Location E0;
    public boolean F;
    public Location F0;
    public org.telegram.messenger.ha G;
    public int G0;
    public org.telegram.messenger.va H;
    public TLRPC.TL_channelLocation H0;
    public org.telegram.messenger.ab I;
    public TLRPC.TL_channelLocation I0;
    public org.telegram.messenger.va J;
    public org.telegram.messenger.kj J0;
    public boolean K;
    public boolean K0;
    public float L;
    public boolean L0;
    public m4.c M;
    public boolean M0;
    public double N;
    public sb0 N0;
    public boolean O;
    public final int O0;
    public org.telegram.ui.Components.kh0 P;
    public int P0;
    public l0 Q;
    public qb0 Q0;
    public nb0 R;
    public bb0 R0;
    public mb0 S;
    public pb0 S0;
    public org.telegram.ui.Components.uk0 T;
    public org.telegram.ui.Cells.z3 T0;
    public org.telegram.ui.Components.vk U;
    public TL_stories.MediaArea U0;
    public View V;
    public boolean V0;
    public s4.a0 W;
    public boolean W0;
    public org.telegram.ui.ActionBar.p5 X;
    public Boolean X0;
    public FrameLayout Y;
    public final Bitmap[] Y0;
    public FrameLayout Z;
    public ImageView f43300a;
    public vg.f f43301a0;
    public TextView f43302b;
    public final RectF f43303b0;
    public ImageView f43304c;
    public int f43305c0;
    public org.telegram.ui.ActionBar.p5 d;
    public int f43306d0;
    public TextView e;
    public TextureView f43307e0;
    public LinearLayout f43308f;
    public org.telegram.ui.Components.z80 f43309f0;
    public final RectF f43310g0;
    public ImageView h;
    public final Paint f43311h0;
    public int f43312i0;
    public boolean f43313j0;
    public boolean f43314k0;
    public boolean f43315l0;
    public boolean m0;
    public TextView f43316n;
    public long f43317n0;
    public boolean f43318o0;
    public final ArrayList f43319p0;
    public final a0.h f43320q0;
    public TextView f43321r;
    public long f43322r0;
    public org.telegram.ui.ActionBar.p5 f43323s;
    public boolean f43324s0;
    public final ArrayList f43325t0;
    public AnimatorSet f43326u0;
    public org.telegram.messenger.ga f43327v0;
    public tb0 f43328w;
    public wb0 f43329w0;
    public vh.p2 f43330x;
    public FrameLayout f43331x0;
    public boolean f43332y;
    public boolean f43333y0;
    public boolean f43334z0;

    public xb0(int i10) {
        super(null);
        this.D = new UndoView[2];
        this.f43303b0 = new RectF();
        this.f43310g0 = new RectF();
        this.f43311h0 = new Paint();
        this.f43314k0 = true;
        this.f43315l0 = false;
        this.m0 = true;
        this.f43318o0 = true;
        this.f43319p0 = new ArrayList();
        this.f43320q0 = new a0.h();
        this.f43322r0 = -1L;
        this.f43325t0 = new ArrayList();
        this.f43333y0 = true;
        this.P0 = (org.telegram.messenger.i0.f16172q.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(66.0f);
        this.W0 = true;
        this.Y0 = new Bitmap[7];
        this.O0 = i10;
        org.telegram.messenger.i0.a0();
    }

    public static org.telegram.messenger.db B0(org.telegram.messenger.db dbVar, double d, double d10) {
        double d11 = dbVar.f15333a;
        return new org.telegram.messenger.db(d11 + Math.toDegrees(d / 6366198.0d), dbVar.f15334b + Math.toDegrees(d10 / (Math.cos(Math.toRadians(d11)) * 6366198.0d)));
    }

    public static void Z(xb0 xb0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            org.telegram.messenger.nd h = xb0Var.getLocationController().h(xb0Var.f43317n0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = xb0Var.getMessagesController().i1(h.f17282a);
                tL_messages_editMessage.f19878id = h.f17283b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = org.telegram.messenger.od.f(xb0Var.currentAccount).f17425s;
                tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.i0.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.i0.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i12 = h.f17286g;
                int i13 = h.f17285f;
                if (i12 != i13) {
                    inputMedia.proximity_notification_radius = i13;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = org.telegram.messenger.od.e(location);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i14 = inputMedia2.flags;
                inputMedia2.flags = i14 | 4;
                int i15 = Integer.MAX_VALUE;
                if (i10 == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = h.d + i10;
                }
                h.d = i11;
                inputMedia2.period = i11;
                if (i10 != Integer.MAX_VALUE) {
                    i15 = h.f17284c + i10;
                }
                h.f17284c = i15;
                inputMedia2.flags = i14 | 6;
                org.telegram.messenger.kj kjVar = h.h;
                if (kjVar != null && (message = kjVar.f16690k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i11;
                    xb0Var.getMessagesStorage().r1(h.h.f16690k, null, null, true);
                }
                xb0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                org.telegram.messenger.at.e().k(org.telegram.messenger.at.D4, new Object[0]);
                return;
            }
            return;
        }
        xb0Var.L0(i10, 0, user);
    }

    public static void a0(xb0 xb0Var, Canvas canvas, RectF rectF) {
        fg.i iVar;
        Paint paint = xb0Var.f43311h0;
        int i10 = org.telegram.ui.ActionBar.t6.f21002h5;
        paint.setColor(xb0Var.getThemedColor(i10));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) xb0Var.fragmentView;
        org.telegram.ui.Components.uk0 uk0Var = xb0Var.T;
        if (uk0Var != null && uk0Var.getVisibility() == 0) {
            org.telegram.ui.Components.uk0 uk0Var2 = xb0Var.T;
            yg.d.a(uk0Var2, canvas, rectF, uk0Var2, viewGroup);
            return;
        }
        if (xb0Var.Q.getVisibility() == 0) {
            RectF rectF2 = xb0Var.f43310g0;
            canvas.save();
            canvas.translate(xb0Var.Q.getX(), xb0Var.Q.getY());
            canvas.clipRect(0.0f, 0.0f, xb0Var.Q.getWidth(), viewGroup.getHeight() - xb0Var.Q.getY());
            Drawable background = xb0Var.Q.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.ab abVar = xb0Var.I;
            if (abVar != null) {
                iVar = (fg.i) ((bh.d) abVar).f2777a;
            } else {
                iVar = null;
            }
            if (iVar != null && iVar.getParent() == xb0Var.Q && iVar.getVisibility() == 0 && iVar.getAlpha() > 0.0f) {
                TextureView textureView = xb0Var.f43307e0;
                if (textureView != null && textureView.isAttachedToWindow() && zg.h.c(xb0Var.f43307e0, xb0Var.Q, rectF2)) {
                    if (iVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (iVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    xb0Var.f43307e0.draw(canvas);
                    canvas.restore();
                } else if (xb0Var.f43309f0 != null) {
                    rectF2.set(iVar.getX(), iVar.getY(), iVar.getX() + iVar.getWidth(), iVar.getY() + iVar.getHeight());
                    org.telegram.ui.Components.z80 z80Var = xb0Var.f43309f0;
                    float alpha = iVar.getAlpha();
                    Paint paint2 = z80Var.f33072c;
                    Bitmap bitmap = z80Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            q0(canvas, xb0Var.f43328w);
            q0(canvas, xb0Var.V);
            canvas.restore();
        }
        if (xb0Var.S.getVisibility() == 0) {
            int L = org.telegram.messenger.i0.L(22.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + xb0Var.mSystemInsets.f7767b;
            float f7 = L;
            if (rectF.top >= f7) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f7), viewGroup.getWidth(), f7);
            if (xb0Var.f43305c0 < L) {
                paint.setColor(xb0Var.getThemedColor(i10));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(xb0Var.f43305c0, rectF.top), viewGroup.getWidth(), f7, paint);
            }
            mb0 mb0Var = xb0Var.S;
            yg.d.a(mb0Var, canvas, rectF, mb0Var, viewGroup);
            canvas.restore();
        }
    }

    public static void b0(xb0 xb0Var, int i10) {
        sb0 sb0Var;
        float e;
        float f7;
        TLRPC.TL_messageMediaVenue I = xb0Var.U.I(i10);
        if (I != null && I.icon != null && xb0Var.O0 == 8 && xb0Var.G != null) {
            xb0Var.K0 = true;
            xb0Var.simpleActionBar.j(true);
            if ("pin".equals(I.icon)) {
                e = xb0Var.G.e();
                f7 = 4.0f;
            } else {
                e = xb0Var.G.e();
                f7 = 9.0f;
            }
            float f10 = e - f7;
            org.telegram.messenger.ha haVar = xb0Var.G;
            IMapsProvider k10 = org.telegram.messenger.w0.k();
            TLRPC.GeoPoint geoPoint = I.geo;
            haVar.b(((t7.u) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.db(geoPoint.lat, geoPoint._long), f10));
            Location location = xb0Var.F0;
            if (location != null) {
                location.setLatitude(I.geo.lat);
                xb0Var.F0.setLongitude(I.geo._long);
            }
            xb0Var.R.M(xb0Var.F0);
        } else if (I != null && (sb0Var = xb0Var.N0) != null) {
            sb0Var.d(I, xb0Var.O0, true, 0, 0L);
            xb0Var.finishFragment();
        }
    }

    public static void c0(xb0 xb0Var) {
        xb0Var.glassEngine.g();
        View view = xb0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void d0(xb0 xb0Var) {
        xb0Var.glassEngine.g();
    }

    public static void e0(xb0 xb0Var) {
        bb0 bb0Var;
        xb0Var.getLocationController().j(xb0Var.f43317n0);
        if (!xb0Var.isPaused && (bb0Var = xb0Var.R0) != null) {
            org.telegram.messenger.i0.h3(bb0Var, 5000L);
        }
    }

    public static void q0(Canvas canvas, View view) {
        if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            view.draw(canvas);
            canvas.restore();
        }
    }

    public static View s0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View s02 = s0(viewGroup.getChildAt(i10), cls);
                if (s02 != null) {
                    return s02;
                }
            }
            return null;
        }
        return null;
    }

    public final void A0() {
        SharedPreferences d12;
        int i10;
        ImageView imageView = this.f43304c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.F && (i10 = (d12 = org.telegram.messenger.wp.d1()).getInt("proximityhint", 0)) < 3) {
            d12.edit().putInt("proximityhint", i10 + 1).commit();
            if (org.telegram.messenger.o5.E(this.f43317n0)) {
                this.f43330x.s(org.telegram.messenger.dd.a0("ProximityTooltioUser", null, 2131746627, org.telegram.messenger.i20.j(getMessagesController().Z1(Long.valueOf(this.f43317n0)), true)));
            } else {
                this.f43330x.s(org.telegram.messenger.dd.L0(2131746628, null));
            }
            this.f43330x.u();
        }
    }

    public final boolean C0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.ab abVar = this.I;
        if (abVar != null && (gLSurfaceView = (GLSurfaceView) ((bh.d) abVar).e) != null && !this.K) {
            gLSurfaceView.queueEvent(new y60(15, this, gLSurfaceView));
            return true;
        }
        return false;
    }

    public final void D0(rb0 rb0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (rb0Var != null && (message = rb0Var.f41030b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d10 = geoPoint._long;
        } else {
            org.telegram.messenger.kj kjVar = this.J0;
            if (kjVar != null) {
                TLRPC.GeoPoint geoPoint2 = kjVar.f16690k.media.geo;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.H0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        boolean z10 = org.telegram.messenger.v2.f18578a;
        org.telegram.messenger.w0.r();
        if (this.E0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.E0.getLatitude()), Double.valueOf(this.E0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void E0(final boolean z10) {
        final TLRPC.User user;
        if (this.N0 != null && !p0() && getParentActivity() != null && this.E0 != null && l0()) {
            if (org.telegram.messenger.o5.E(this.f43317n0)) {
                user = getMessagesController().Z1(Long.valueOf(this.f43317n0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.s4.D(getParentActivity(), z10, user, new org.telegram.messenger.cs() {
                @Override
                public final void a(int i10) {
                    xb0.Z(xb0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void F0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.f43309f0 != null && this.I != null) {
            TextureView textureView = this.f43307e0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f43309f0.d) == null || !surfaceView.isAttachedToWindow())) {
                fg.i iVar = (fg.i) ((bh.d) this.I).f2777a;
                TextureView textureView2 = (TextureView) s0(iVar, TextureView.class);
                this.f43307e0 = textureView2;
                org.telegram.ui.Components.z80 z80Var = this.f43309f0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) s0(iVar, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (z80Var.d != surfaceView2) {
                    z80Var.d = surfaceView2;
                    z80Var.a();
                }
                TextureView textureView3 = this.f43307e0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof ub0)) {
                        this.f43307e0.setSurfaceTextureListener(new ub0(this, surfaceTextureListener));
                    }
                }
                R0();
            }
            TextureView textureView4 = this.f43307e0;
            if (textureView4 == null) {
                this.f43309f0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof ub0)) {
                this.f43307e0.setSurfaceTextureListener(new ub0(this, surfaceTextureListener2));
            }
        }
    }

    public final void G0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.E0 = new Location(location);
        rb0 rb0Var = (rb0) this.f43320q0.f(getUserConfig().e());
        org.telegram.messenger.nd h = getLocationController().h(this.f43317n0);
        if (rb0Var != null && h != null && rb0Var.f41030b.f19815id == h.f17283b) {
            org.telegram.messenger.db dbVar = new org.telegram.messenger.db(location.getLatitude(), location.getLongitude());
            rb0Var.e.d(dbVar);
            org.telegram.messenger.ga gaVar = rb0Var.f41032f;
            if (gaVar != null) {
                gaVar.d(dbVar);
            }
            if (this.f43322r0 == rb0Var.f41029a) {
                this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(rb0Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.G != null) {
            org.telegram.messenger.db dbVar2 = new org.telegram.messenger.db(location.getLatitude(), location.getLongitude());
            nb0 nb0Var = this.R;
            if (nb0Var != null) {
                if (!this.L0 && (i10 = this.O0) != 4 && i10 != 8) {
                    nb0Var.H(null, this.E0, true);
                }
                this.R.N(this.E0);
            }
            if (!this.K0) {
                this.F0 = new Location(location);
                if (this.M0) {
                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(dbVar2));
                } else {
                    this.M0 = true;
                    this.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(dbVar2, this.G.e() - 4.0f));
                }
            }
        } else {
            this.R.N(this.E0);
        }
        org.telegram.ui.Components.kh0 kh0Var = this.P;
        if (kh0Var != null) {
            kh0Var.c(true);
        }
        m4.c cVar = this.M;
        if (cVar != null) {
            double latitude = this.E0.getLatitude();
            double longitude = this.E0.getLongitude();
            j8.a aVar = (j8.a) cVar.f12706b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                s7.f fVar = (s7.f) aVar.f9707a;
                Parcel P0 = fVar.P0();
                s7.b.b(P0, latLng);
                fVar.T0(P0, 3);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        S0();
    }

    public final void H0(View view) {
        vg.f c10 = getBaseSimpleGlass().f6599c.c(view, null, false);
        c10.o(w7.b9.m(getResourceProvider()));
        c10.q(org.telegram.messenger.i0.L(23.0f));
        c10.p(org.telegram.messenger.i0.L(6.0f));
        view.setBackground(c10);
        w7.e6.a(view);
    }

    public final void I0(org.telegram.messenger.kj kjVar) {
        this.J0 = kjVar;
        this.f43317n0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
    }

    public final void J0(boolean z10, boolean z11) {
        float f7;
        float f10;
        this.e.animate().cancel();
        this.e.setEnabled(z10);
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.7f;
        if (!z11) {
            TextView textView = this.e;
            if (!z10) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.e;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.e;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.e;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.e.setVisibility(0);
        ViewPropertyAnimator animate = this.e.animate();
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
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(320L).withEndAction(new fb0(this, z10, 1)).start();
    }

    public final void K0(rb0 rb0Var) {
        if (rb0Var.h == null) {
            TLRPC.User user = rb0Var.f41031c;
            TLRPC.Chat chat = rb0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            if (user != null) {
                r8Var.r(user);
            } else {
                r8Var.q(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.f14383g1 = new qv(17, this, rb0Var);
            imageReceiver.P();
            if (user == null) {
                user = chat;
            }
            imageReceiver.i0(user, r8Var, null);
            rb0Var.h = imageReceiver;
        }
    }

    public final void L0(int i10, int i11, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.i0.b0(this.E0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.i0.b0(this.E0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.od.e(this.E0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.N0.d(tL_messageMediaGeoLive, this.O0, true, 0, 0L);
        if (i11 > 0) {
            this.P.L = true;
            this.f43304c.setImageResource(2131232210);
            org.telegram.ui.Components.kh0 kh0Var = this.P;
            if (kh0Var != null) {
                kh0Var.a();
            }
            y0().k(0L, 24, Integer.valueOf(i11), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void M0() {
        if (this.R.b() != 0 && this.W.L0() == 0) {
            View childAt = this.S.getChildAt(0);
            int top = childAt.getTop() + org.telegram.messenger.i0.L(258.0f);
            if (top >= 0 && top <= org.telegram.messenger.i0.L(258.0f)) {
                this.S.w0(0, top, null);
            }
        }
    }

    public final void N0(boolean z10) {
        Integer num;
        TextView textView;
        Location location;
        Location location2;
        if (this.O0 == 3) {
            z10 = true;
        }
        if (z10 && (textView = this.e) != null && textView.getTag() == null && ((location = this.E0) == null || (location2 = this.F0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            if (!z10 || textView2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    TextView textView3 = this.e;
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    textView3.setTag(num);
                    J0(z10, true);
                }
            }
        }
    }

    public final void O0(boolean z10, boolean z11) {
        float f7;
        float f10;
        Boolean bool = this.X0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.X0 = Boolean.valueOf(z10);
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.7f;
        if (!z11) {
            TextView textView = this.f43302b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f43302b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f43302b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f43302b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f43302b.setVisibility(0);
        ViewPropertyAnimator animate = this.f43302b.animate();
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
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(420L).withEndAction(new fb0(this, z10, 0)).start();
    }

    public final void P0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        int i12;
        s4.c1 K = this.S.K(0);
        if (K != null) {
            i10 = (int) K.f47909a.getY();
            i11 = Math.min(i10, 0) + this.P0;
            this.f43305c0 = (this.P0 + i10) - this.f43312i0;
        } else {
            i10 = -this.Q.getMeasuredHeight();
            this.f43305c0 = -org.telegram.messenger.i0.L(41.0f);
            i11 = 0;
        }
        this.S.invalidate();
        if (((FrameLayout.LayoutParams) this.Q.getLayoutParams()) != null) {
            int i13 = 4;
            if (i11 <= 0) {
                if (((fg.i) ((bh.d) this.I).f2777a).getVisibility() == 0) {
                    ((fg.i) ((bh.d) this.I).f2777a).setVisibility(4);
                    this.Q.setVisibility(4);
                    tb0 tb0Var = this.f43328w;
                    if (tb0Var != null) {
                        tb0Var.setVisibility(4);
                    }
                }
            } else if (((fg.i) ((bh.d) this.I).f2777a).getVisibility() == 4) {
                ((fg.i) ((bh.d) this.I).f2777a).setVisibility(0);
                this.Q.setVisibility(0);
                tb0 tb0Var2 = this.f43328w;
                if (tb0Var2 != null) {
                    tb0Var2.setVisibility(0);
                }
            }
            this.Q.setTranslationY(Math.min(0, i10));
            int i14 = -i10;
            int i15 = i14 / 2;
            ((fg.i) ((bh.d) this.I).f2777a).setTranslationY(Math.max(0, i15));
            tb0 tb0Var3 = this.f43328w;
            if (tb0Var3 != null) {
                tb0Var3.setTranslationY(Math.max(0, i15));
            }
            FrameLayout frameLayout = this.Y;
            float f7 = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i10));
                float l4 = Utilities.l((org.telegram.messenger.m5.z(53.0f, i11 - this.f43312i0, org.telegram.messenger.i0.L(46.0f) + ei.b.d(this.mSystemInsets.f7767b)) - org.telegram.messenger.i0.L(7.0f)) / org.telegram.messenger.i0.L(48.0f));
                FrameLayout frameLayout2 = this.Y;
                frameLayout2.setAlpha(l4);
                int i16 = (l4 > 0.0f ? 1 : (l4 == 0.0f ? 0 : -1));
                if (i16 > 0) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                frameLayout2.setVisibility(i12);
                FrameLayout frameLayout3 = this.Z;
                frameLayout3.setAlpha(l4);
                if (i16 > 0) {
                    i13 = 0;
                }
                frameLayout3.setVisibility(i13);
                R0();
            }
            View view = this.V;
            if (view != null) {
                if (view.getTag() != null) {
                    f7 = 69.0f;
                }
                int L = ((i11 / 2) + (i14 - org.telegram.messenger.i0.L(f7))) - (this.f43312i0 / 2);
                this.G0 = L;
                view.setTranslationY(L);
            }
            if (!z10) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.I).f2777a).getLayoutParams();
                if (layoutParams2 != null && layoutParams2.height != w0()) {
                    layoutParams2.height = w0();
                    org.telegram.messenger.ha haVar = this.G;
                    if (haVar != null) {
                        haVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), v0());
                    }
                    ((fg.i) ((bh.d) this.I).f2777a).setLayoutParams(layoutParams2);
                }
                tb0 tb0Var4 = this.f43328w;
                if (tb0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) tb0Var4.getLayoutParams()) != null && layoutParams.height != w0()) {
                    layoutParams.height = w0();
                    this.f43328w.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void Q0() {
        if (this.f43334z0) {
            if (this.B0) {
                this.T.setEmptyView(null);
                this.f43308f.setVisibility(8);
                this.T.setVisibility(8);
                return;
            }
            this.T.setEmptyView(this.f43308f);
            return;
        }
        this.f43308f.setVisibility(8);
    }

    public final void R0() {
        org.telegram.messenger.ab abVar;
        boolean z10;
        l0 l0Var;
        org.telegram.ui.Components.z80 z80Var = this.f43309f0;
        if (z80Var != null && (abVar = this.I) != null) {
            fg.i iVar = (fg.i) ((bh.d) abVar).f2777a;
            if (this.f43307e0 == null && this.D0 && !isFinishing() && (l0Var = this.Q) != null && l0Var.getVisibility() == 0 && iVar.getParent() != null && iVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z80Var.f33074g != z10) {
                z80Var.f33074g = z10;
                if (z10) {
                    z80Var.a();
                } else {
                    z80Var.d();
                }
            }
        }
    }

    public final void S0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f43302b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f43324s0) {
            O0(false, true);
            t0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f43319p0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((rb0) arrayList.get(i13)).f41030b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f43320q0.f(getUserConfig().e()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E0 != null && !z10) {
            i12++;
        }
        if (i12 >= 2) {
            z11 = true;
        }
        O0(z11, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21115n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20873a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xb0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nb0 nb0Var;
        long B0;
        nb0 nb0Var2;
        if (i10 == org.telegram.messenger.at.f14786t) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == org.telegram.messenger.at.f14804v4) {
            this.f43315l0 = false;
            nb0 nb0Var3 = this.R;
            if (nb0Var3 != null) {
                nb0Var3.P(false, false);
            }
            org.telegram.messenger.ha haVar = this.G;
            if (haVar != null) {
                try {
                    haVar.l(true);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14811w4) {
            this.f43315l0 = true;
            nb0 nb0Var4 = this.R;
            if (nb0Var4 != null) {
                nb0Var4.P(true, false);
            }
        } else if (i10 == org.telegram.messenger.at.D4) {
            nb0 nb0Var5 = this.R;
            if (nb0Var5 != null) {
                nb0Var5.f();
            }
            S0();
        } else if (i10 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f43317n0 && this.J0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i12);
                    if (kjVar.C3()) {
                        i0(kjVar.f16690k);
                        z10 = true;
                    } else {
                        TLRPC.Message message = kjVar.f16690k;
                        if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.o5.E(org.telegram.messenger.kj.B0(message))) {
                            this.f43304c.setImageResource(2131232209);
                            m4.c cVar = this.M;
                            if (cVar != null) {
                                cVar.v0();
                                this.M = null;
                            }
                        }
                    }
                }
                if (z10 && (nb0Var2 = this.R) != null) {
                    nb0Var2.O(this.f43319p0);
                }
            }
        } else if (i10 == org.telegram.messenger.at.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f43317n0 && this.J0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList2.get(i13);
                    if (kjVar2.C3()) {
                        TLRPC.Message message2 = kjVar2.f16690k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = org.telegram.messenger.kj.C1(peer);
                        } else {
                            B0 = org.telegram.messenger.kj.B0(message2);
                        }
                        rb0 rb0Var = (rb0) this.f43320q0.f(B0);
                        if (rb0Var != null) {
                            org.telegram.messenger.nd h = getLocationController().h(longValue);
                            if (h == null || h.f17283b != kjVar2.f1()) {
                                TLRPC.Message message3 = kjVar2.f16690k;
                                rb0Var.f41030b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                org.telegram.messenger.db dbVar = new org.telegram.messenger.db(geoPoint.lat, geoPoint._long);
                                rb0Var.e.d(dbVar);
                                if (this.f43322r0 == rb0Var.f41029a) {
                                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(rb0Var.e.a()));
                                }
                                org.telegram.messenger.ga gaVar = rb0Var.f41032f;
                                if (gaVar != null) {
                                    gaVar.a();
                                    rb0Var.f41032f.d(dbVar);
                                    int i14 = kjVar2.f16690k.media.heading;
                                    if (i14 != 0) {
                                        rb0Var.f41032f.e(i14);
                                        if (!rb0Var.f41033g) {
                                            rb0Var.f41032f.f15874a.a(v7.n8.b(2131231649));
                                            rb0Var.f41033g = true;
                                        }
                                    } else if (rb0Var.f41033g) {
                                        rb0Var.f41032f.e(0);
                                        rb0Var.f41032f.f15874a.a(v7.n8.b(2131231648));
                                        rb0Var.f41033g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (nb0Var = this.R) != null) {
                    nb0Var.f();
                    org.telegram.ui.Components.kh0 kh0Var = this.P;
                    if (kh0Var != null) {
                        kh0Var.c(true);
                    }
                }
                if (z11) {
                    S0();
                }
            }
        }
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        if (C0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.D;
            if (i10 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(undoViewArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.tj));
            i10++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h5));
        org.telegram.ui.ActionBar.p5 p5Var = this.f43323s;
        if (p5Var != null) {
            editTextBoldCursor = p5Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21038j5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 196608, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 8, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X5));
        return arrayList;
    }

    public final rb0 i0(TLRPC.Message message) {
        rb0 rb0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d10 = geoPoint._long;
        long C1 = org.telegram.messenger.kj.C1(message.from_id);
        a0.h hVar = this.f43320q0;
        rb0 rb0Var2 = (rb0) hVar.f(C1);
        if (rb0Var2 == null) {
            ?? obj = new Object();
            obj.f41030b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f41031c = getMessagesController().Z1(Long.valueOf(obj.f41030b.from_id.user_id));
                obj.f41029a = obj.f41030b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.kj.B0(message);
                if (org.telegram.messenger.o5.E(B0)) {
                    obj.f41031c = getMessagesController().Z1(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().L0(Long.valueOf(-B0));
                }
                obj.f41029a = B0;
            }
            K0(obj);
            try {
                l2.f fVar = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                ((j8.f) fVar.f11588b).f9717a = new LatLng(d, d10);
                Bitmap o02 = o0(obj);
                rb0Var = obj;
                if (o02 != null) {
                    ((j8.f) fVar.f11588b).d = v7.n8.a(o02);
                    fVar.e(0.907f);
                    obj.e = this.G.a(fVar);
                    if (!org.telegram.messenger.i20.B(obj.f41031c)) {
                        l2.f fVar2 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                        ((j8.f) fVar2.f11588b).f9717a = new LatLng(d, d10);
                        ((j8.f) fVar2.f11588b).f9722r = true;
                        fVar2.e(0.5f);
                        org.telegram.messenger.ga a2 = this.G.a(fVar2);
                        obj.f41032f = a2;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            a2.e(i10);
                            obj.f41032f.f15874a.a(v7.n8.b(2131231649));
                            obj.f41033g = true;
                        } else {
                            a2.e(0);
                            obj.f41032f.f15874a.a(v7.n8.b(2131231648));
                            obj.f41033g = false;
                        }
                    }
                    this.f43319p0.add(obj);
                    hVar.k(obj, obj.f41029a);
                    org.telegram.messenger.nd h = getLocationController().h(this.f43317n0);
                    int i11 = (obj.f41029a > getUserConfig().e() ? 1 : (obj.f41029a == getUserConfig().e() ? 0 : -1));
                    rb0Var = obj;
                    rb0Var = obj;
                    if (i11 == 0 && h != null) {
                        int i12 = obj.f41030b.f19815id;
                        rb0Var = obj;
                        if (i12 == h.f17283b) {
                            Location location = this.E0;
                            rb0Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.E0.getLongitude();
                                j8.e eVar = obj.e.f15874a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                eVar.getClass();
                                try {
                                    s7.i iVar = (s7.i) eVar.f9716a;
                                    Parcel P0 = iVar.P0();
                                    s7.b.b(P0, latLng);
                                    iVar.T0(P0, 3);
                                    rb0Var = obj;
                                } catch (RemoteException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                rb0Var = obj;
            }
        } else {
            rb0Var2.f41030b = message;
            j8.e eVar2 = rb0Var2.e.f15874a;
            LatLng latLng2 = new LatLng(d, d10);
            eVar2.getClass();
            try {
                s7.i iVar2 = (s7.i) eVar2.f9716a;
                Parcel P02 = iVar2.P0();
                s7.b.b(P02, latLng2);
                iVar2.T0(P02, 3);
                int i13 = (this.f43322r0 > rb0Var2.f41029a ? 1 : (this.f43322r0 == rb0Var2.f41029a ? 0 : -1));
                rb0Var = rb0Var2;
                if (i13 == 0) {
                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(rb0Var2.e.a()));
                    rb0Var = rb0Var2;
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        org.telegram.ui.Components.kh0 kh0Var = this.P;
        if (kh0Var != null) {
            kh0Var.c(true);
        }
        S0();
        return rb0Var;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        if (this.fragmentView != null && this.S != null) {
            i0.c cVar = this.mSystemInsets;
            int i10 = cVar.f7767b;
            int i11 = cVar.d;
            FrameLayout frameLayout = this.Y;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                int d = ei.b.d(i10) - org.telegram.messenger.i0.L(6.0f);
                if (layoutParams.topMargin != d) {
                    layoutParams.topMargin = d;
                    this.Y.requestLayout();
                }
            }
            this.S.setClipToPadding(false);
            this.S.setPadding(0, 0, 0, i11);
            org.telegram.ui.Components.uk0 uk0Var = this.T;
            if (uk0Var != null) {
                uk0Var.setClipToPadding(false);
                ei.b.e(this.T, i10, i11, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                u0(false);
            }
        }
    }

    public final void k0() {
        int i10;
        vg.f fVar = this.f43301a0;
        if (fVar != null) {
            fVar.updateColors();
        }
        mb0 mb0Var = this.S;
        if (mb0Var != null) {
            mb0Var.invalidate();
        }
        if (this.G != null) {
            if (org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)) < 0.721f) {
                i10 = 2131624083;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                if (!this.f43313j0) {
                    this.f43313j0 = true;
                    this.G.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.f18945b, i10));
                    m4.c cVar = this.M;
                    if (cVar != null) {
                        cVar.P0(-1);
                        this.M.G0(553648127);
                    }
                }
            } else if (this.f43313j0) {
                this.f43313j0 = false;
                this.G.j(null);
                m4.c cVar2 = this.M;
                if (cVar2 != null) {
                    cVar2.P0(-16777216);
                    this.M.G0(536870912);
                }
            }
            F0();
        }
    }

    public final boolean l0() {
        if (p0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i10 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(2131624117, 72, getThemedColor(i10), null);
                    alertDialog$Builder.n(i10, getResourceProvider());
                    alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131749539, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751806, null), new eb0(this, 2));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    showDialog(alertDialog$Builder.f20135a);
                    return false;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return true;
            }
        }
        return true;
    }

    public final void m0(int i10) {
        s7.h aVar;
        if (this.G == null) {
            return;
        }
        List<org.telegram.messenger.ib> asList = Arrays.asList(new org.telegram.messenger.ib[]{new Object(), new Object()});
        org.telegram.messenger.wa onCreateCircleOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateCircleOptions();
        double latitude = this.E0.getLatitude();
        double longitude = this.E0.getLongitude();
        k2.m0 m0Var = (k2.m0) onCreateCircleOptions;
        j8.b bVar = (j8.b) m0Var.f10701a;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.f9708a = latLng;
        double d = i10;
        j8.b bVar2 = (j8.b) m0Var.f10701a;
        bVar2.f9709b = d;
        if (z0()) {
            bVar2.d = -1771658281;
            bVar2.e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.ib ibVar : asList) {
            if (ibVar instanceof org.telegram.messenger.hb) {
                arrayList.add(new j8.c(20, 1));
            } else if (ibVar instanceof org.telegram.messenger.gb) {
                arrayList.add(new j8.c(20, 0));
            }
        }
        bVar2.f9713r = arrayList;
        bVar2.f9710c = 2;
        org.telegram.messenger.ha haVar = this.G;
        n4.q qVar = haVar.f16038a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13527a;
            Parcel P0 = fVar.P0();
            s7.b.b(P0, bVar2);
            Parcel O0 = fVar.O0(P0, 35);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i11 = s7.g.f48101b;
            if (readStrongBinder == null) {
                aVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (queryLocalInterface instanceof s7.h) {
                    aVar = (s7.h) queryLocalInterface;
                } else {
                    aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 9);
                }
            }
            O0.recycle();
            j8.a aVar2 = new j8.a(aVar);
            m4.c cVar = new m4.c(10, haVar, aVar2);
            haVar.f16040c.put(aVar2, cVar);
            this.M = cVar;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final Bitmap n0(int i10) {
        Bitmap[] bitmapArr = this.Y0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.x4.a(i10));
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            return null;
        }
    }

    public final Bitmap o0(rb0 rb0Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.w0.f18945b.getResources().getDrawable(2131231650);
                drawable.setBounds(0, 0, org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                TLRPC.User user = rb0Var.f41031c;
                if (user != null) {
                    r8Var.r(user);
                } else {
                    TLRPC.Chat chat = rb0Var.d;
                    if (chat != null) {
                        r8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
                r8Var.setBounds(0, 0, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
                r8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = rb0Var.h;
                if (imageReceiver != null && imageReceiver.J()) {
                    bitmap = rb0Var.h.n();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = org.telegram.messenger.i0.L(50.0f) / bitmap.getWidth();
                    matrix.postTranslate(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
                    matrix.postScale(L, L);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(25.0f), paint);
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
                org.telegram.messenger.f8.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.kh0 kh0Var = this.P;
        if (kh0Var != null) {
            if (z10) {
                kh0Var.a();
                return false;
            }
        } else {
            org.telegram.messenger.ab abVar = this.I;
            if (abVar != null && ((GLSurfaceView) ((bh.d) abVar).e) != null && !this.K) {
                if (z10) {
                    C0();
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.at.f14786t);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14804v4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14811w4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.D4);
        org.telegram.messenger.kj kjVar = this.J0;
        if (kjVar != null && kjVar.C3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.at.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.z80 z80Var = this.f43309f0;
        if (z80Var != null) {
            z80Var.f33075i = true;
            z80Var.f33074g = false;
            z80Var.d();
            z80Var.d = null;
            z80Var.e = null;
            z80Var.f33073f = null;
        }
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14804v4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14811w4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.D4);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14786t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.at.m0);
        try {
            org.telegram.messenger.ha haVar = this.G;
            if (haVar != null) {
                haVar.l(false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.messenger.ab abVar = this.I;
            if (abVar != null) {
                ((bh.d) abVar).B();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        nb0 nb0Var = this.R;
        if (nb0Var != null) {
            nb0Var.F();
        }
        org.telegram.ui.Components.vk vkVar = this.U;
        if (vkVar != null) {
            vkVar.F();
        }
        bb0 bb0Var = this.R0;
        if (bb0Var != null) {
            org.telegram.messenger.i0.r(bb0Var);
            this.R0 = null;
        }
        ArrayList arrayList = this.f43319p0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            rb0 rb0Var = (rb0) arrayList.get(i10);
            ImageReceiver imageReceiver = rb0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                rb0Var.h = null;
            }
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        j0();
    }

    @Override
    public final void onLowMemory() {
        android.support.v4.media.session.a0 a0Var;
        super.onLowMemory();
        org.telegram.messenger.ab abVar = this.I;
        if (abVar != null && this.C0 && (a0Var = (android.support.v4.media.session.a0) ((m.p3) ((fg.i) ((bh.d) abVar).f2777a).f7078b).f12520b) != null) {
            try {
                i8.g gVar = (i8.g) a0Var.f876c;
                gVar.T0(gVar.P0(), 6);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.ab abVar = this.I;
        if (abVar != null && this.C0) {
            try {
                ((bh.d) abVar).D();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.D0 = false;
        R0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.ab abVar = this.I;
        if (abVar != null && this.C0) {
            try {
                ((bh.d) abVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        this.D0 = true;
        F0();
        org.telegram.messenger.ha haVar = this.G;
        if (haVar != null) {
            try {
                haVar.l(true);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        u0(true);
        if (p0()) {
            this.f43333y0 = false;
        } else if (this.f43333y0 && (parentActivity = getParentActivity()) != null) {
            this.f43333y0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        bb0 bb0Var = this.R0;
        if (bb0Var != null) {
            org.telegram.messenger.i0.r(bb0Var);
            org.telegram.messenger.i0.h3(this.R0, 5000L);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            k0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.ActionBar.p5 p5Var = this.f43323s;
            if (p5Var != null && p5Var.getSearchField() != null) {
                this.f43323s.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21038j5));
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            try {
                if (((fg.i) ((bh.d) this.I).f2777a).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((fg.i) ((bh.d) this.I).f2777a).getParent()).removeView((fg.i) ((bh.d) this.I).f2777a);
                }
            } catch (Exception unused) {
            }
            l0 l0Var = this.Q;
            if (l0Var != null) {
                l0Var.addView((fg.i) ((bh.d) this.I).f2777a, 0, w7.b6.e(-1, w0(), 51));
                tb0 tb0Var = this.f43328w;
                if (tb0Var != null) {
                    try {
                        if (tb0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f43328w.getParent()).removeView(this.f43328w);
                        }
                    } catch (Exception unused2) {
                    }
                    this.Q.addView(this.f43328w, 1, w7.b6.e(-1, w0(), 51));
                }
                P0(false);
                A0();
                F0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((fg.i) ((bh.d) this.I).f2777a, 0, w7.b6.e(-1, -1, 51));
            }
        }
    }

    public boolean p0() {
        return this instanceof cn;
    }

    public final void r0(ArrayList arrayList) {
        org.telegram.messenger.ya yaVar;
        if (this.f43318o0) {
            yaVar = ((t7.u) org.telegram.messenger.w0.k()).onCreateLatLngBoundsBuilder();
        } else {
            yaVar = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (yaVar != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((m2.t) yaVar).D(new org.telegram.messenger.db(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.f43304c.getVisibility() != 8 && org.telegram.messenger.kj.C1(message.from_id) != getUserConfig().e()) {
                    this.f43304c.setVisibility(0);
                    this.F = true;
                    this.f43304c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.voip.i2(this, 14)).start();
                }
            }
        }
        if (yaVar != null) {
            if (this.f43318o0) {
                this.S.w0(0, org.telegram.messenger.i0.L(99.0f), null);
            }
            this.f43318o0 = false;
            this.R.O(this.f43319p0);
            if (this.J0.C3()) {
                try {
                    m2.t tVar = (m2.t) yaVar;
                    org.telegram.messenger.db a2 = tVar.l().a();
                    org.telegram.messenger.db B0 = B0(a2, 100.0d, 100.0d);
                    tVar.D(B0(a2, -100.0d, -100.0d));
                    tVar.D(B0);
                    org.telegram.messenger.fa l4 = tVar.l();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.va newCameraUpdateLatLngBounds = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngBounds(l4, org.telegram.messenger.i0.L(113.0f));
                            this.H = newCameraUpdateLatLngBounds;
                            this.G.i(newCameraUpdateLatLngBounds);
                            this.H = null;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean t0() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i12;
        boolean z13 = false;
        if (this.G != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i10 = getConnectionsManager().getCurrentTime();
            } else {
                i10 = 0;
            }
            ArrayList arrayList2 = this.f43319p0;
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                rb0 rb0Var = (rb0) arrayList2.get(i13);
                org.telegram.messenger.ga gaVar = rb0Var.e;
                if (gaVar != null && (message = rb0Var.f41030b) != null && (messageMedia = message.media) != null && ((i12 = messageMedia.period) == Integer.MAX_VALUE || message.date + i12 > i10)) {
                    arrayList.add(gaVar.a());
                }
            }
            if (this.f43320q0.f(getUserConfig().e()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.E0;
            if (location != null && !z10) {
                arrayList.add(new org.telegram.messenger.db(location.getLatitude(), this.E0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.ya onCreateLatLngBoundsBuilder = ((t7.u) org.telegram.messenger.w0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i14 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    double d12 = -1.7976931348623157E308d;
                    while (i14 < size2) {
                        org.telegram.messenger.db dbVar = (org.telegram.messenger.db) arrayList.get(i14);
                        z11 = z13;
                        try {
                            ((m2.t) onCreateLatLngBoundsBuilder).D(dbVar);
                            i11 = size2;
                            z12 = true;
                        } catch (Exception e) {
                            e = e;
                            z12 = true;
                            org.telegram.messenger.f8.g(e, z12);
                            return z11;
                        }
                        try {
                            double d13 = dbVar.f15333a;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d) {
                                d = d13;
                            }
                            double d14 = dbVar.f15334b;
                            if (d14 < d11) {
                                d11 = d14;
                            }
                            if (d14 > d12) {
                                d12 = d14;
                            }
                            i14++;
                            z13 = z11;
                            size2 = i11;
                        } catch (Exception e7) {
                            e = e7;
                            org.telegram.messenger.f8.g(e, z12);
                            return z11;
                        }
                    }
                    z11 = z13;
                    z12 = true;
                    double d15 = (d10 + d) / 2.0d;
                    double d16 = (d11 + d12) / 2.0d;
                    double radians = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(d15));
                    if (Math.toRadians(d - d10) * 6366198.0d < 30.0d || radians < 30.0d) {
                        m2.t tVar = (m2.t) onCreateLatLngBoundsBuilder;
                        tVar.D(new org.telegram.messenger.db(Math.toDegrees(2.356194387921959E-6d) + d15, d16 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                        tVar.D(new org.telegram.messenger.db(d15 + Math.toDegrees(-2.356194387921959E-6d), d16 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                    }
                    this.G.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngBounds(((m2.t) onCreateLatLngBoundsBuilder).l(), org.telegram.messenger.i0.L(60.0f)), 500);
                    return true;
                } catch (Exception e10) {
                    e = e10;
                    z11 = z13;
                }
            }
        }
        return false;
    }

    public final void u0(boolean z10) {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (this.S != null) {
            int i11 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i12 = this.O0;
                if (i12 == 6) {
                    this.P0 = org.telegram.messenger.m5.z(66.0f, measuredHeight, i11);
                } else if (i12 == 2) {
                    this.P0 = org.telegram.messenger.m5.z(73.0f, measuredHeight, i11);
                } else {
                    this.P0 = org.telegram.messenger.m5.z(66.0f, measuredHeight, i11);
                }
                pb0 pb0Var = this.S0;
                if (pb0Var != null && pb0Var.l0(8) > 0) {
                    this.P0 -= org.telegram.messenger.i0.L(200.0f);
                }
                this.f43306d0 = org.telegram.messenger.i0.L(100.0f) + (measuredHeight - this.P0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                layoutParams2.height = org.telegram.messenger.i0.L(29.0f) + this.P0;
                this.Q.setLayoutParams(layoutParams2);
                this.R.Q(this.P0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.I).f2777a).getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = w0();
                    org.telegram.messenger.ha haVar = this.G;
                    if (haVar != null) {
                        haVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), v0());
                    }
                    ((fg.i) ((bh.d) this.I).f2777a).setLayoutParams(layoutParams3);
                }
                tb0 tb0Var = this.f43328w;
                if (tb0Var != null && (layoutParams = (FrameLayout.LayoutParams) tb0Var.getLayoutParams()) != null) {
                    layoutParams.height = w0();
                    this.f43328w.setLayoutParams(layoutParams);
                }
                this.R.f();
                if (z10) {
                    if (i12 == 3) {
                        i10 = 73;
                    } else if (i12 != 1 && i12 != 2) {
                        i10 = 0;
                    } else {
                        i10 = 66;
                    }
                    this.W.h1(0, -org.telegram.messenger.i0.L(i10));
                    P0(false);
                    this.S.post(new org.telegram.ui.Components.qq(this, i10, 12));
                    return;
                }
                P0(false);
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final int v0() {
        return org.telegram.messenger.i0.L(10.0f) + this.f43312i0 + this.f43306d0;
    }

    public final int w0() {
        return org.telegram.messenger.i0.L(10.0f) + this.P0 + this.f43306d0;
    }

    public final boolean x0() {
        ArrayList arrayList = (ArrayList) getLocationController().f17421c.f(org.telegram.messenger.kj.B0(this.J0.f16690k));
        if (arrayList != null && arrayList.isEmpty()) {
            r0(arrayList);
        } else {
            arrayList = null;
        }
        if (org.telegram.messenger.o5.z(this.f43317n0)) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.f43317n0));
            if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.kj.B0(this.J0.f16690k);
        tL_messages_getRecentLocations.peer = getMessagesController().i1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new jb0(this, B0, 0));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView y0() {
        UndoView[] undoViewArr = this.D;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.Q.removeView(undoViewArr[0]);
            this.Q.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean z0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.t6.I.q()) || org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)) < 0.721f) {
            return true;
        }
        return false;
    }
}
