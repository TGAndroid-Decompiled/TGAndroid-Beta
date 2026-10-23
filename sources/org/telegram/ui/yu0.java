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
public class yu0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public uu0 E;
    public vu0 F;
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
    public final ViewGroup f43975a;
    public final ViewGroup f43976b;
    public final boolean f43977c;
    public xu0 d;
    public View e;
    public ImageReceiver f43978f;
    public ImageReceiver f43979g;
    public ImageReceiver h;
    public boolean f43980i;
    public final wh.g f43981j;
    public wh.f f43982k;
    public final Path f43983l;
    public final float[] f43984m;
    public boolean f43985n;
    public float f43986o;
    public float f43987p;
    public float f43988q;
    public float f43989r;
    public float f43990s;
    public float f43991t;
    public float f43992u;
    public float v;
    public float f43993w;
    public float f43994x;
    public float f43995y;
    public float f43996z;

    public yu0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f43979g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f43981j = new wh.g();
        this.f43983l = new Path();
        this.f43984m = new float[8];
        this.Q = new float[2];
        this.f43975a = viewGroup;
        this.f43976b = viewGroup2;
        this.f43977c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
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
                    if (hypot > 1.005f && !this.f43985n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f43990s = x10;
                        this.G = x10;
                        float y3 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f43991t = y3;
                        this.H = y3;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = messageObject;
                        xu0 xu0Var = this.d;
                        ViewGroup viewGroup2 = this.f43975a;
                        boolean z11 = this.f43977c;
                        if (xu0Var == null && !z11) {
                            i13 = -1;
                            xu0 xu0Var2 = new xu0(this, viewGroup2.getContext());
                            this.d = xu0Var2;
                            xu0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f43979g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f43979g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f43979g.setCrossfadeWithOldImage(false);
                            this.f43979g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f43985n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f43980i = z10;
                            if (z10 && this.f43982k == null) {
                                wh.f e = wh.f.e(this.d);
                                this.f43982k = e;
                                if (e != null) {
                                    e.f49495k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f43980i) {
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
                                    this.f43979g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f43979g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f43992u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f43993w = imageReceiver.getImageHeight();
                            this.f43994x = imageReceiver.getImageWidth();
                            this.f43995y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f43996z = bitmapWidth;
                            float f7 = this.f43995y;
                            float f10 = f7 / bitmapWidth;
                            float f11 = this.f43993w;
                            float f12 = this.f43994x;
                            float f13 = f11 / f12;
                            if (f10 != f13) {
                                if (f10 < f13) {
                                    this.f43996z = (bitmapWidth / f7) * f11;
                                    this.f43995y = f11;
                                } else {
                                    this.f43995y = f10 * f12;
                                    this.f43996z = f12;
                                }
                            } else {
                                this.f43995y = f11;
                                this.f43996z = f12;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                xu0 xu0Var3 = this.d;
                                mediaController.setTextureView(xu0Var3.f43658b, xu0Var3.f43659c, xu0Var3.f43657a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f43657a.getLayoutParams();
                                this.d.f43657a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f43659c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f43657a.setLayoutParams(layoutParams);
                                }
                                this.d.f43658b.setScaleX(1.0f);
                                this.d.f43658b.setScaleY(1.0f);
                                uu0 uu0Var = this.E;
                                if (uu0Var != null) {
                                    this.d.d.setImageBitmap(uu0Var.U().getBitmap((int) this.f43996z, (int) this.f43995y));
                                    this.d.d.s((int) this.f43996z, (int) this.f43995y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f43657a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f43978f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f43978f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.e6) {
                                    org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) drawable;
                                    e6Var.f(this.d);
                                    e6Var.R = true;
                                }
                                this.f43978f.setImageCoords(this.f43992u, this.v, this.f43994x, this.f43993w);
                                this.f43978f.setAspectFit(imageReceiver.isAspectFit());
                                this.f43978f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f43979g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f43979g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f43657a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        uu0 uu0Var2 = this.E;
                        if (uu0Var2 != null) {
                            uu0Var2.m0(messageObject);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x11 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y10 = motionEvent.getY(i12);
                    float x12 = this.G - ((motionEvent.getX(i21) + x11) / 2.0f);
                    float y11 = this.H - ((motionEvent.getY(i21) + y10) / 2.0f);
                    float f14 = -x12;
                    float f15 = this.O;
                    this.J = f14 / f15;
                    this.K = (-y11) / f15;
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
            this.f43990s = x13;
            this.G = x13;
            float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f43991t = y12;
            this.H = y12;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f43985n) {
            uu0 uu0Var = this.E;
            if (uu0Var != null) {
                uu0Var.z(this.D);
            }
            this.f43985n = false;
        }
        xu0 xu0Var = this.d;
        if (xu0Var != null && xu0Var.getParent() != null) {
            this.f43975a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            wh.f fVar = this.f43982k;
            if (fVar != null) {
                fVar.b(this.d);
                this.f43982k = null;
            }
            ImageReceiver imageReceiver = this.f43978f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.e6) {
                    ((org.telegram.ui.Components.e6) drawable).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f43978f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f43978f.clearImage();
            this.f43978f = null;
        }
        ImageReceiver imageReceiver3 = this.f43979g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f43979g.clearImage();
            this.f43979g = null;
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
        if (this.C == null && this.f43985n) {
            if (!this.f43977c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 25));
            this.C.addListener(new v70(this, 17));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.bs.f25133f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f43977c && (view = this.e) != null) {
            view.invalidate();
        }
        xu0 xu0Var = this.d;
        if (xu0Var != null) {
            xu0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f43985n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.e != null) {
            motionEvent.offsetLocation(-this.f43988q, -this.f43989r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(nh nhVar) {
        this.F = nhVar;
    }

    public final boolean i() {
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (View view = this.e; view != this.f43975a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f10 += view.getLeft();
            f11 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f12 = 0.0f;
        for (View view2 = this.e; view2 != this.f43976b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f7 += view2.getLeft();
            f12 += view2.getTop();
        }
        this.f43988q = f7;
        this.f43989r = f12;
        this.f43986o = f10;
        this.f43987p = f11;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f43977c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.e6) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.e6) imageReceiver.getDrawable()).f25888u0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public yu0() {
        this.f43979g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f43981j = new wh.g();
        this.f43983l = new Path();
        this.f43984m = new float[8];
        this.Q = new float[2];
        this.f43975a = null;
        this.f43976b = null;
        this.f43977c = true;
    }

    public void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
    }
}
