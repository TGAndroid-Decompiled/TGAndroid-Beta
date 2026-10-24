package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
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
public final class yb0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.z1, IMapsProvider.OnCameraMoveStartedListener, hg.b, IMapsProvider.ITouchInterceptor {
    public final int f43816a;
    public final rc0 f43817b;

    public yb0(rc0 rc0Var, int i10) {
        this.f43816a = i10;
        this.f43817b = rc0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f43816a) {
            case 5:
                rc0 rc0Var = this.f43817b;
                ArrayList arrayList2 = rc0Var.f41106k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((qc0) arrayList2.get(i10)).f40776b.remove();
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
                            obj.f40775a = i11;
                            IMapsProvider.IMarker addMarker = rc0Var.I.addMarker(position);
                            obj.f40776b = addMarker;
                            obj.f40777c = tL_messageMediaVenue;
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
                rc0 rc0Var2 = this.f43817b;
                rc0Var2.f41116s0 = false;
                rc0Var2.B0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43816a) {
            case 1:
                rc0 rc0Var = this.f43817b;
                if (rc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        rc0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                rc0 rc0Var2 = this.f43817b;
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
    public void h(int i10) {
        IMapsProvider.IMap iMap = this.f43817b.I;
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
        s4.b1 T;
        int dp;
        rc0 rc0Var = this.f43817b;
        int i11 = rc0Var.F0;
        if (i10 == 1) {
            rc0Var.y0(true);
            if (rc0Var.m0 != null) {
                rc0Var.X.setVisibility(0);
                oc0 oc0Var = rc0Var.f41122x;
                IMapsProvider.IMarker iMarker = rc0Var.m0;
                HashMap hashMap = oc0Var.f40159a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    oc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                rc0Var.m0 = null;
                rc0Var.f41109n0 = null;
                rc0Var.f41110o0 = null;
            }
            rc0Var.f41104i0 = -1L;
            if (rc0Var.f41105j0) {
                rc0Var.f41105j0 = false;
                rc0Var.C0();
            }
            if (!rc0Var.Q) {
                if ((i11 == 0 || i11 == 1) && rc0Var.U.getChildCount() > 0 && (childAt = rc0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.lm0 lm0Var = rc0Var.U;
                    View F = lm0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = lm0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = rc0Var.I.getCameraPosition();
                            rc0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            rc0Var.U.v0(0, top + dp, null);
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
        int i10 = this.f43816a;
        rc0 rc0Var = this.f43817b;
        switch (i10) {
            case 6:
                if (rc0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-rc0Var.N) / 2.0f);
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
                if (rc0Var.A0 == null && rc0Var.f41125y0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = rc0Var.f41107l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        rc0Var.f41107l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        rc0Var.f41107l0.playTogether(ObjectAnimator.ofFloat(rc0Var.X, View.TRANSLATION_Y, rc0Var.f41123x0 - AndroidUtilities.dp(10.0f)));
                        rc0Var.f41107l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = rc0Var.f41107l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        rc0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        rc0Var.f41107l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        rc0Var.f41107l0.playTogether(ObjectAnimator.ofFloat(rc0Var.X, View.TRANSLATION_Y, rc0Var.f41123x0));
                        rc0Var.f41107l0.start();
                        rc0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!rc0Var.B0) {
                            ImageView imageView = rc0Var.f41092a;
                            int i11 = org.telegram.ui.ActionBar.k6.ui;
                            org.telegram.ui.ActionBar.r6.t(imageView, i11, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            rc0Var.f41092a.setTag(Integer.valueOf(i11));
                            rc0Var.B0 = true;
                        }
                        IMapsProvider.IMap iMap = rc0Var.I;
                        if (iMap != null && (location = rc0Var.f41121w0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            rc0Var.f41121w0.setLongitude(rc0Var.I.getCameraPosition().target.longitude);
                        }
                        rc0Var.T.L(rc0Var.f41121w0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
