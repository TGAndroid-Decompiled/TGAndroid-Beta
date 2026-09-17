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
public final class sc0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.b2, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final int f37463a;
    public final kd0 f37464b;

    public sc0(kd0 kd0Var, int i10) {
        this.f37463a = i10;
        this.f37464b = kd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f37463a) {
            case 5:
                kd0 kd0Var = this.f37464b;
                ArrayList arrayList2 = kd0Var.f35228k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((jd0) arrayList2.get(i10)).f34848b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(kd0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f34847a = i11;
                            IMapsProvider.IMarker addMarker = kd0Var.I.addMarker(position);
                            obj.f34848b = addMarker;
                            obj.f34849c = tL_messageMediaVenue;
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
                kd0 kd0Var2 = this.f37464b;
                kd0Var2.f35239t0 = false;
                kd0Var2.B0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37463a) {
            case 1:
                kd0 kd0Var = this.f37464b;
                if (kd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        kd0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                kd0 kd0Var2 = this.f37464b;
                if (kd0Var2.getParentActivity() != null) {
                    try {
                        kd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f37464b.I;
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
        kd0 kd0Var = this.f37464b;
        int i11 = kd0Var.G0;
        if (i10 == 1) {
            kd0Var.y0(true);
            if (kd0Var.m0 != null) {
                kd0Var.X.setVisibility(0);
                hd0 hd0Var = kd0Var.f35244x;
                IMapsProvider.IMarker iMarker = kd0Var.m0;
                HashMap hashMap = hd0Var.f34238a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    hd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                kd0Var.m0 = null;
                kd0Var.f35231n0 = null;
                kd0Var.f35232o0 = null;
            }
            kd0Var.f35226i0 = -1L;
            if (kd0Var.f35227j0) {
                kd0Var.f35227j0 = false;
                kd0Var.C0();
            }
            if (!kd0Var.Q) {
                if ((i11 == 0 || i11 == 1) && kd0Var.U.getChildCount() > 0 && (childAt = kd0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.ml0 ml0Var = kd0Var.U;
                    View G = ml0Var.G(childAt);
                    if (G == null) {
                        U = null;
                    } else {
                        U = ml0Var.U(G);
                    }
                    if (U != null && U.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = kd0Var.I.getCameraPosition();
                            kd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            kd0Var.U.w0(0, top + dp, null);
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
        int i10 = this.f37463a;
        kd0 kd0Var = this.f37464b;
        switch (i10) {
            case 6:
                if (kd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-kd0Var.N) / 2.0f);
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
                if (kd0Var.B0 == null && kd0Var.f35248z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = kd0Var.f35229l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        kd0Var.f35229l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        kd0Var.f35229l0.playTogether(ObjectAnimator.ofFloat(kd0Var.X, View.TRANSLATION_Y, kd0Var.f35247y0 - AndroidUtilities.dp(10.0f)));
                        kd0Var.f35229l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = kd0Var.f35229l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        kd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        kd0Var.f35229l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        kd0Var.f35229l0.playTogether(ObjectAnimator.ofFloat(kd0Var.X, View.TRANSLATION_Y, kd0Var.f35247y0));
                        kd0Var.f35229l0.start();
                        kd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!kd0Var.C0) {
                            ImageView imageView = kd0Var.f35214a;
                            int i11 = org.telegram.ui.ActionBar.j6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(kd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            kd0Var.f35214a.setTag(Integer.valueOf(i11));
                            kd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = kd0Var.I;
                        if (iMap != null && (location = kd0Var.f35245x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            kd0Var.f35245x0.setLongitude(kd0Var.I.getCameraPosition().target.longitude);
                        }
                        kd0Var.T.L(kd0Var.f35245x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
