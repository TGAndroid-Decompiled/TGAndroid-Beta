package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class wt0 implements Runnable {
    public final String f45550a;
    public final long f45551b;
    public final int f45552c;
    public final PhotoViewer d;

    public wt0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f45550a = str;
        this.f45551b = j10;
        this.f45552c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f35821x8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f45550a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f45550a, iArr, this.f45551b);
            if (iArr[10] != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            PhotoViewer photoViewer = this.d;
            if (iArr[0] != 0 && (!z10 || iArr[9] != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            photoViewer.f35704k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f35668g8 = videoBitrate;
            photoViewer2.f35677h8 = videoBitrate;
            if (this.d.f35704k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f35633c8 = i10;
                photoViewer3.f35651e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f35642d8 = i11;
                photoViewer4.f35660f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f35633c8, this.d.f35642d8);
                if (max > 1280) {
                    photoViewer5.Z7 = 4;
                } else if (max > 854) {
                    photoViewer5.Z7 = 3;
                } else if (max > 640) {
                    photoViewer5.Z7 = 2;
                } else {
                    photoViewer5.Z7 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i12 = this.f45552c;
                if (i12 == -1) {
                    i12 = photoViewer6.x2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f35668g8 != 0 && photoViewer7.f35627c2 != 1) {
                    Size q02 = photoViewer7.q0();
                    if (q02.getWidth() == photoViewer7.f35633c8 && q02.getHeight() == photoViewer7.f35642d8) {
                        MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), photoViewer7.f35677h8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f35642d8, photoViewer7.f35633c8, photoViewer7.f35677h8, q02.getHeight(), q02.getWidth()), false);
                    }
                }
                this.d.f35711l8 = MediaController.isH264Video(this.f45550a);
            }
            if (this.d.f35821x8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new oe0(this, this, iArr, 23));
        }
    }
}
