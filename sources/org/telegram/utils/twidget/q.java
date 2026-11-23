package org.telegram.utils.twidget;

import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
public final class q implements y, x {
    public final int f54918a;
    public final Object f54919b;

    public q(Object obj, int i7) {
        this.f54918a = i7;
        this.f54919b = obj;
    }

    @Override
    public void a(byte[] bArr) {
        WidgetEngineBackend.i((WidgetEngineBackend) this.f54919b, bArr);
    }

    public InputStream b(String str) {
        switch (this.f54918a) {
            case 2:
                ZipFile zipFile = (ZipFile) this.f54919b;
                String str2 = WidgetEngineService.f54681b;
                ZipEntry entry = zipFile.getEntry("assets/WidgetSandbox/" + str);
                if (entry != null) {
                    return zipFile.getInputStream(entry);
                }
                throw new FileNotFoundException(str);
            default:
                String str3 = WidgetEngineService.f54681b;
                return ((AssetManager) this.f54919b).open("WidgetSandbox/" + str);
        }
    }

    @Override
    public void mo26run() {
        WidgetEngineBackend.m((y) this.f54919b);
    }
}
