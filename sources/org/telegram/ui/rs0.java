package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class rs0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f6 f40229a;
    public final PhotoViewer f40230b;

    public rs0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f40230b = photoViewer;
        this.f40229a = f6Var;
    }

    @Override
    public final boolean a() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z10;
        PhotoViewer photoViewer = this.f40230b;
        if (photoViewer.T4 != null || photoViewer.f33525b5 != null) {
            return true;
        }
        if (photoViewer.f33515a5 != null) {
            FileLoader fileLoader = FileLoader.getInstance(photoViewer.T);
            ImageLocation imageLocation = photoViewer.f33515a5;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = null;
            if (imageLocation == null) {
                tL_fileLocationToBeDeprecated = null;
            } else {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            String q12 = PhotoViewer.q1(imageLocation);
            if (photoViewer.f33741z5 == 0 && !photoViewer.B5) {
                z10 = false;
            } else {
                z10 = true;
            }
            File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, q12, z10);
            File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.T);
            ImageLocation imageLocation2 = photoViewer.f33515a5;
            if (imageLocation2 != null) {
                tL_fileLocationToBeDeprecated2 = imageLocation2.location;
            }
            File pathToAttach2 = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.q1(imageLocation2), false);
            if (pathToAttach.exists() || file.exists() || pathToAttach2.exists()) {
                return true;
            }
            return false;
        } else if (photoViewer.f33599j7 != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void b(int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rs0.b(int):void");
    }
}
