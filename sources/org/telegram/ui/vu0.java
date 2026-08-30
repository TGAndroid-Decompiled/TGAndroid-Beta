package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
public class vu0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public ru0 E;
    public su0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup f39249a;
    public final ViewGroup f39250b;
    public final boolean f39251c;
    public uu0 d;
    public View e;
    public ImageReceiver f39252f;
    public ImageReceiver f39253g;
    public ImageReceiver h;
    public boolean f39254i;
    public final ih.k f39255j;
    public ih.j f39256k;
    public final Path f39257l;
    public final float[] f39258m;
    public boolean f39259n;
    public float f39260o;
    public float f39261p;
    public float f39262q;
    public float f39263r;
    public float f39264s;
    public float f39265t;
    public float f39266u;
    public float v;
    public float f39267w;
    public float f39268x;
    public float f39269y;
    public float f39270z;

    public vu0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f39253g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f39255j = new ih.k();
        this.f39257l = new Path();
        this.f39258m = new float[8];
        this.Q = new float[2];
        this.f39249a = viewGroup;
        this.f39250b = viewGroup2;
        this.f39251c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
                    if (this.M == motionEvent.getPointerId(i17)) {
                        i15 = i17;
                    }
                    if (this.N == motionEvent.getPointerId(i17)) {
                        i16 = i17;
                    }
                }
                if (i15 != -1 && i16 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f39259n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f39264s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f39265t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = messageObject;
                        uu0 uu0Var = this.d;
                        ViewGroup viewGroup2 = this.f39249a;
                        boolean z10 = this.f39251c;
                        if (uu0Var == null && !z10) {
                            i13 = -1;
                            uu0 uu0Var2 = new uu0(this, viewGroup2.getContext());
                            this.d = uu0Var2;
                            uu0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f39253g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f39253g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f39253g.setCrossfadeWithOldImage(false);
                            this.f39253g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f39259n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z10) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f39254i = z4;
                            if (z4 && this.f39256k == null) {
                                ih.j e = ih.j.e(this.d);
                                this.f39256k = e;
                                if (e != null) {
                                    e.f7600k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f39254i) {
                                this.h.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.setColorFilter(this.S);
                            } else {
                                this.h.setColorFilter(null);
                            }
                            if (messageObject == null || !messageObject.isPhoto()) {
                                i14 = i15;
                                i11 = i16;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = messageObject.messageOwner;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                                        if (closestPhotoSizeWithSize != null) {
                                            int i18 = closestPhotoSizeWithSize.size;
                                            iArr[0] = i18;
                                            if (i18 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                        } else {
                                            iArr[0] = i13;
                                        }
                                    }
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (messageObject.isGif()) {
                                            imageLocation = ImageLocation.getForDocument(messageObject.getDocument());
                                        } else {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                                            if (closestPhotoSizeWithSize2 != null) {
                                                int i19 = closestPhotoSizeWithSize2.size;
                                                iArr[0] = i19;
                                                if (i19 == 0) {
                                                    iArr[0] = i13;
                                                }
                                                imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                            } else {
                                                iArr[0] = i13;
                                            }
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                        imageLocation = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                    } else if (messageObject.getDocument() != null) {
                                        TLRPC.Document document = messageObject.getDocument();
                                        if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                            int i20 = closestPhotoSizeWithSize3.size;
                                            iArr[0] = i20;
                                            if (i20 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document);
                                        }
                                    }
                                }
                                if (imageLocation != null) {
                                    i11 = i16;
                                    i14 = i15;
                                    this.f39253g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f39253g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f39266u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f39267w = imageReceiver.getImageHeight();
                            this.f39268x = imageReceiver.getImageWidth();
                            this.f39269y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f39270z = bitmapWidth;
                            float f10 = this.f39269y;
                            float f11 = f10 / bitmapWidth;
                            float f12 = this.f39267w;
                            float f13 = this.f39268x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f39270z = (bitmapWidth / f10) * f12;
                                    this.f39269y = f12;
                                } else {
                                    this.f39269y = f11 * f13;
                                    this.f39270z = f13;
                                }
                            } else {
                                this.f39269y = f12;
                                this.f39270z = f13;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                uu0 uu0Var3 = this.d;
                                mediaController.setTextureView(uu0Var3.f39004b, uu0Var3.f39005c, uu0Var3.f39003a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f39003a.getLayoutParams();
                                this.d.f39003a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f39005c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f39003a.setLayoutParams(layoutParams);
                                }
                                this.d.f39004b.setScaleX(1.0f);
                                this.d.f39004b.setScaleY(1.0f);
                                ru0 ru0Var = this.E;
                                if (ru0Var != null) {
                                    this.d.d.setImageBitmap(ru0Var.f0().getBitmap((int) this.f39270z, (int) this.f39269y));
                                    this.d.d.s((int) this.f39270z, (int) this.f39269y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f39003a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f39252f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f39252f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.y5) {
                                    org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
                                    y5Var.f(this.d);
                                    y5Var.O = true;
                                }
                                this.f39252f.setImageCoords(this.f39266u, this.v, this.f39268x, this.f39267w);
                                this.f39252f.setAspectFit(imageReceiver.isAspectFit());
                                this.f39252f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f39253g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f39253g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f39003a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        ru0 ru0Var2 = this.E;
                        if (ru0Var2 != null) {
                            ru0Var2.w0(messageObject);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x11 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y11 = motionEvent.getY(i12);
                    float x12 = this.G - ((motionEvent.getX(i21) + x11) / 2.0f);
                    float y12 = this.H - ((motionEvent.getY(i21) + y11) / 2.0f);
                    float f15 = -x12;
                    float f16 = this.O;
                    this.J = f15 / f16;
                    this.K = (-y12) / f16;
                    e();
                } else {
                    this.L = false;
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                    d();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
                this.L = false;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                }
                d();
            }
        } else if (!this.L && motionEvent.getPointerCount() == 2) {
            this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
            float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f39264s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f39265t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f39259n) {
            ru0 ru0Var = this.E;
            if (ru0Var != null) {
                ru0Var.H(this.D);
            }
            this.f39259n = false;
        }
        uu0 uu0Var = this.d;
        if (uu0Var != null && uu0Var.getParent() != null) {
            this.f39249a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            ih.j jVar = this.f39256k;
            if (jVar != null) {
                jVar.b(this.d);
                this.f39256k = null;
            }
            ImageReceiver imageReceiver = this.f39252f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.y5) {
                    ((org.telegram.ui.Components.y5) drawable).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f39252f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f39252f.clearImage();
            this.f39252f = null;
        }
        ImageReceiver imageReceiver3 = this.f39253g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f39253g.clearImage();
            this.f39253g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.onDetachedFromWindow();
            this.h.clearImage();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.f39259n) {
            if (!this.f39251c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 25));
            this.C.addListener(new ls0(this, 9));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.nr.f27346f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f39251c && (view = this.e) != null) {
            view.invalidate();
        }
        uu0 uu0Var = this.d;
        if (uu0Var != null) {
            uu0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f39259n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.e != null) {
            motionEvent.offsetLocation(-this.f39262q, -this.f39263r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(te teVar) {
        this.F = teVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.e; view != this.f39249a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f11 += view.getLeft();
            f12 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f13 = 0.0f;
        for (View view2 = this.e; view2 != this.f39250b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f39262q = f10;
        this.f39263r = f13;
        this.f39260o = f11;
        this.f39261p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f39251c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.y5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.y5) imageReceiver.getDrawable()).f30871r0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public vu0() {
        this.f39253g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f39255j = new ih.k();
        this.f39257l = new Path();
        this.f39258m = new float[8];
        this.Q = new float[2];
        this.f39249a = null;
        this.f39250b = null;
        this.f39251c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
