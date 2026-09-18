package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLRPC;
public final class rc0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.a2, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final int f37033a;
    public final jd0 f37034b;

    public rc0(jd0 jd0Var, int i10) {
        this.f37033a = i10;
        this.f37034b = jd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f37033a) {
            case 5:
                jd0 jd0Var = this.f37034b;
                ArrayList arrayList2 = jd0Var.f34825k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((id0) arrayList2.get(i10)).f34499b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(jd0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f34498a = i11;
                            IMapsProvider.IMarker addMarker = jd0Var.I.addMarker(position);
                            obj.f34499b = addMarker;
                            obj.f34500c = tL_messageMediaVenue;
                            addMarker.setTag(obj);
                            arrayList2.add(obj);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    return;
                }
                return;
            default:
                jd0 jd0Var2 = this.f37034b;
                jd0Var2.f34836t0 = false;
                jd0Var2.B0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37033a) {
            case 1:
                jd0 jd0Var = this.f37034b;
                if (jd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        jd0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                jd0 jd0Var2 = this.f37034b;
                if (jd0Var2.getParentActivity() != null) {
                    try {
                        jd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f37034b.I;
        if (iMap != null) {
            if (i10 == 2) {
                iMap.setMapType(0);
            } else if (i10 == 3) {
                iMap.setMapType(1);
            } else if (i10 == 4) {
                iMap.setMapType(2);
            }
        }
    }

    @Override
    public void onCameraMoveStarted(int i10) {
        View childAt;
        s4.c1 U;
        int dp;
        jd0 jd0Var = this.f37034b;
        int i11 = jd0Var.G0;
        if (i10 == 1) {
            jd0Var.y0(true);
            if (jd0Var.m0 != null) {
                jd0Var.X.setVisibility(0);
                gd0 gd0Var = jd0Var.f34841x;
                IMapsProvider.IMarker iMarker = jd0Var.m0;
                HashMap hashMap = gd0Var.f33814a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    gd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                jd0Var.m0 = null;
                jd0Var.f34828n0 = null;
                jd0Var.f34829o0 = null;
            }
            jd0Var.f34823i0 = -1L;
            if (jd0Var.f34824j0) {
                jd0Var.f34824j0 = false;
                jd0Var.C0();
            }
            if (!jd0Var.Q) {
                if ((i11 == 0 || i11 == 1) && jd0Var.U.getChildCount() > 0 && (childAt = jd0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.wl0 wl0Var = jd0Var.U;
                    View G = wl0Var.G(childAt);
                    if (G == null) {
                        U = null;
                    } else {
                        U = wl0Var.U(G);
                    }
                    if (U != null && U.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = jd0Var.I.getCameraPosition();
                            jd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            jd0Var.U.w0(0, top + dp, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f37033a;
        jd0 jd0Var = this.f37034b;
        switch (i10) {
            case 6:
                if (jd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-jd0Var.N) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (jd0Var.B0 == null && jd0Var.f34845z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = jd0Var.f34826l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        jd0Var.f34826l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        jd0Var.f34826l0.playTogether(ObjectAnimator.ofFloat(jd0Var.X, View.TRANSLATION_Y, jd0Var.f34844y0 - AndroidUtilities.dp(10.0f)));
                        jd0Var.f34826l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = jd0Var.f34826l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        jd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        jd0Var.f34826l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        jd0Var.f34826l0.playTogether(ObjectAnimator.ofFloat(jd0Var.X, View.TRANSLATION_Y, jd0Var.f34844y0));
                        jd0Var.f34826l0.start();
                        jd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!jd0Var.C0) {
                            ImageView imageView = jd0Var.f34811a;
                            int i11 = org.telegram.ui.ActionBar.j6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(jd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            jd0Var.f34811a.setTag(Integer.valueOf(i11));
                            jd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = jd0Var.I;
                        if (iMap != null && (location = jd0Var.f34842x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            jd0Var.f34842x0.setLongitude(jd0Var.I.getCameraPosition().target.longitude);
                        }
                        jd0Var.T.L(jd0Var.f34842x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
