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
public final class tc0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.z1, IMapsProvider.OnCameraMoveStartedListener, hg.b, IMapsProvider.ITouchInterceptor {
    public final int f40072a;
    public final ld0 f40073b;

    public tc0(ld0 ld0Var, int i10) {
        this.f40072a = i10;
        this.f40073b = ld0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f40072a) {
            case 5:
                ld0 ld0Var = this.f40073b;
                ArrayList arrayList2 = ld0Var.f37697k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((kd0) arrayList2.get(i10)).f37351b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(ld0Var.e0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f37350a = i11;
                            IMapsProvider.IMarker addMarker = ld0Var.I.addMarker(position);
                            obj.f37351b = addMarker;
                            obj.f37352c = tL_messageMediaVenue;
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
                ld0 ld0Var2 = this.f40073b;
                ld0Var2.f37708t0 = false;
                ld0Var2.A0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40072a) {
            case 1:
                ld0 ld0Var = this.f40073b;
                if (ld0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        ld0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                ld0 ld0Var2 = this.f40073b;
                if (ld0Var2.getParentActivity() != null) {
                    try {
                        ld0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void k(int i10) {
        IMapsProvider.IMap iMap = this.f40073b.I;
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
        ld0 ld0Var = this.f40073b;
        int i11 = ld0Var.G0;
        if (i10 == 1) {
            ld0Var.x0(true);
            if (ld0Var.m0 != null) {
                ld0Var.X.setVisibility(0);
                id0 id0Var = ld0Var.f37713x;
                IMapsProvider.IMarker iMarker = ld0Var.m0;
                HashMap hashMap = id0Var.f36786a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    id0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                ld0Var.m0 = null;
                ld0Var.f37700n0 = null;
                ld0Var.f37701o0 = null;
            }
            ld0Var.f37695i0 = -1L;
            if (ld0Var.f37696j0) {
                ld0Var.f37696j0 = false;
                ld0Var.B0();
            }
            if (!ld0Var.Q) {
                if ((i11 == 0 || i11 == 1) && ld0Var.U.getChildCount() > 0 && (childAt = ld0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.mm0 mm0Var = ld0Var.U;
                    View F = mm0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = mm0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = ld0Var.I.getCameraPosition();
                            ld0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            ld0Var.U.v0(0, top + dp, null);
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
        int i10 = this.f40072a;
        ld0 ld0Var = this.f40073b;
        switch (i10) {
            case 6:
                if (ld0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ld0Var.N) / 2.0f);
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
                if (ld0Var.B0 == null && ld0Var.f37717z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = ld0Var.f37698l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ld0Var.f37698l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        ld0Var.f37698l0.playTogether(ObjectAnimator.ofFloat(ld0Var.X, View.TRANSLATION_Y, ld0Var.f37716y0 - AndroidUtilities.dp(10.0f)));
                        ld0Var.f37698l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = ld0Var.f37698l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        ld0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        ld0Var.f37698l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        ld0Var.f37698l0.playTogether(ObjectAnimator.ofFloat(ld0Var.X, View.TRANSLATION_Y, ld0Var.f37716y0));
                        ld0Var.f37698l0.start();
                        ld0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!ld0Var.C0) {
                            ImageView imageView = ld0Var.f37683a;
                            int i11 = org.telegram.ui.ActionBar.g6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            ld0Var.f37683a.setTag(Integer.valueOf(i11));
                            ld0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = ld0Var.I;
                        if (iMap != null && (location = ld0Var.f37714x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            ld0Var.f37714x0.setLongitude(ld0Var.I.getCameraPosition().target.longitude);
                        }
                        ld0Var.T.L(ld0Var.f37714x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
