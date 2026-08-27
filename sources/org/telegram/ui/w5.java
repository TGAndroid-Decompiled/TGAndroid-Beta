package org.telegram.ui;

import android.view.WindowManager;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class w5 implements Runnable {

    public final int f43608a;

    public final Object f43609b;

    public w5(Object obj, int i10) {
        this.f43608a = i10;
        this.f43609b = obj;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.voip.l lVarI0;
        org.telegram.ui.Components.voip.t renderer;
        org.telegram.ui.Components.voip.o oVar;
        k70 k70Var;
        EGL10 egl10;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        switch (this.f43608a) {
            case 0:
                BubbleActivity bubbleActivity = (BubbleActivity) this.f43609b;
                if (bubbleActivity.U == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        bubbleActivity.z();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    bubbleActivity.U = null;
                }
                break;
            case 1:
                t9 t9Var = (t9) this.f43609b;
                CameraView cameraView = t9Var.f42821c;
                if (cameraView != null && !t9Var.I && cameraView.getCameraSession() != null) {
                    t9Var.f42822e.post(new lt0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43609b;
                contactsActivity.d.Z();
                contactsActivity.f35426h0 = false;
                break;
            case 3:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f43609b;
                if (externalActionActivity.f35478w == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        externalActionActivity.i();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    externalActionActivity.f35478w = null;
                }
                break;
            case 4:
                i10 i10Var = (i10) this.f43609b;
                if (i10Var.I) {
                    i10Var.f38943f.clear();
                    i10Var.f38951n.clear();
                    i10Var.f38953r.clear();
                    org.telegram.ui.Components.yk0 yk0Var = i10Var.d;
                    if (yk0Var != null) {
                        yk0Var.l();
                    }
                }
                break;
            case 5:
                s50 s50Var = ((y20) this.f43609b).f44686b;
                s50Var.f42506x.setAnimation(s50Var.F0);
                s50Var.H0 = false;
                break;
            case 6:
                try {
                    s50 s50Var2 = (s50) this.f43609b;
                    j30 j30Var = s50Var2.W1;
                    if (j30Var != null && !j30Var.f33648b && (lVarI0 = s50.I0(s50Var2)) != null && lVarI0.isAttachedToWindow() && (renderer = lVarI0.getRenderer()) != null && (oVar = renderer.f33871a) != null) {
                        s50.D3.postRunnable(new org.telegram.ui.Components.r61(29, this, oVar));
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 7:
                if (((k70) this.f43609b).h) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    k70 k70Var2 = (k70) this.f43609b;
                    if (k70Var2.f39637e.equals(k70Var2.f39635b.eglGetCurrentContext())) {
                        k70 k70Var3 = (k70) this.f43609b;
                        if (!k70Var3.f39638f.equals(k70Var3.f39635b.eglGetCurrentSurface(12377))) {
                            k70Var = (k70) this.f43609b;
                            egl10 = k70Var.f39635b;
                            eGLDisplay = k70Var.f39636c;
                            eGLSurface = k70Var.f39638f;
                            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, k70Var.f39637e)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.rl.r(((k70) this.f43609b).f39635b, new StringBuilder("eglMakeCurrent failed "));
                                }
                            }
                        }
                    } else {
                        k70Var = (k70) this.f43609b;
                        egl10 = k70Var.f39635b;
                        eGLDisplay = k70Var.f39636c;
                        eGLSurface = k70Var.f39638f;
                        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, k70Var.f39637e)) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.rl.r(((k70) this.f43609b).f39635b, new StringBuilder("eglMakeCurrent failed "));
                            }
                        }
                    }
                    int iMin = (int) Math.min(jCurrentTimeMillis - ((k70) this.f43609b).f39641s, 16L);
                    l70 l70Var = ((k70) this.f43609b).f39643x;
                    float f10 = (jCurrentTimeMillis - l70Var.F) / 1000.0f;
                    Intro.setPage(l70Var.D);
                    Intro.setDate(f10);
                    Intro.onDrawFrame(iMin);
                    k70 k70Var4 = (k70) this.f43609b;
                    k70Var4.f39635b.eglSwapBuffers(k70Var4.f39636c, k70Var4.f39638f);
                    k70 k70Var5 = (k70) this.f43609b;
                    k70Var5.f39641s = jCurrentTimeMillis;
                    float f11 = 0.0f;
                    if (k70Var5.f39640r == 0.0f) {
                        for (float f12 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f12 > f11) {
                                f11 = f12;
                            }
                        }
                        ((k70) this.f43609b).f39640r = f11;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    k70 k70Var6 = (k70) this.f43609b;
                    k70Var6.postRunnable(k70Var6.f39642w, Math.max(((long) (1000.0f / k70Var6.f39640r)) - jCurrentTimeMillis2, 0L));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.f43609b;
                if (launchActivity.V0 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.G0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.V0 = null;
                }
                break;
            case 9:
                ue0 ue0Var = (ue0) this.f43609b;
                if (ue0Var.h == this) {
                    ue0Var.o();
                    AndroidUtilities.runOnUIThread(ue0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((vi0) this.f43609b).P.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                dj0 dj0Var = (dj0) this.f43609b;
                String str = dj0Var.f37422f0;
                if (str != null) {
                    dj0.Q(dj0Var, str);
                }
                break;
            case 12:
                yu0 yu0Var = (yu0) this.f43609b;
                w5 w5Var = yu0Var.f44943u0;
                org.telegram.ui.Cells.z5 z5Var = yu0Var.X;
                if (z5Var != null) {
                    EditTextBoldCursor editField = z5Var.getEditField();
                    if (!yu0Var.Q && editField != null && yu0Var.P && !yu0Var.U && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(w5Var);
                        AndroidUtilities.runOnUIThread(w5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((q91) this.f43609b).X.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                ld1 ld1Var = (ld1) this.f43609b;
                ld1Var.B.setVisibility(0);
                ld1Var.B.setAlpha(0.0f);
                ld1Var.B.animate().alpha(1.0f).start();
                break;
            default:
                hi1 hi1Var = (hi1) this.f43609b;
                MessageObject messageObject = hi1Var.f38846n;
                if (messageObject != null && hi1Var.getParentActivity() != null && hi1Var.f38848s != null) {
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) hi1Var).currentAccount).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(hi1Var.f38848s, 25000L);
                    break;
                }
                break;
        }
    }
}
