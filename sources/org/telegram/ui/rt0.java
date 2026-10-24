package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class rt0 implements Runnable {
    public final String f41230a;
    public final long f41231b;
    public final int f41232c;
    public final PhotoViewer d;

    public rt0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f41230a = str;
        this.f41231b = j10;
        this.f41232c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f33760x8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f41230a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f41230a, iArr, this.f41231b);
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
            photoViewer.f33643k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f33607g8 = videoBitrate;
            photoViewer2.f33616h8 = videoBitrate;
            if (this.d.f33643k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f33572c8 = i10;
                photoViewer3.f33589e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f33581d8 = i11;
                photoViewer4.f33598f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f33572c8, this.d.f33581d8);
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
                int i12 = this.f41232c;
                if (i12 == -1) {
                    i12 = photoViewer6.x2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f33607g8 != 0 && photoViewer7.f33566c2 != 1) {
                    Size q02 = photoViewer7.q0();
                    if (q02.getWidth() == photoViewer7.f33572c8 && q02.getHeight() == photoViewer7.f33581d8) {
                        MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), photoViewer7.f33616h8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f33581d8, photoViewer7.f33572c8, photoViewer7.f33616h8, q02.getHeight(), q02.getWidth()), false);
                    }
                }
                this.d.f33650l8 = MediaController.isH264Video(this.f41230a);
            }
            if (this.d.f33760x8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new qe0(this, this, iArr, 22));
        }
    }
}
