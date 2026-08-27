package z;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class a {
    public static int a() {
        ClassLoader classLoader = a.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            throw new IllegalStateException("Car API level file car-app-api.level not found");
        }
        try {
            String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int i10 = Integer.parseInt(line);
            if (i10 >= 1 && i10 <= 7) {
                return i10;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + line);
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }
}
