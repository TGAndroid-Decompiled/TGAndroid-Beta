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
public final class vb0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.b2, IMapsProvider.OnCameraMoveStartedListener, of.b, IMapsProvider.ITouchInterceptor {
    public final int f43422a;
    public final pc0 f43423b;

    public vb0(pc0 pc0Var, int i9) {
        this.f43422a = i9;
        this.f43423b = pc0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f43422a) {
            case 5:
                pc0 pc0Var = this.f43423b;
                ArrayList arrayList2 = pc0Var.f41452g0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        ((oc0) arrayList2.get(i9)).f41054b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(pc0Var.e0(i10));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f41053a = i10;
                            IMapsProvider.IMarker addMarker = pc0Var.E.addMarker(position);
                            obj.f41054b = addMarker;
                            obj.f41055c = tL_messageMediaVenue;
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
                pc0 pc0Var2 = this.f43423b;
                pc0Var2.f41461p0 = false;
                pc0Var2.A0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f43422a) {
            case 1:
                pc0 pc0Var = this.f43423b;
                if (pc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        pc0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            default:
                pc0 pc0Var2 = this.f43423b;
                if (pc0Var2.getParentActivity() != null) {
                    try {
                        pc0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void i(int i9) {
        IMapsProvider.IMap iMap = this.f43423b.E;
        if (iMap != null) {
            if (i9 == 2) {
                iMap.setMapType(0);
            } else if (i9 == 3) {
                iMap.setMapType(1);
            } else if (i9 == 4) {
                iMap.setMapType(2);
            }
        }
    }

    @Override
    public void onCameraMoveStarted(int i9) {
        View childAt;
        f2.q1 T;
        int dp;
        pc0 pc0Var = this.f43423b;
        int i10 = pc0Var.C0;
        if (i9 == 1) {
            pc0Var.x0(true);
            if (pc0Var.f41454i0 != null) {
                pc0Var.T.setVisibility(0);
                mc0 mc0Var = pc0Var.f41472x;
                IMapsProvider.IMarker iMarker = pc0Var.f41454i0;
                HashMap hashMap = mc0Var.f40390a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    mc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                pc0Var.f41454i0 = null;
                pc0Var.f41455j0 = null;
                pc0Var.f41456k0 = null;
            }
            pc0Var.f41449e0 = -1L;
            if (pc0Var.f41451f0) {
                pc0Var.f41451f0 = false;
                pc0Var.B0();
            }
            if (!pc0Var.M) {
                if ((i10 == 0 || i10 == 1) && pc0Var.Q.getChildCount() > 0 && (childAt = pc0Var.Q.getChildAt(0)) != null) {
                    org.telegram.ui.Components.wk0 wk0Var = pc0Var.Q;
                    View F = wk0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = wk0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i10 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = pc0Var.E.getCameraPosition();
                            pc0Var.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            pc0Var.Q.v0(0, top + dp, null);
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
        int i9 = this.f43422a;
        pc0 pc0Var = this.f43423b;
        switch (i9) {
            case 6:
                if (pc0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-pc0Var.J) / 2.0f);
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
                if (pc0Var.f41473x0 == null && pc0Var.f41469v0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = pc0Var.f41453h0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        pc0Var.f41453h0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        pc0Var.f41453h0.playTogether(ObjectAnimator.ofFloat(pc0Var.T, View.TRANSLATION_Y, pc0Var.f41468u0 - AndroidUtilities.dp(10.0f)));
                        pc0Var.f41453h0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = pc0Var.f41453h0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        pc0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        pc0Var.f41453h0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        pc0Var.f41453h0.playTogether(ObjectAnimator.ofFloat(pc0Var.T, View.TRANSLATION_Y, pc0Var.f41468u0));
                        pc0Var.f41453h0.start();
                        pc0Var.P.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!pc0Var.f41475y0) {
                            ImageView imageView = pc0Var.f41441a;
                            int i10 = org.telegram.ui.ActionBar.f6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                            pc0Var.f41441a.setTag(Integer.valueOf(i10));
                            pc0Var.f41475y0 = true;
                        }
                        IMapsProvider.IMap iMap = pc0Var.E;
                        if (iMap != null && (location = pc0Var.f41467t0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            pc0Var.f41467t0.setLongitude(pc0Var.E.getCameraPosition().target.longitude);
                        }
                        pc0Var.P.L(pc0Var.f41467t0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
