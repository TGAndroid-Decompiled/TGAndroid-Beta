package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class vt0 implements Runnable {
    public final String f39189a;
    public final long f39190b;
    public final int f39191c;
    public final PhotoViewer d;

    public vt0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f39189a = str;
        this.f39190b = j10;
        this.f39191c = i10;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        if (this.d.f31848t8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f39189a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f39189a, iArr, this.f39190b);
            if (iArr[10] != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            PhotoViewer photoViewer = this.d;
            if (iArr[0] != 0 && (!z4 || iArr[9] != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            photoViewer.f31732g8 = z10;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f31696c8 = videoBitrate;
            photoViewer2.f31705d8 = videoBitrate;
            if (this.d.f31732g8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.Y7 = i10;
                photoViewer3.f31677a8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.Z7 = i11;
                photoViewer4.f31687b8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.Y7, this.d.Z7);
                if (max > 1280) {
                    photoViewer5.V7 = 4;
                } else if (max > 854) {
                    photoViewer5.V7 = 3;
                } else if (max > 640) {
                    photoViewer5.V7 = 2;
                } else {
                    photoViewer5.V7 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i12 = this.f39191c;
                if (i12 == -1) {
                    i12 = photoViewer6.v2();
                }
                photoViewer6.U7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f31696c8 != 0 && photoViewer7.Z1 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.Y7 && p02.getHeight() == photoViewer7.Z7) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f31705d8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.Z7, photoViewer7.Y7, photoViewer7.f31705d8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f31741h8 = MediaController.isH264Video(this.f39189a);
            }
            if (this.d.f31848t8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new jf0(this, this, iArr, 20));
        }
    }
}
