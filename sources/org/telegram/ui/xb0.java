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
public final class xb0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.b2, IMapsProvider.OnCameraMoveStartedListener, rf.b, IMapsProvider.ITouchInterceptor {
    public final int f44540a;
    public final rc0 f44541b;

    public xb0(rc0 rc0Var, int i10) {
        this.f44540a = i10;
        this.f44541b = rc0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f44540a) {
            case 5:
                rc0 rc0Var = this.f44541b;
                ArrayList arrayList2 = rc0Var.f42043g0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((qc0) arrayList2.get(i10)).f41621b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(rc0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f41620a = i11;
                            IMapsProvider.IMarker addMarker = rc0Var.E.addMarker(position);
                            obj.f41621b = addMarker;
                            obj.f41622c = tL_messageMediaVenue;
                            addMarker.setTag(obj);
                            arrayList2.add(obj);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    return;
                }
                return;
            default:
                rc0 rc0Var2 = this.f44541b;
                rc0Var2.f42052p0 = false;
                rc0Var2.B0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44540a) {
            case 1:
                rc0 rc0Var = this.f44541b;
                if (rc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        rc0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            default:
                rc0 rc0Var2 = this.f44541b;
                if (rc0Var2.getParentActivity() != null) {
                    try {
                        rc0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void i(int i10) {
        IMapsProvider.IMap iMap = this.f44541b.E;
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
        f2.n1 T;
        int dp;
        rc0 rc0Var = this.f44541b;
        int i11 = rc0Var.C0;
        if (i10 == 1) {
            rc0Var.y0(true);
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
            rc0Var.f42040e0 = -1L;
            if (rc0Var.f42042f0) {
                rc0Var.f42042f0 = false;
                rc0Var.C0();
            }
            if (!rc0Var.M) {
                if ((i11 == 0 || i11 == 1) && rc0Var.Q.getChildCount() > 0 && (childAt = rc0Var.Q.getChildAt(0)) != null) {
                    org.telegram.ui.Components.jl0 jl0Var = rc0Var.Q;
                    View F = jl0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = jl0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = rc0Var.E.getCameraPosition();
                            rc0Var.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            rc0Var.Q.v0(0, top + dp, null);
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
        int i10 = this.f44540a;
        rc0 rc0Var = this.f44541b;
        switch (i10) {
            case 6:
                if (rc0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-rc0Var.J) / 2.0f);
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
                if (rc0Var.f42064x0 == null && rc0Var.f42060v0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = rc0Var.f42044h0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        rc0Var.f42044h0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        rc0Var.f42044h0.playTogether(ObjectAnimator.ofFloat(rc0Var.T, View.TRANSLATION_Y, rc0Var.f42059u0 - AndroidUtilities.dp(10.0f)));
                        rc0Var.f42044h0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = rc0Var.f42044h0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        rc0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        rc0Var.f42044h0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        rc0Var.f42044h0.playTogether(ObjectAnimator.ofFloat(rc0Var.T, View.TRANSLATION_Y, rc0Var.f42059u0));
                        rc0Var.f42044h0.start();
                        rc0Var.P.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!rc0Var.f42066y0) {
                            ImageView imageView = rc0Var.f42032a;
                            int i11 = org.telegram.ui.ActionBar.g6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(rc0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            rc0Var.f42032a.setTag(Integer.valueOf(i11));
                            rc0Var.f42066y0 = true;
                        }
                        IMapsProvider.IMap iMap = rc0Var.E;
                        if (iMap != null && (location = rc0Var.f42058t0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            rc0Var.f42058t0.setLongitude(rc0Var.E.getCameraPosition().target.longitude);
                        }
                        rc0Var.P.L(rc0Var.f42058t0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
