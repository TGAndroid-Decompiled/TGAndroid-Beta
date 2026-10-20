package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class yr0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.d6 f43543a;
    public final PhotoViewer f43544b;

    public yr0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f43544b = photoViewer;
        this.f43543a = d6Var;
    }

    @Override
    public final boolean a() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z10;
        PhotoViewer photoViewer = this.f43544b;
        if (photoViewer.T4 != null || photoViewer.f33255b5 != null) {
            return true;
        }
        if (photoViewer.f33245a5 != null) {
            FileLoader fileLoader = FileLoader.getInstance(photoViewer.T);
            ImageLocation imageLocation = photoViewer.f33245a5;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = null;
            if (imageLocation == null) {
                tL_fileLocationToBeDeprecated = null;
            } else {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            String r12 = PhotoViewer.r1(imageLocation);
            if (photoViewer.f33471z5 == 0 && !photoViewer.B5) {
                z10 = false;
            } else {
                z10 = true;
            }
            File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, r12, z10);
            File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.T);
            ImageLocation imageLocation2 = photoViewer.f33245a5;
            if (imageLocation2 != null) {
                tL_fileLocationToBeDeprecated2 = imageLocation2.location;
            }
            File pathToAttach2 = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.r1(imageLocation2), false);
            if (pathToAttach.exists() || file.exists() || pathToAttach2.exists()) {
                return true;
            }
            return false;
        } else if (photoViewer.f33329j7 != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void b(int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yr0.b(int):void");
    }
}
