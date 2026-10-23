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
public final class zb0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.z1, IMapsProvider.OnCameraMoveStartedListener, hg.b, IMapsProvider.ITouchInterceptor {
    public final int f44103a;
    public final sc0 f44104b;

    public zb0(sc0 sc0Var, int i10) {
        this.f44103a = i10;
        this.f44104b = sc0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f44103a) {
            case 5:
                sc0 sc0Var = this.f44104b;
                ArrayList arrayList2 = sc0Var.f41361k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((rc0) arrayList2.get(i10)).f41088b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(sc0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f41087a = i11;
                            IMapsProvider.IMarker addMarker = sc0Var.I.addMarker(position);
                            obj.f41088b = addMarker;
                            obj.f41089c = tL_messageMediaVenue;
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
                sc0 sc0Var2 = this.f44104b;
                sc0Var2.f41372t0 = false;
                sc0Var2.B0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44103a) {
            case 1:
                sc0 sc0Var = this.f44104b;
                if (sc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        sc0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                sc0 sc0Var2 = this.f44104b;
                if (sc0Var2.getParentActivity() != null) {
                    try {
                        sc0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void h(int i10) {
        IMapsProvider.IMap iMap = this.f44104b.I;
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
        sc0 sc0Var = this.f44104b;
        int i11 = sc0Var.G0;
        if (i10 == 1) {
            sc0Var.y0(true);
            if (sc0Var.m0 != null) {
                sc0Var.X.setVisibility(0);
                pc0 pc0Var = sc0Var.f41377x;
                IMapsProvider.IMarker iMarker = sc0Var.m0;
                HashMap hashMap = pc0Var.f40449a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    pc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                sc0Var.m0 = null;
                sc0Var.f41364n0 = null;
                sc0Var.f41365o0 = null;
            }
            sc0Var.f41359i0 = -1L;
            if (sc0Var.f41360j0) {
                sc0Var.f41360j0 = false;
                sc0Var.C0();
            }
            if (!sc0Var.Q) {
                if ((i11 == 0 || i11 == 1) && sc0Var.U.getChildCount() > 0 && (childAt = sc0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.mm0 mm0Var = sc0Var.U;
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
                            IMapsProvider.CameraPosition cameraPosition = sc0Var.I.getCameraPosition();
                            sc0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            sc0Var.U.v0(0, top + dp, null);
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
        int i10 = this.f44103a;
        sc0 sc0Var = this.f44104b;
        switch (i10) {
            case 6:
                if (sc0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-sc0Var.N) / 2.0f);
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
                if (sc0Var.B0 == null && sc0Var.f41381z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = sc0Var.f41362l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        sc0Var.f41362l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        sc0Var.f41362l0.playTogether(ObjectAnimator.ofFloat(sc0Var.X, View.TRANSLATION_Y, sc0Var.f41380y0 - AndroidUtilities.dp(10.0f)));
                        sc0Var.f41362l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = sc0Var.f41362l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        sc0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        sc0Var.f41362l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        sc0Var.f41362l0.playTogether(ObjectAnimator.ofFloat(sc0Var.X, View.TRANSLATION_Y, sc0Var.f41380y0));
                        sc0Var.f41362l0.start();
                        sc0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!sc0Var.C0) {
                            ImageView imageView = sc0Var.f41347a;
                            int i11 = org.telegram.ui.ActionBar.k6.ui;
                            org.telegram.ui.ActionBar.r6.t(imageView, i11, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            sc0Var.f41347a.setTag(Integer.valueOf(i11));
                            sc0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = sc0Var.I;
                        if (iMap != null && (location = sc0Var.f41378x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            sc0Var.f41378x0.setLongitude(sc0Var.I.getCameraPosition().target.longitude);
                        }
                        sc0Var.T.L(sc0Var.f41378x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
