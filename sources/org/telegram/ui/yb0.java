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
public class yb0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final UndoView[] D;
    public boolean D0;
    public boolean E;
    public Location E0;
    public boolean F;
    public Location F0;
    public org.telegram.messenger.ga G;
    public int G0;
    public org.telegram.messenger.ua H;
    public TLRPC.TL_channelLocation H0;
    public org.telegram.messenger.za I;
    public TLRPC.TL_channelLocation I0;
    public org.telegram.messenger.ua J;
    public org.telegram.messenger.jj J0;
    public boolean K;
    public boolean K0;
    public float L;
    public boolean L0;
    public m4.c M;
    public boolean M0;
    public double N;
    public tb0 N0;
    public boolean O;
    public final int O0;
    public org.telegram.ui.Components.jh0 P;
    public int P0;
    public l0 Q;
    public rb0 Q0;
    public ob0 R;
    public cb0 R0;
    public nb0 S;
    public qb0 S0;
    public org.telegram.ui.Components.tk0 T;
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
    public ImageView f43780a;
    public vg.f f43781a0;
    public TextView f43782b;
    public final RectF f43783b0;
    public ImageView f43784c;
    public int f43785c0;
    public org.telegram.ui.ActionBar.p5 d;
    public int f43786d0;
    public TextView e;
    public TextureView f43787e0;
    public LinearLayout f43788f;
    public org.telegram.ui.Components.z80 f43789f0;
    public final RectF f43790g0;
    public ImageView h;
    public final Paint f43791h0;
    public int f43792i0;
    public boolean f43793j0;
    public boolean f43794k0;
    public boolean f43795l0;
    public boolean m0;
    public TextView f43796n;
    public long f43797n0;
    public boolean f43798o0;
    public final ArrayList f43799p0;
    public final a0.h f43800q0;
    public TextView f43801r;
    public long f43802r0;
    public org.telegram.ui.ActionBar.p5 f43803s;
    public boolean f43804s0;
    public final ArrayList f43805t0;
    public AnimatorSet f43806u0;
    public org.telegram.messenger.fa f43807v0;
    public ub0 f43808w;
    public xb0 f43809w0;
    public vh.p2 f43810x;
    public FrameLayout f43811x0;
    public boolean f43812y;
    public boolean f43813y0;
    public boolean f43814z0;

    public yb0(int i10) {
        super(null);
        this.D = new UndoView[2];
        this.f43783b0 = new RectF();
        this.f43790g0 = new RectF();
        this.f43791h0 = new Paint();
        this.f43794k0 = true;
        this.f43795l0 = false;
        this.m0 = true;
        this.f43798o0 = true;
        this.f43799p0 = new ArrayList();
        this.f43800q0 = new a0.h();
        this.f43802r0 = -1L;
        this.f43805t0 = new ArrayList();
        this.f43813y0 = true;
        this.P0 = (org.telegram.messenger.i0.f16026q.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(66.0f);
        this.W0 = true;
        this.Y0 = new Bitmap[7];
        this.O0 = i10;
        org.telegram.messenger.i0.a0();
    }

    public static org.telegram.messenger.cb A0(org.telegram.messenger.cb cbVar, double d, double d10) {
        double d11 = cbVar.f14971a;
        return new org.telegram.messenger.cb(d11 + Math.toDegrees(d / 6366198.0d), cbVar.f14972b + Math.toDegrees(d10 / (Math.cos(Math.toRadians(d11)) * 6366198.0d)));
    }

    public static void Y(yb0 yb0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            org.telegram.messenger.md h = yb0Var.getLocationController().h(yb0Var.f43797n0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = yb0Var.getMessagesController().i1(h.f16940a);
                tL_messages_editMessage.f19877id = h.f16941b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = org.telegram.messenger.nd.f(yb0Var.currentAccount).f17088s;
                tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.i0.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.i0.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i12 = h.f16944g;
                int i13 = h.f16943f;
                if (i12 != i13) {
                    inputMedia.proximity_notification_radius = i13;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = org.telegram.messenger.nd.e(location);
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
                    i15 = h.f16942c + i10;
                }
                h.f16942c = i15;
                inputMedia2.flags = i14 | 6;
                org.telegram.messenger.jj jjVar = h.h;
                if (jjVar != null && (message = jjVar.f16337k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i11;
                    yb0Var.getMessagesStorage().r1(h.h.f16337k, null, null, true);
                }
                yb0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.D4, new Object[0]);
                return;
            }
            return;
        }
        yb0Var.K0(i10, 0, user);
    }

    public static void Z(yb0 yb0Var, Canvas canvas, RectF rectF) {
        fg.i iVar;
        Paint paint = yb0Var.f43791h0;
        int i10 = org.telegram.ui.ActionBar.t6.f21001h5;
        paint.setColor(yb0Var.getThemedColor(i10));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) yb0Var.fragmentView;
        org.telegram.ui.Components.tk0 tk0Var = yb0Var.T;
        if (tk0Var != null && tk0Var.getVisibility() == 0) {
            org.telegram.ui.Components.tk0 tk0Var2 = yb0Var.T;
            yg.d.a(tk0Var2, canvas, rectF, tk0Var2, viewGroup);
            return;
        }
        if (yb0Var.Q.getVisibility() == 0) {
            RectF rectF2 = yb0Var.f43790g0;
            canvas.save();
            canvas.translate(yb0Var.Q.getX(), yb0Var.Q.getY());
            canvas.clipRect(0.0f, 0.0f, yb0Var.Q.getWidth(), viewGroup.getHeight() - yb0Var.Q.getY());
            Drawable background = yb0Var.Q.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.za zaVar = yb0Var.I;
            if (zaVar != null) {
                iVar = (fg.i) ((bh.d) zaVar).f2777a;
            } else {
                iVar = null;
            }
            if (iVar != null && iVar.getParent() == yb0Var.Q && iVar.getVisibility() == 0 && iVar.getAlpha() > 0.0f) {
                TextureView textureView = yb0Var.f43787e0;
                if (textureView != null && textureView.isAttachedToWindow() && zg.h.c(yb0Var.f43787e0, yb0Var.Q, rectF2)) {
                    if (iVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (iVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    yb0Var.f43787e0.draw(canvas);
                    canvas.restore();
                } else if (yb0Var.f43789f0 != null) {
                    rectF2.set(iVar.getX(), iVar.getY(), iVar.getX() + iVar.getWidth(), iVar.getY() + iVar.getHeight());
                    org.telegram.ui.Components.z80 z80Var = yb0Var.f43789f0;
                    float alpha = iVar.getAlpha();
                    Paint paint2 = z80Var.f32976c;
                    Bitmap bitmap = z80Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            p0(canvas, yb0Var.f43808w);
            p0(canvas, yb0Var.V);
            canvas.restore();
        }
        if (yb0Var.S.getVisibility() == 0) {
            int L = org.telegram.messenger.i0.L(22.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + yb0Var.mSystemInsets.f7766b;
            float f7 = L;
            if (rectF.top >= f7) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f7), viewGroup.getWidth(), f7);
            if (yb0Var.f43785c0 < L) {
                paint.setColor(yb0Var.getThemedColor(i10));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(yb0Var.f43785c0, rectF.top), viewGroup.getWidth(), f7, paint);
            }
            nb0 nb0Var = yb0Var.S;
            yg.d.a(nb0Var, canvas, rectF, nb0Var, viewGroup);
            canvas.restore();
        }
    }

    public static void a0(yb0 yb0Var, int i10) {
        tb0 tb0Var;
        float e;
        float f7;
        TLRPC.TL_messageMediaVenue I = yb0Var.U.I(i10);
        if (I != null && I.icon != null && yb0Var.O0 == 8 && yb0Var.G != null) {
            yb0Var.K0 = true;
            yb0Var.simpleActionBar.j(true);
            if ("pin".equals(I.icon)) {
                e = yb0Var.G.e();
                f7 = 4.0f;
            } else {
                e = yb0Var.G.e();
                f7 = 9.0f;
            }
            float f10 = e - f7;
            org.telegram.messenger.ga gaVar = yb0Var.G;
            IMapsProvider k10 = org.telegram.messenger.w0.k();
            TLRPC.GeoPoint geoPoint = I.geo;
            gaVar.b(((t7.u) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), f10));
            Location location = yb0Var.F0;
            if (location != null) {
                location.setLatitude(I.geo.lat);
                yb0Var.F0.setLongitude(I.geo._long);
            }
            yb0Var.R.M(yb0Var.F0);
        } else if (I != null && (tb0Var = yb0Var.N0) != null) {
            tb0Var.d(I, yb0Var.O0, true, 0, 0L);
            yb0Var.finishFragment();
        }
    }

    public static void b0(yb0 yb0Var) {
        yb0Var.glassEngine.g();
        View view = yb0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void c0(yb0 yb0Var) {
        yb0Var.glassEngine.g();
    }

    public static void d0(yb0 yb0Var) {
        cb0 cb0Var;
        yb0Var.getLocationController().j(yb0Var.f43797n0);
        if (!yb0Var.isPaused && (cb0Var = yb0Var.R0) != null) {
            org.telegram.messenger.i0.h3(cb0Var, 5000L);
        }
    }

    public static void p0(Canvas canvas, View view) {
        if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            view.draw(canvas);
            canvas.restore();
        }
    }

    public static View r0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View r02 = r0(viewGroup.getChildAt(i10), cls);
                if (r02 != null) {
                    return r02;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean B0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar != null && (gLSurfaceView = (GLSurfaceView) ((bh.d) zaVar).e) != null && !this.K) {
            gLSurfaceView.queueEvent(new f70(14, this, gLSurfaceView));
            return true;
        }
        return false;
    }

    public final void C0(sb0 sb0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (sb0Var != null && (message = sb0Var.f41461b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d10 = geoPoint._long;
        } else {
            org.telegram.messenger.jj jjVar = this.J0;
            if (jjVar != null) {
                TLRPC.GeoPoint geoPoint2 = jjVar.f16337k.media.geo;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.H0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        boolean z10 = org.telegram.messenger.v2.f18448a;
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

    public final void D0(final boolean z10) {
        final TLRPC.User user;
        if (this.N0 != null && !o0() && getParentActivity() != null && this.E0 != null && k0()) {
            if (org.telegram.messenger.o5.E(this.f43797n0)) {
                user = getMessagesController().Z1(Long.valueOf(this.f43797n0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.s4.D(getParentActivity(), z10, user, new org.telegram.messenger.bs() {
                @Override
                public final void a(int i10) {
                    yb0.Y(yb0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void E0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.f43789f0 != null && this.I != null) {
            TextureView textureView = this.f43787e0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f43789f0.d) == null || !surfaceView.isAttachedToWindow())) {
                fg.i iVar = (fg.i) ((bh.d) this.I).f2777a;
                TextureView textureView2 = (TextureView) r0(iVar, TextureView.class);
                this.f43787e0 = textureView2;
                org.telegram.ui.Components.z80 z80Var = this.f43789f0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) r0(iVar, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (z80Var.d != surfaceView2) {
                    z80Var.d = surfaceView2;
                    z80Var.a();
                }
                TextureView textureView3 = this.f43787e0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof vb0)) {
                        this.f43787e0.setSurfaceTextureListener(new vb0(this, surfaceTextureListener));
                    }
                }
                Q0();
            }
            TextureView textureView4 = this.f43787e0;
            if (textureView4 == null) {
                this.f43789f0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof vb0)) {
                this.f43787e0.setSurfaceTextureListener(new vb0(this, surfaceTextureListener2));
            }
        }
    }

    public final void F0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.E0 = new Location(location);
        sb0 sb0Var = (sb0) this.f43800q0.f(getUserConfig().e());
        org.telegram.messenger.md h = getLocationController().h(this.f43797n0);
        if (sb0Var != null && h != null && sb0Var.f41461b.f19814id == h.f16941b) {
            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            sb0Var.e.d(cbVar);
            org.telegram.messenger.fa faVar = sb0Var.f41463f;
            if (faVar != null) {
                faVar.d(cbVar);
            }
            if (this.f43802r0 == sb0Var.f41460a) {
                this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(sb0Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.G != null) {
            org.telegram.messenger.cb cbVar2 = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            ob0 ob0Var = this.R;
            if (ob0Var != null) {
                if (!this.L0 && (i10 = this.O0) != 4 && i10 != 8) {
                    ob0Var.H(null, this.E0, true);
                }
                this.R.N(this.E0);
            }
            if (!this.K0) {
                this.F0 = new Location(location);
                if (this.M0) {
                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(cbVar2));
                } else {
                    this.M0 = true;
                    this.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(cbVar2, this.G.e() - 4.0f));
                }
            }
        } else {
            this.R.N(this.E0);
        }
        org.telegram.ui.Components.jh0 jh0Var = this.P;
        if (jh0Var != null) {
            jh0Var.c(true);
        }
        m4.c cVar = this.M;
        if (cVar != null) {
            double latitude = this.E0.getLatitude();
            double longitude = this.E0.getLongitude();
            j8.a aVar = (j8.a) cVar.f12705b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                s7.f fVar = (s7.f) aVar.f9706a;
                Parcel P0 = fVar.P0();
                s7.b.b(P0, latLng);
                fVar.T0(P0, 3);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        R0();
    }

    public final void G0(View view) {
        vg.f c10 = getBaseSimpleGlass().f6599c.c(view, null, false);
        c10.o(w7.b9.m(getResourceProvider()));
        c10.q(org.telegram.messenger.i0.L(23.0f));
        c10.p(org.telegram.messenger.i0.L(6.0f));
        view.setBackground(c10);
        w7.e6.a(view);
    }

    public final void H0(org.telegram.messenger.jj jjVar) {
        this.J0 = jjVar;
        this.f43797n0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
    }

    public final void I0(boolean z10, boolean z11) {
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
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(320L).withEndAction(new gb0(this, z10, 1)).start();
    }

    public final void J0(sb0 sb0Var) {
        if (sb0Var.h == null) {
            TLRPC.User user = sb0Var.f41462c;
            TLRPC.Chat chat = sb0Var.d;
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
            imageReceiver.f14382g1 = new rv(17, this, sb0Var);
            imageReceiver.P();
            if (user == null) {
                user = chat;
            }
            imageReceiver.i0(user, r8Var, null);
            sb0Var.h = imageReceiver;
        }
    }

    public final void K0(int i10, int i11, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.i0.b0(this.E0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.i0.b0(this.E0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.nd.e(this.E0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.N0.d(tL_messageMediaGeoLive, this.O0, true, 0, 0L);
        if (i11 > 0) {
            this.P.L = true;
            this.f43784c.setImageResource(2131232210);
            org.telegram.ui.Components.jh0 jh0Var = this.P;
            if (jh0Var != null) {
                jh0Var.a();
            }
            x0().k(0L, 24, Integer.valueOf(i11), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void L0() {
        if (this.R.b() != 0 && this.W.L0() == 0) {
            View childAt = this.S.getChildAt(0);
            int top = childAt.getTop() + org.telegram.messenger.i0.L(258.0f);
            if (top >= 0 && top <= org.telegram.messenger.i0.L(258.0f)) {
                this.S.w0(0, top, null);
            }
        }
    }

    public final void M0(boolean z10) {
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
                    I0(z10, true);
                }
            }
        }
    }

    public final void N0(boolean z10, boolean z11) {
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
            TextView textView = this.f43782b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f43782b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f43782b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f43782b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f43782b.setVisibility(0);
        ViewPropertyAnimator animate = this.f43782b.animate();
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
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(420L).withEndAction(new gb0(this, z10, 0)).start();
    }

    public final void O0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        int i12;
        s4.c1 K = this.S.K(0);
        if (K != null) {
            i10 = (int) K.f47898a.getY();
            i11 = Math.min(i10, 0) + this.P0;
            this.f43785c0 = (this.P0 + i10) - this.f43792i0;
        } else {
            i10 = -this.Q.getMeasuredHeight();
            this.f43785c0 = -org.telegram.messenger.i0.L(41.0f);
            i11 = 0;
        }
        this.S.invalidate();
        if (((FrameLayout.LayoutParams) this.Q.getLayoutParams()) != null) {
            int i13 = 4;
            if (i11 <= 0) {
                if (((fg.i) ((bh.d) this.I).f2777a).getVisibility() == 0) {
                    ((fg.i) ((bh.d) this.I).f2777a).setVisibility(4);
                    this.Q.setVisibility(4);
                    ub0 ub0Var = this.f43808w;
                    if (ub0Var != null) {
                        ub0Var.setVisibility(4);
                    }
                }
            } else if (((fg.i) ((bh.d) this.I).f2777a).getVisibility() == 4) {
                ((fg.i) ((bh.d) this.I).f2777a).setVisibility(0);
                this.Q.setVisibility(0);
                ub0 ub0Var2 = this.f43808w;
                if (ub0Var2 != null) {
                    ub0Var2.setVisibility(0);
                }
            }
            this.Q.setTranslationY(Math.min(0, i10));
            int i14 = -i10;
            int i15 = i14 / 2;
            ((fg.i) ((bh.d) this.I).f2777a).setTranslationY(Math.max(0, i15));
            ub0 ub0Var3 = this.f43808w;
            if (ub0Var3 != null) {
                ub0Var3.setTranslationY(Math.max(0, i15));
            }
            FrameLayout frameLayout = this.Y;
            float f7 = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i10));
                float l4 = Utilities.l((org.telegram.messenger.m5.z(53.0f, i11 - this.f43792i0, org.telegram.messenger.i0.L(46.0f) + ei.b.d(this.mSystemInsets.f7766b)) - org.telegram.messenger.i0.L(7.0f)) / org.telegram.messenger.i0.L(48.0f));
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
                Q0();
            }
            View view = this.V;
            if (view != null) {
                if (view.getTag() != null) {
                    f7 = 69.0f;
                }
                int L = ((i11 / 2) + (i14 - org.telegram.messenger.i0.L(f7))) - (this.f43792i0 / 2);
                this.G0 = L;
                view.setTranslationY(L);
            }
            if (!z10) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.I).f2777a).getLayoutParams();
                if (layoutParams2 != null && layoutParams2.height != v0()) {
                    layoutParams2.height = v0();
                    org.telegram.messenger.ga gaVar = this.G;
                    if (gaVar != null) {
                        gaVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), u0());
                    }
                    ((fg.i) ((bh.d) this.I).f2777a).setLayoutParams(layoutParams2);
                }
                ub0 ub0Var4 = this.f43808w;
                if (ub0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) ub0Var4.getLayoutParams()) != null && layoutParams.height != v0()) {
                    layoutParams.height = v0();
                    this.f43808w.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void P0() {
        if (this.f43814z0) {
            if (this.B0) {
                this.T.setEmptyView(null);
                this.f43788f.setVisibility(8);
                this.T.setVisibility(8);
                return;
            }
            this.T.setEmptyView(this.f43788f);
            return;
        }
        this.f43788f.setVisibility(8);
    }

    public final void Q0() {
        org.telegram.messenger.za zaVar;
        boolean z10;
        l0 l0Var;
        org.telegram.ui.Components.z80 z80Var = this.f43789f0;
        if (z80Var != null && (zaVar = this.I) != null) {
            fg.i iVar = (fg.i) ((bh.d) zaVar).f2777a;
            if (this.f43787e0 == null && this.D0 && !isFinishing() && (l0Var = this.Q) != null && l0Var.getVisibility() == 0 && iVar.getParent() != null && iVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z80Var.f32978g != z10) {
                z80Var.f32978g = z10;
                if (z10) {
                    z80Var.a();
                } else {
                    z80Var.d();
                }
            }
        }
    }

    public final void R0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f43782b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f43804s0) {
            N0(false, true);
            s0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f43799p0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((sb0) arrayList.get(i13)).f41461b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f43800q0.f(getUserConfig().e()) != null) {
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
        N0(z11, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21114n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20872a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yb0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ob0 ob0Var;
        long B0;
        ob0 ob0Var2;
        if (i10 == org.telegram.messenger.zs.f19690t) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.f19708v4) {
            this.f43795l0 = false;
            ob0 ob0Var3 = this.R;
            if (ob0Var3 != null) {
                ob0Var3.P(false, false);
            }
            org.telegram.messenger.ga gaVar = this.G;
            if (gaVar != null) {
                try {
                    gaVar.l(true);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19715w4) {
            this.f43795l0 = true;
            ob0 ob0Var4 = this.R;
            if (ob0Var4 != null) {
                ob0Var4.P(true, false);
            }
        } else if (i10 == org.telegram.messenger.zs.D4) {
            ob0 ob0Var5 = this.R;
            if (ob0Var5 != null) {
                ob0Var5.f();
            }
            R0();
        } else if (i10 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f43797n0 && this.J0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i12);
                    if (jjVar.C3()) {
                        h0(jjVar.f16337k);
                        z10 = true;
                    } else {
                        TLRPC.Message message = jjVar.f16337k;
                        if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.o5.E(org.telegram.messenger.jj.B0(message))) {
                            this.f43784c.setImageResource(2131232209);
                            m4.c cVar = this.M;
                            if (cVar != null) {
                                cVar.v0();
                                this.M = null;
                            }
                        }
                    }
                }
                if (z10 && (ob0Var2 = this.R) != null) {
                    ob0Var2.O(this.f43799p0);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f43797n0 && this.J0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i13);
                    if (jjVar2.C3()) {
                        TLRPC.Message message2 = jjVar2.f16337k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = org.telegram.messenger.jj.C1(peer);
                        } else {
                            B0 = org.telegram.messenger.jj.B0(message2);
                        }
                        sb0 sb0Var = (sb0) this.f43800q0.f(B0);
                        if (sb0Var != null) {
                            org.telegram.messenger.md h = getLocationController().h(longValue);
                            if (h == null || h.f16941b != jjVar2.f1()) {
                                TLRPC.Message message3 = jjVar2.f16337k;
                                sb0Var.f41461b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long);
                                sb0Var.e.d(cbVar);
                                if (this.f43802r0 == sb0Var.f41460a) {
                                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(sb0Var.e.a()));
                                }
                                org.telegram.messenger.fa faVar = sb0Var.f41463f;
                                if (faVar != null) {
                                    faVar.a();
                                    sb0Var.f41463f.d(cbVar);
                                    int i14 = jjVar2.f16337k.media.heading;
                                    if (i14 != 0) {
                                        sb0Var.f41463f.e(i14);
                                        if (!sb0Var.f41464g) {
                                            sb0Var.f41463f.f15533a.a(v7.n8.b(2131231649));
                                            sb0Var.f41464g = true;
                                        }
                                    } else if (sb0Var.f41464g) {
                                        sb0Var.f41463f.e(0);
                                        sb0Var.f41463f.f15533a.a(v7.n8.b(2131231648));
                                        sb0Var.f41464g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (ob0Var = this.R) != null) {
                    ob0Var.f();
                    org.telegram.ui.Components.jh0 jh0Var = this.P;
                    if (jh0Var != null) {
                        jh0Var.c(true);
                    }
                }
                if (z11) {
                    R0();
                }
            }
        }
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        if (B0()) {
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
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21001h5));
        org.telegram.ui.ActionBar.p5 p5Var = this.f43803s;
        if (p5Var != null) {
            editTextBoldCursor = p5Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21037j5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 196608, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 8, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X5));
        return arrayList;
    }

    public final sb0 h0(TLRPC.Message message) {
        sb0 sb0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d10 = geoPoint._long;
        long C1 = org.telegram.messenger.jj.C1(message.from_id);
        a0.h hVar = this.f43800q0;
        sb0 sb0Var2 = (sb0) hVar.f(C1);
        if (sb0Var2 == null) {
            ?? obj = new Object();
            obj.f41461b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f41462c = getMessagesController().Z1(Long.valueOf(obj.f41461b.from_id.user_id));
                obj.f41460a = obj.f41461b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.jj.B0(message);
                if (org.telegram.messenger.o5.E(B0)) {
                    obj.f41462c = getMessagesController().Z1(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().L0(Long.valueOf(-B0));
                }
                obj.f41460a = B0;
            }
            J0(obj);
            try {
                l2.f fVar = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                ((j8.f) fVar.f11587b).f9716a = new LatLng(d, d10);
                Bitmap n02 = n0(obj);
                sb0Var = obj;
                if (n02 != null) {
                    ((j8.f) fVar.f11587b).d = v7.n8.a(n02);
                    fVar.e(0.907f);
                    obj.e = this.G.a(fVar);
                    if (!org.telegram.messenger.h20.B(obj.f41462c)) {
                        l2.f fVar2 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                        ((j8.f) fVar2.f11587b).f9716a = new LatLng(d, d10);
                        ((j8.f) fVar2.f11587b).f9721r = true;
                        fVar2.e(0.5f);
                        org.telegram.messenger.fa a2 = this.G.a(fVar2);
                        obj.f41463f = a2;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            a2.e(i10);
                            obj.f41463f.f15533a.a(v7.n8.b(2131231649));
                            obj.f41464g = true;
                        } else {
                            a2.e(0);
                            obj.f41463f.f15533a.a(v7.n8.b(2131231648));
                            obj.f41464g = false;
                        }
                    }
                    this.f43799p0.add(obj);
                    hVar.k(obj, obj.f41460a);
                    org.telegram.messenger.md h = getLocationController().h(this.f43797n0);
                    int i11 = (obj.f41460a > getUserConfig().e() ? 1 : (obj.f41460a == getUserConfig().e() ? 0 : -1));
                    sb0Var = obj;
                    sb0Var = obj;
                    if (i11 == 0 && h != null) {
                        int i12 = obj.f41461b.f19814id;
                        sb0Var = obj;
                        if (i12 == h.f16941b) {
                            Location location = this.E0;
                            sb0Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.E0.getLongitude();
                                j8.e eVar = obj.e.f15533a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                eVar.getClass();
                                try {
                                    s7.i iVar = (s7.i) eVar.f9715a;
                                    Parcel P0 = iVar.P0();
                                    s7.b.b(P0, latLng);
                                    iVar.T0(P0, 3);
                                    sb0Var = obj;
                                } catch (RemoteException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                sb0Var = obj;
            }
        } else {
            sb0Var2.f41461b = message;
            j8.e eVar2 = sb0Var2.e.f15533a;
            LatLng latLng2 = new LatLng(d, d10);
            eVar2.getClass();
            try {
                s7.i iVar2 = (s7.i) eVar2.f9715a;
                Parcel P02 = iVar2.P0();
                s7.b.b(P02, latLng2);
                iVar2.T0(P02, 3);
                int i13 = (this.f43802r0 > sb0Var2.f41460a ? 1 : (this.f43802r0 == sb0Var2.f41460a ? 0 : -1));
                sb0Var = sb0Var2;
                if (i13 == 0) {
                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(sb0Var2.e.a()));
                    sb0Var = sb0Var2;
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        org.telegram.ui.Components.jh0 jh0Var = this.P;
        if (jh0Var != null) {
            jh0Var.c(true);
        }
        R0();
        return sb0Var;
    }

    public final void i0() {
        if (this.fragmentView != null && this.S != null) {
            i0.c cVar = this.mSystemInsets;
            int i10 = cVar.f7766b;
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
            org.telegram.ui.Components.tk0 tk0Var = this.T;
            if (tk0Var != null) {
                tk0Var.setClipToPadding(false);
                ei.b.e(this.T, i10, i11, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                t0(false);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)) > 0.699999988079071d) {
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
        int i10;
        vg.f fVar = this.f43781a0;
        if (fVar != null) {
            fVar.updateColors();
        }
        nb0 nb0Var = this.S;
        if (nb0Var != null) {
            nb0Var.invalidate();
        }
        if (this.G != null) {
            if (org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)) < 0.721f) {
                i10 = 2131624083;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                if (!this.f43793j0) {
                    this.f43793j0 = true;
                    this.G.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.f19025b, i10));
                    m4.c cVar = this.M;
                    if (cVar != null) {
                        cVar.P0(-1);
                        this.M.G0(553648127);
                    }
                }
            } else if (this.f43793j0) {
                this.f43793j0 = false;
                this.G.j(null);
                m4.c cVar2 = this.M;
                if (cVar2 != null) {
                    cVar2.P0(-16777216);
                    this.M.G0(536870912);
                }
            }
            E0();
        }
    }

    public final boolean k0() {
        if (o0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.w0.f19025b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i10 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(2131624117, 72, getThemedColor(i10), null);
                    alertDialog$Builder.n(i10, getResourceProvider());
                    alertDialog$Builder.f20134a.T = org.telegram.messenger.cd.L0(2131749539, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751806, null), new fb0(this, 2));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    showDialog(alertDialog$Builder.f20134a);
                    return false;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return true;
            }
        }
        return true;
    }

    public final void l0(int i10) {
        s7.h aVar;
        if (this.G == null) {
            return;
        }
        List<org.telegram.messenger.hb> asList = Arrays.asList(new org.telegram.messenger.hb[]{new Object(), new Object()});
        org.telegram.messenger.va onCreateCircleOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateCircleOptions();
        double latitude = this.E0.getLatitude();
        double longitude = this.E0.getLongitude();
        k2.m0 m0Var = (k2.m0) onCreateCircleOptions;
        j8.b bVar = (j8.b) m0Var.f10700a;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.f9707a = latLng;
        double d = i10;
        j8.b bVar2 = (j8.b) m0Var.f10700a;
        bVar2.f9708b = d;
        if (y0()) {
            bVar2.d = -1771658281;
            bVar2.e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.hb hbVar : asList) {
            if (hbVar instanceof org.telegram.messenger.gb) {
                arrayList.add(new j8.c(20, 1));
            } else if (hbVar instanceof org.telegram.messenger.fb) {
                arrayList.add(new j8.c(20, 0));
            }
        }
        bVar2.f9712r = arrayList;
        bVar2.f9709c = 2;
        org.telegram.messenger.ga gaVar = this.G;
        n4.q qVar = gaVar.f15689a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel P0 = fVar.P0();
            s7.b.b(P0, bVar2);
            Parcel O0 = fVar.O0(P0, 35);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i11 = s7.g.f48090b;
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
            m4.c cVar = new m4.c(10, gaVar, aVar2);
            gaVar.f15691c.put(aVar2, cVar);
            this.M = cVar;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final Bitmap m0(int i10) {
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

    public final Bitmap n0(sb0 sb0Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.w0.f19025b.getResources().getDrawable(2131231650);
                drawable.setBounds(0, 0, org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                TLRPC.User user = sb0Var.f41462c;
                if (user != null) {
                    r8Var.r(user);
                } else {
                    TLRPC.Chat chat = sb0Var.d;
                    if (chat != null) {
                        r8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
                r8Var.setBounds(0, 0, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
                r8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = sb0Var.h;
                if (imageReceiver != null && imageReceiver.J()) {
                    bitmap = sb0Var.h.n();
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

    public boolean o0() {
        return this instanceof cn;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jh0 jh0Var = this.P;
        if (jh0Var != null) {
            if (z10) {
                jh0Var.a();
                return false;
            }
        } else {
            org.telegram.messenger.za zaVar = this.I;
            if (zaVar != null && ((GLSurfaceView) ((bh.d) zaVar).e) != null && !this.K) {
                if (z10) {
                    B0();
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
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19690t);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19708v4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19715w4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.D4);
        org.telegram.messenger.jj jjVar = this.J0;
        if (jjVar != null && jjVar.C3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.zs.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.z80 z80Var = this.f43789f0;
        if (z80Var != null) {
            z80Var.f32979i = true;
            z80Var.f32978g = false;
            z80Var.d();
            z80Var.d = null;
            z80Var.e = null;
            z80Var.f32977f = null;
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19708v4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19715w4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.D4);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19690t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.m0);
        try {
            org.telegram.messenger.ga gaVar = this.G;
            if (gaVar != null) {
                gaVar.l(false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.messenger.za zaVar = this.I;
            if (zaVar != null) {
                ((bh.d) zaVar).B();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ob0 ob0Var = this.R;
        if (ob0Var != null) {
            ob0Var.F();
        }
        org.telegram.ui.Components.vk vkVar = this.U;
        if (vkVar != null) {
            vkVar.F();
        }
        cb0 cb0Var = this.R0;
        if (cb0Var != null) {
            org.telegram.messenger.i0.r(cb0Var);
            this.R0 = null;
        }
        ArrayList arrayList = this.f43799p0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb0 sb0Var = (sb0) arrayList.get(i10);
            ImageReceiver imageReceiver = sb0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                sb0Var.h = null;
            }
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        i0();
    }

    @Override
    public final void onLowMemory() {
        android.support.v4.media.session.a0 a0Var;
        super.onLowMemory();
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar != null && this.C0 && (a0Var = (android.support.v4.media.session.a0) ((m.p3) ((fg.i) ((bh.d) zaVar).f2777a).f7077b).f12519b) != null) {
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
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar != null && this.C0) {
            try {
                ((bh.d) zaVar).D();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.D0 = false;
        Q0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar != null && this.C0) {
            try {
                ((bh.d) zaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        this.D0 = true;
        E0();
        org.telegram.messenger.ga gaVar = this.G;
        if (gaVar != null) {
            try {
                gaVar.l(true);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        t0(true);
        if (o0()) {
            this.f43813y0 = false;
        } else if (this.f43813y0 && (parentActivity = getParentActivity()) != null) {
            this.f43813y0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        cb0 cb0Var = this.R0;
        if (cb0Var != null) {
            org.telegram.messenger.i0.r(cb0Var);
            org.telegram.messenger.i0.h3(this.R0, 5000L);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.ActionBar.p5 p5Var = this.f43803s;
            if (p5Var != null && p5Var.getSearchField() != null) {
                this.f43803s.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21037j5));
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
                l0Var.addView((fg.i) ((bh.d) this.I).f2777a, 0, w7.b6.e(-1, v0(), 51));
                ub0 ub0Var = this.f43808w;
                if (ub0Var != null) {
                    try {
                        if (ub0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f43808w.getParent()).removeView(this.f43808w);
                        }
                    } catch (Exception unused2) {
                    }
                    this.Q.addView(this.f43808w, 1, w7.b6.e(-1, v0(), 51));
                }
                O0(false);
                z0();
                E0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((fg.i) ((bh.d) this.I).f2777a, 0, w7.b6.e(-1, -1, 51));
            }
        }
    }

    public final void q0(ArrayList arrayList) {
        org.telegram.messenger.xa xaVar;
        if (this.f43798o0) {
            xaVar = ((t7.u) org.telegram.messenger.w0.k()).onCreateLatLngBoundsBuilder();
        } else {
            xaVar = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (xaVar != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((m2.t) xaVar).D(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long));
                }
                h0(message);
                if (this.f43784c.getVisibility() != 8 && org.telegram.messenger.jj.C1(message.from_id) != getUserConfig().e()) {
                    this.f43784c.setVisibility(0);
                    this.F = true;
                    this.f43784c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.voip.h2(this, 14)).start();
                }
            }
        }
        if (xaVar != null) {
            if (this.f43798o0) {
                this.S.w0(0, org.telegram.messenger.i0.L(99.0f), null);
            }
            this.f43798o0 = false;
            this.R.O(this.f43799p0);
            if (this.J0.C3()) {
                try {
                    m2.t tVar = (m2.t) xaVar;
                    org.telegram.messenger.cb a2 = tVar.l().a();
                    org.telegram.messenger.cb A0 = A0(a2, 100.0d, 100.0d);
                    tVar.D(A0(a2, -100.0d, -100.0d));
                    tVar.D(A0);
                    org.telegram.messenger.ea l4 = tVar.l();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.ua newCameraUpdateLatLngBounds = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngBounds(l4, org.telegram.messenger.i0.L(113.0f));
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

    public final boolean s0() {
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
            ArrayList arrayList2 = this.f43799p0;
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                sb0 sb0Var = (sb0) arrayList2.get(i13);
                org.telegram.messenger.fa faVar = sb0Var.e;
                if (faVar != null && (message = sb0Var.f41461b) != null && (messageMedia = message.media) != null && ((i12 = messageMedia.period) == Integer.MAX_VALUE || message.date + i12 > i10)) {
                    arrayList.add(faVar.a());
                }
            }
            if (this.f43800q0.f(getUserConfig().e()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.E0;
            if (location != null && !z10) {
                arrayList.add(new org.telegram.messenger.cb(location.getLatitude(), this.E0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.xa onCreateLatLngBoundsBuilder = ((t7.u) org.telegram.messenger.w0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i14 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    double d12 = -1.7976931348623157E308d;
                    while (i14 < size2) {
                        org.telegram.messenger.cb cbVar = (org.telegram.messenger.cb) arrayList.get(i14);
                        z11 = z13;
                        try {
                            ((m2.t) onCreateLatLngBoundsBuilder).D(cbVar);
                            i11 = size2;
                            z12 = true;
                        } catch (Exception e) {
                            e = e;
                            z12 = true;
                            org.telegram.messenger.f8.g(e, z12);
                            return z11;
                        }
                        try {
                            double d13 = cbVar.f14971a;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d) {
                                d = d13;
                            }
                            double d14 = cbVar.f14972b;
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
                        tVar.D(new org.telegram.messenger.cb(Math.toDegrees(2.356194387921959E-6d) + d15, d16 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                        tVar.D(new org.telegram.messenger.cb(d15 + Math.toDegrees(-2.356194387921959E-6d), d16 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
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

    public final void t0(boolean z10) {
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
                qb0 qb0Var = this.S0;
                if (qb0Var != null && qb0Var.k0(8) > 0) {
                    this.P0 -= org.telegram.messenger.i0.L(200.0f);
                }
                this.f43786d0 = org.telegram.messenger.i0.L(100.0f) + (measuredHeight - this.P0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                layoutParams2.height = org.telegram.messenger.i0.L(29.0f) + this.P0;
                this.Q.setLayoutParams(layoutParams2);
                this.R.Q(this.P0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.I).f2777a).getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = v0();
                    org.telegram.messenger.ga gaVar = this.G;
                    if (gaVar != null) {
                        gaVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), u0());
                    }
                    ((fg.i) ((bh.d) this.I).f2777a).setLayoutParams(layoutParams3);
                }
                ub0 ub0Var = this.f43808w;
                if (ub0Var != null && (layoutParams = (FrameLayout.LayoutParams) ub0Var.getLayoutParams()) != null) {
                    layoutParams.height = v0();
                    this.f43808w.setLayoutParams(layoutParams);
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
                    O0(false);
                    this.S.post(new org.telegram.ui.Components.qq(this, i10, 12));
                    return;
                }
                O0(false);
            }
        }
    }

    public final int u0() {
        return org.telegram.messenger.i0.L(10.0f) + this.f43792i0 + this.f43786d0;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final int v0() {
        return org.telegram.messenger.i0.L(10.0f) + this.P0 + this.f43786d0;
    }

    public final boolean w0() {
        ArrayList arrayList = (ArrayList) getLocationController().f17084c.f(org.telegram.messenger.jj.B0(this.J0.f16337k));
        if (arrayList != null && arrayList.isEmpty()) {
            q0(arrayList);
        } else {
            arrayList = null;
        }
        if (org.telegram.messenger.o5.z(this.f43797n0)) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.f43797n0));
            if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.jj.B0(this.J0.f16337k);
        tL_messages_getRecentLocations.peer = getMessagesController().i1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new kb0(this, B0, 0));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView x0() {
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

    public final boolean y0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.t6.I.q()) || org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void z0() {
        SharedPreferences d12;
        int i10;
        ImageView imageView = this.f43784c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.F && (i10 = (d12 = org.telegram.messenger.vp.d1()).getInt("proximityhint", 0)) < 3) {
            d12.edit().putInt("proximityhint", i10 + 1).commit();
            if (org.telegram.messenger.o5.E(this.f43797n0)) {
                this.f43810x.s(org.telegram.messenger.cd.a0("ProximityTooltioUser", null, 2131746627, org.telegram.messenger.h20.j(getMessagesController().Z1(Long.valueOf(this.f43797n0)), true)));
            } else {
                this.f43810x.s(org.telegram.messenger.cd.L0(2131746628, null));
            }
            this.f43810x.u();
        }
    }
}
