package com.vimeo.sample_java_model;

import org.junit.Test;

import verification.Utils;

public class NativeJavaModelExtensionWithoutAnnotationTest {

    @Test
    public void typeAdapterWasNotGenerated_NativeJavaModelExtension() throws Exception {
        Utils.verifyNoTypeAdapterGeneration(NativeJavaModelExtensionWithoutAnnotation.class);
    }

}
